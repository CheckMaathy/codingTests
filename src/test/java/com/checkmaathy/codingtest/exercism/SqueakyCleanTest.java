package com.checkmaathy.codingtest.exercism;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqueakyCleanTest {

    @Test
    @DisplayName("The clean method replaces whitespaces with underscores in the middle of the string")
    void clean_underscores() {
        assertEquals("testing___string", SqueakyClean.clean("testing   string"));
    }

    @Test
    @DisplayName("The clean method replaces whitespaces with underscores in the middle of the string")
    void clean_numbers() {
        assertEquals("testing___string", SqueakyClean.clean("73s7ing   s7ring"));
    }

    @Test
    @DisplayName("The clean method converts leetspeak to normal text after replacing numbers with chars")
    public void leetspeak_to_normal_text() {
        assertEquals("Hello_World", SqueakyClean.clean("H3ll0 W0rld"));
    }

    @Test
    @DisplayName("The clean method converts leetspeak to normal text with spaces and special characters")
    public void leetspeak_to_normal_text_with_spaces_and_special_characters() {
        assertEquals("leetspeak_is_fun", SqueakyClean.clean("¡1337sp34k is fun!"));
    }

    @Test
    @DisplayName("The clean method returns a string in camel case and replaces leading and trailing whitespaces")
    public void kebab_to_camel_case_and_spaces() {
        assertEquals("_helloWorld_", SqueakyClean.clean(" hello-world "));
    }

    @Test
    @DisplayName("The clean method removes all characters that are not letters")
    public void special_characters() {
        assertEquals("ab", SqueakyClean.clean("a$#.b"));
    }

    @Test
    @DisplayName("The clean method returns a string in camel case after removing a dash and replaces a whitespace")
    public void kebab_to_camel_case_and_number() {
        assertEquals("aC_", SqueakyClean.clean("a-C "));
    }
}