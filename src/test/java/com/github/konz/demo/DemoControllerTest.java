package com.github.konz.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {

    @Test
    void hello() {
        assertNull(new DemoController().hello());
    }
}