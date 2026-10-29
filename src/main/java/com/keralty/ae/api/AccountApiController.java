package com.keralty.ae.api;

import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

import com.keralty.ae.security.TokenAuthenticationService;
import com.keralty.ae.security.User;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.LoginRequest;
import com.keralty.ae.viewmodel.UserInfoViewModel;

import io.quarkus.security.UnauthorizedException;

@Path("/")
@RequestScoped
public class AccountApiController {

    @RestClient
    TokenAuthenticationService authenticationService;

    JsonWebToken jwt; 

    public AccountApiController(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }
    
    @POST
    @Path("/Token")
    @Produces(MediaType.TEXT_PLAIN)
    public RestResponse<String> login(LoginRequest loginRequest) {
        String token = null;
        try {
        	token = authenticationService.login(loginRequest);
        } catch(Exception e) {
        	throw new UnauthorizedException();
        }
        return ResponseBuilder.ok(token, MediaType.TEXT_PLAIN_TYPE).build();
    }

    @POST
    @Path("/TokenAzure")
    public UserInfoViewModel loginAzure(LoginRequest loginRequest) {
    	return authenticationService.loginAzure(loginRequest);
    }
    
    @POST
    @Path("/api/Account/Logout")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public boolean logout(User user) {
        authenticationService.logout(user);
        return true;
    }

    @POST
    @Path("/api/Account/UserInfo")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public UserInfoViewModel getUserInfo(@Context SecurityContext sec) {
    	if (sec == null) {
    		throw new UnauthorizedException();
    	}
    	return authenticationService.getUserInfo();
    }
    
    @POST
    @Path("/api/Account/AnonymousUserInfo")
    @Operation(hidden = true)
    public UserInfoViewModel getAnonymousUserInfo() {
    	return authenticationService.getAnonymousUserInfo();
    }
}
