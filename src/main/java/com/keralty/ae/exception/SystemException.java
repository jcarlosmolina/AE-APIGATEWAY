package com.keralty.ae.exception;

public class SystemException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public static final String GENERIC_EXCEPTION_CODE = "999";
<<<<<<< HEAD
    public static final String GENERIC_EXCEPTION_MESSAGE = "Estamos presentando fallas técnicas. Pruebe de nuevo pasados unos minutos";
=======
>>>>>>> bff98d212552a1340e09015d8e8df45a74c8c021

    private final String exceptionCode;

    public SystemException() {
        super();
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(String message) {
        super(message);
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(Exception e) {
        super(e);
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(Exception e, String message) {
        super(message, e);
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }
}
