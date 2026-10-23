package com.keralty.ae.security;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.ae.viewmodel.LoginRequest;
import com.keralty.ae.viewmodel.UserInfoViewModel;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/")
@RegisterRestClient(configKey="ae-usuarios")
public interface TokenAuthenticationService {

    @POST
    @Path("/Token")
    public String login(LoginRequest loginRequest);

    @POST
    @Path("/TokenAzure")
    public UserInfoViewModel loginAzure(LoginRequest loginRequest);

    @POST
    @Path("/api/Account/Logout")
    @ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
    public void logout(User user);

    @POST
    @Path("/api/Account/UserInfo")
    @ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
    public UserInfoViewModel getUserInfo();

    @POST
    @Path("/api/Account/AnonymousUserInfo")
    @Operation(hidden = true)
    public UserInfoViewModel getAnonymousUserInfo();

}
