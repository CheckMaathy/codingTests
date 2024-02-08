package com.checkmaathy.codingtest.exercism;

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

    public static void main(String[] args) {
    }

    /**
     * Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores.
     * This also applies to leading and trailing spaces.
     * @param identifier
     * @return
     */
    static String clean(String identifier) {
        var squeakyCleanString = identifier.replaceAll(" ", "_");

        return squeakyCleanString;
    }
}
