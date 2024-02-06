package com.checkmaathy.codingtest.exercism;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KarlsLanguagesTest {

    private static final String SWIFT_LANG = "Swift";
    private static final String GO_LANG = "Go";
    private static final String RUST_LANG = "Rust";
    private static final String KOTLIN_LANG = "Kotlin";
    private static final String JAVA_LANG = "Java";


    @Test
    @DisplayName("The isEmpty method returns true when the list contains no languages")
    void isEmpty() {
        new KarlsLanguages(Collections.emptyList());
        assertTrue(KarlsLanguages.isEmpty());
    }

    @Test
    @DisplayName("The isEmpty method returns false after adding a language to the list")
    void nonEmpty() {
        new KarlsLanguages(List.of(SWIFT_LANG));
        assertFalse(KarlsLanguages.isEmpty());
    }

    @Test
    @DisplayName("The removeLanguage method correctly removes a language from the list")
    void removeLanguage() {
        new KarlsLanguages(List.of(GO_LANG));
        assertTrue(KarlsLanguages.containsLanguage(GO_LANG));

        KarlsLanguages.removeLanguage(GO_LANG);
        assertFalse(KarlsLanguages.containsLanguage(GO_LANG));
    }

    @Test
    @DisplayName("The firstLanguage method returns the first language that was added to the list")
    void firstLanguage() {
        new KarlsLanguages(List.of(RUST_LANG));
        assertFalse(KarlsLanguages.isEmpty());
        assertEquals(RUST_LANG, KarlsLanguages.firstLanguage());
    }

    @Test
    @DisplayName("The count method returns the number of languages in the list")
    void count() {
        new KarlsLanguages(List.of(RUST_LANG, SWIFT_LANG, GO_LANG));
        assertEquals(3, KarlsLanguages.count());
    }

    @Test
    @DisplayName("The count method returns 0 when the list is empty")
    void countEmpty() {
        new KarlsLanguages(Collections.emptyList());
        assertEquals(0, KarlsLanguages.count());
    }

    @Test
    @DisplayName("The containsLanguage method returns true when the language is in the list")
    void containsLanguage_True() {
        new KarlsLanguages(List.of(RUST_LANG));
        assertTrue(KarlsLanguages.containsLanguage(RUST_LANG));
    }

    @Test
    @DisplayName("The containsLanguage method returns false when the language is not in the list")
    void containsLanguage_False() {
        new KarlsLanguages(Collections.emptyList());
        assertFalse(KarlsLanguages.containsLanguage(SWIFT_LANG));
    }

    @Test
    @DisplayName("The isExciting method returns true when the list contains Kotlin")
    void isExciting_True_Kotlin() {
        new KarlsLanguages(List.of(RUST_LANG, KOTLIN_LANG));
        assertTrue(KarlsLanguages.isExciting());
    }

    @Test
    @DisplayName("The isExciting method returns true when the list contains Java")
    void isExciting_True_Java() {
        new KarlsLanguages(List.of(RUST_LANG, JAVA_LANG));
        assertTrue(KarlsLanguages.isExciting());
    }

    @Test
    @DisplayName("The isExciting method returns false when the list contains neither Java nor Kotlin")
    void isExciting_False() {
        new KarlsLanguages(List.of(RUST_LANG, SWIFT_LANG));
        assertFalse(KarlsLanguages.isExciting());
    }
}