package com.kodilla.bytecode.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionStudentTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        Student student = new Student("abcdef") ;
        Field indexNumberField = Student.class.getDeclaredField("indexNumber");
        indexNumberField.setAccessible(true);

        String value = (String)indexNumberField.get(student);
        System.out.println(value);

        Method setIndexNumberMethod
                = Student.class.getDeclaredMethod("setRandomIndexNumber", null);

        setIndexNumberMethod.setAccessible(true);
        setIndexNumberMethod.invoke(student);
        System.out.println(student.getIndexNumber());

    }
}
