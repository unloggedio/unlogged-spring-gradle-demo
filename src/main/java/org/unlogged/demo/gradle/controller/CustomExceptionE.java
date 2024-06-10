package org.unlogged.demo.gradle.controller;

public class CustomExceptionE extends BaseException {

    private long id;
    private String ex;

    public CustomExceptionE(long i, String e) {
        super(i, e);
        this.id = id;
        this.ex = ex;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
