package org.lessons.java.valutazioni;

import java.util.ArrayList;

public class Main {

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        for (int i = 10; i <= 20; i++)
            studentArrayList.add(new Student(i, getRandomNumber(0, 100), getRandomNumber(0, 5)));

        Course course = new Course(studentArrayList);

        for (Student student : course.getStudentArrayList())
            if (student.isPassed())
                System.out.println(student.toString());
    }
}