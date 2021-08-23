package com.simple.rest.exception;

public class WebException {

    private String message;

    public WebException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public WebException setMessage(String message) {
        this.message = message;
        return this;
    }

}
