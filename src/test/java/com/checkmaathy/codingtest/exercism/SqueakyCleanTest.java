package com.checkmaathy.codingtest.exercism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqueakyCleanTest {

    @Test
    void clean() {
        assertEquals("testing___string", SqueakyClean.clean("testing   string"));
    }
}