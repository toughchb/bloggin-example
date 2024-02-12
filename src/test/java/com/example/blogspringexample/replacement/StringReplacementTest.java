package com.example.blogspringexample.replacement;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringReplacementTest {
    private static final String BEFORE = "Hi%This%Is%Test";
    private static final String TARGET = "%";
    private static final String REPLACEMENT = " ";

    @Test
    void stringReplace() {
        String result = BEFORE.replace(TARGET, REPLACEMENT);
        System.out.println("result: " + result);
    }

    @Test
    void stringReplaceAll() {
        String result = BEFORE.replaceAll(TARGET, REPLACEMENT);
        System.out.println("result: " + result);
    }

    @Test
    void performanceTest() {
        long replaceStarted = System.nanoTime();
        BEFORE.replace(TARGET, REPLACEMENT);
        long replaceFinished = System.nanoTime();
        long replaceElapse = replaceFinished - replaceStarted;
        System.out.println("replaceElapse Time: " + replaceElapse);

        long replaceAllStarted = System.nanoTime();
        BEFORE.replaceAll(TARGET, REPLACEMENT);
        long replaceAllFinished = System.nanoTime();
        long replaceAllElapse = replaceAllFinished - replaceAllStarted;
        System.out.println("replaceAllElapse Time: " + replaceAllElapse);
    }

    @Test
    void stringReplaceAllRegex() {
        String result = "Hi%This#Is&Test".replaceAll("[%#&]", " ");
        System.out.println("result: " + result);
    }

    @Test
    void apacheStringUtilsReplace() {
        String result = StringUtils.replace(BEFORE, TARGET, REPLACEMENT);
        System.out.println("result: " + result);
    }
}
