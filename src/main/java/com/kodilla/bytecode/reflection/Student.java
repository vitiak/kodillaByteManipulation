package com.kodilla.bytecode.reflection;

import org.apache.commons.lang3.RandomStringUtils;

public class Student {
    private String indexNumber;

    public Student(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    private void setRandomIndexNumber() {
        this.indexNumber = RandomStringUtils.randomAlphabetic(10);
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
