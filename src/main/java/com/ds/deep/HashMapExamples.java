package com.ds.deep;

import java.util.HashMap;

public class HashMapExamples {
    private static class Person {
        private final String name;
        private final int day;
        private final int month;
        private final int year;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public int hashCode() {
            System.out.println((name.hashCode() << 16) ^ (day << 12) ^ (month << 8) ^ year);
            return (name.hashCode() << 16) ^ (day << 12) ^ (month << 8) ^ year;
        }
    }

    public static void main(String[] args) {
        Person p = new Person("Deep", 3,7,1989);
        HashMap<Integer, Person> map = new HashMap<>();
        map.put(p.hashCode(), p);
        System.out.println("p.name.hashCode() = " + p.name.hashCode());
        System.out.println("p.name.hashCode() = " + (p.name.hashCode() << 16));
    }

}