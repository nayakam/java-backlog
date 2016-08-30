package com.java.annotation.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ClassPreamble(
        author = "Peter Parker",
        date = "3/17/2010",
        currentRevision = 5,
        lastModified = "4/12/20012",
        lastModifiedBy = "Rummble Fish",
        // Note array notation
        reviewers = {"TS", "ST", "Java"}
)
public class AnnotationGeneration {

    static Logger logger = LoggerFactory.getLogger(AnnotationGeneration.class);

    /** Predefined Annotation Types */

    @Deprecated
    public static void deprecatedMethod() {
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    public static void useDeprecatedMethod() {
        // deprecation warning
        // - suppressed
        List tempList = new ArrayList();
        tempList.add(1);
        tempList.add("Test");
        AnnotationGeneration.deprecatedMethod();
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    @SafeVarargs // Not actually safe!
    static void varArgsMethod(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
    }

    @Schedule(dayOfMonth = "last")
    @Schedule(dayOfWeek = "Fri", hour = 23)
    public void doPeriodicCleanup() {

    }

    public static void main(String[] args) {
        logger.info("Test");
        AnnotationGeneration.useDeprecatedMethod();
    }
}