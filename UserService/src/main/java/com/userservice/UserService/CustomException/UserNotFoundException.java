package com.userservice.UserService.CustomException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(){
        super();
    }

    String error;
    int httpStatus;

    public String getError() {
        return error;
    }

    public UserNotFoundException(String error, int httpStatus) {
//        super(error);
        this.error = error;
        this.httpStatus = httpStatus;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }
}
