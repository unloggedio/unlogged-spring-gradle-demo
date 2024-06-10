package org.unlogged.demo.gradle.controller;

import lombok.SneakyThrows;

public class STT {
    @SneakyThrows
    public String throwSneaky() {
        if (true) {
            throw new CustomExceptionE(200, "E");
        }
        return "e";
    }
}
