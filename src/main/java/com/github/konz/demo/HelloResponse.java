package com.github.konz.demo;

import java.util.UUID;

public class HelloResponse {

    private final UUID id;

    public HelloResponse(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
