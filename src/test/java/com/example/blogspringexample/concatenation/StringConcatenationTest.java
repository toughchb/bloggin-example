package com.example.blogspringexample.concatenation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.StringJoiner;

public class StringConcatenationTest {

    @Test
    void plusOperator() {
        String strSrc = "SourceString";
        String strTgt = "TargetString";

        String resultString = strSrc + strTgt;
        System.out.println("resultString = " + resultString);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 1000, 10000})
    void plusOperatorPerformTest(int iterSize) {
        String result = "";
        long replaceStarted = System.nanoTime();
        for (int i = 0; i < iterSize; i++) {
            result += "data";
        }
        long replaceFinished = System.nanoTime();
        long replaceElapse = replaceFinished - replaceStarted;
        System.out.println("replaceElapse Time: " + replaceElapse);
    }

    @Test
    void concatTest() {
        String strSrc = "SourceString";
        String strTgt = "TargetString";

        String resultString = strSrc.concat(strTgt);
        System.out.println("resultString = " + resultString);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 1000, 10000})
    void concatPerformTest(int iterSize) {
        String result = "";
        long replaceStarted = System.nanoTime();
        for (int i = 0; i < iterSize; i++) {
            result = result.concat("data");
        }
        long replaceFinished = System.nanoTime();
        long replaceElapse = replaceFinished - replaceStarted;
        System.out.println(iterSize + ": replaceElapse Time: " + replaceElapse);
    }

    @Test
    void formatTest() {
        String format = "%s%s";
        String resultString = String.format(format, "InputString1", "InputString2");
        System.out.println("resultString = " + resultString);
    }

    @Test
    void joinTest() {
        String resultString = String.join(",", "str1", "str2", "str3", "str4", "str5");
        System.out.println("resultString = " + resultString);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 1000, 10000})
    void joinPerformTest(int iterSize) {
        String result = "";
        long replaceStarted = System.nanoTime();
        for (int i = 0; i < iterSize; i++) {
            result = String.join("", result, "data");
        }
        long replaceFinished = System.nanoTime();
        long replaceElapse = replaceFinished - replaceStarted;
        System.out.println("replaceElapse Time: " + replaceElapse);
    }

    @Test
    void stringJoinerTest() {
        String delim = ","; //구분자
        StringJoiner joiner = new StringJoiner(delim);
        joiner.add("str1");
        joiner.add("str2");
        String resultString = joiner.toString();
        System.out.println("resultString = " + resultString);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 1000, 10000})
    void stringJoinerPerformTest(int iterSize) {
        StringJoiner joiner = new StringJoiner("");
        long replaceStarted = System.nanoTime();
        for (int i = 0; i < iterSize; i++) {
            joiner.add("data");
        }
        String result = joiner.toString();
        long replaceFinished = System.nanoTime();
        long replaceElapse = replaceFinished - replaceStarted;
        System.out.println(iterSize + ": replaceElapse Time: " + replaceElapse);
    }

    @Test
    void stringBuilderTest() {
        StringBuilder builder = new StringBuilder();
        builder.append("str1");
        builder.append("str2");
        String resultString = builder.toString();
        System.out.println("resultString = " + resultString);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 1000, 10000})
    void stringBuilderPerformTest(int iterSize) {
        StringBuilder builder = new StringBuilder();
        long replaceStarted = System.nanoTime();
        for (int i = 0; i < iterSize; i++) {
            builder.append("data");
        }
        String result = builder.toString();
        long replaceFinished = System.nanoTime();
        long replaceElapse = replaceFinished - replaceStarted;
        System.out.println("replaceElapse Time: " + replaceElapse);
    }

    @Test
    void stringBufferTest() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("str1");
        buffer.append("str2");
        String resultString = buffer.toString();
        System.out.println("resultString = " + resultString);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 1000, 10000})
    void stringBufferPerformTest(int iterSize) {
        StringBuffer buffer = new StringBuffer();
        long replaceStarted = System.nanoTime();
        for (int i = 0; i < iterSize; i++) {
            buffer.append("data");
        }
        String result = buffer.toString();
        long replaceFinished = System.nanoTime();
        long replaceElapse = replaceFinished - replaceStarted;
        System.out.println("replaceElapse Time: " + replaceElapse);
    }
}
