package com.checkmaathy.codingtest.exercism;

import java.util.List;
import java.util.regex.Pattern;

/**
 * In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.
 *
 * In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name
 * is comprised of zero or more letters and underscores.
 *
 * In all cases the input string is guaranteed to be non-null.
 * Note that the clean method should treat an empty string as valid.
 */
public class SqueakyClean {

    static final List<KeyValue> replaceToValue = List.of(
            new KeyValue(" ", "_"),
            new KeyValue("0", "o"),
            new KeyValue("1", "l"),
            new KeyValue("3", "e"),
            new KeyValue("4", "a"),
            new KeyValue("7", "t"),
            new KeyValue("¡", ""),
            new KeyValue("!", "")
    );

    public static void main(String[] args) {
    }

    /**
     * Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores.
     * This also applies to leading and trailing spaces.
     * @param identifier
     * @return
     */
    static String clean(String identifier) {
        String squeakyCleanString = identifier;

        if (squeakyCleanString.contains("-")) {
            squeakyCleanString = Pattern
                    .compile("-(.)")
                    .matcher(squeakyCleanString)
                    .replaceAll(mr -> mr.group(1).toUpperCase());
        }

        for (KeyValue keyVal : replaceToValue) {
            squeakyCleanString = squeakyCleanString.replaceAll(keyVal.key, keyVal.value);
        }

        squeakyCleanString = squeakyCleanString.replaceAll("[^a-zA-Z_]*", "");

        return squeakyCleanString;
    }

    static class KeyValue {
        public KeyValue(String key, String value) {
            this.key = key;
            this.value = value;
        }

        private final String key;
        private final String value;
    }
}
