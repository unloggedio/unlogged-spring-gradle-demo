package org.unlogged.demo.gradle.controller;

public class BaseException extends RuntimeException {

    private long id;
    private String message;

    public BaseException(long id, String message) {
        super(message);
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
