package com.checkmaathy.codingtest.exercism;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Karl wants to keep track of a list of languages to learn on Exercism's website.
 * Karl needs to be able to add new languages, remove old ones and check if certain languages are in the list.
 * It would be very exciting if Karl wants to learn Java or Kotlin!
 */
public class KarlsLanguages<T> {

    public static void main(String[] args) {
    }

    private static List<String> languages = new ArrayList<>();

    public KarlsLanguages(List<String> languages) {
        this.languages = languages.stream().toList();
    }


    /**
     * Karl needs to know if his list of languages ever becomes empty so he can go find more to learn!
     * Define a method called isEmpty which returns true if there are no languages in the list.
     * @return
     */
    public static boolean isEmpty() {
        return languages.isEmpty();
    }

    /**
     * Karl is looking forward to learning Kotlin and Python! Help Karl get started by defining
     * a method called addLanguage which takes the language he wants to learn and adds it to the list.
     * @param language
     */
    public static void addLanguage(String language) {
        languages.add(language);
        Stream.of(languages).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Karl decided he does not want to learn Scala right now.
     * Help Karl remove it from the list by defining a method called removeLanguage which takes
     * the language he is removing and removes it from the list.
     * @param language
     */
    public static void removeLanguage(String language) {
        languages.remove(language);
        Stream.of(languages).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Karl wants to remember the first language he added to the list (that is still in the list).
     * Define a method called firstLanguage that returns the first language in the list.
     * @return
     */
    public static String firstLanguage() {
        return languages.stream().findFirst().get();
    }

    /**
     * Karl needs to know how many languages he is trying to learn.
     * Help Karl find the answer by defining a method called count which returns the number of languages in the list.
     * @return
     */
    public static int count() {
        return languages.size();
    }

    /**
     * Karl is trying to remember if he wanted to learn Python or Ruby.
     * Define a method called containsLanguage which takes the language he is asking about so Karl can find out!
     * @param language
     * @return
     */
    public static boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    /**
     * If Karl wants to learn Java or Kotlin, that is very exciting!
     * Define a method called isExciting that returns true if Karl wants to learn Java or Kotlin.
     * @return
     */
    public static boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
