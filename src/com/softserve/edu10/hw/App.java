package com.softserve.edu10.hw;

import java.util.*;

class App {

    static void HwOne() {
        Random random = new Random();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            set1.add(random.nextInt(-10, 10));
            set2.add(random.nextInt(-10, 10));
        }
        System.out.println(set1 + "\n" + set2);

        System.out.println("Create union set:\n" + FirstHW.union(set1, set2));

        System.out.println("Create interception set:\n" + FirstHW.intersect(set1, set2));

        System.out.println("-".repeat(30));
    }

    static void HwTwo() {
        Map<String, String> personMap = new LinkedHashMap<>();

        SecondHW.fillMap(personMap);

        SecondHW.printMap(personMap);

        System.out.println("-".repeat(30));

        SecondHW.frequencyByValue(personMap);

        SecondHW.removeByFirstName(personMap);

        SecondHW.printMap(personMap);
    }

    static void HwTree (){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("George", 3));
        students.add(new Student("Alice", 3));
        students.add(new Student("Elisabeth", 2));

        System.out.println("\nOriginal list:\n" + students);

        Collections.sort(students, new Student.NameComparator());
        System.out.println("\nSort students by name in Ascending order:\n" + students);

        Collections.sort(students, new Student.NameComparator().reversed());
        System.out.println("\nSort students by name in Descending order:\n" + students);

        Collections.sort(students, new Student.CourseComparator().reversed());
        System.out.println("\nSort students by course in Descending order:\n" + students);

        System.out.println("\nPrint students by chosen course (inside method - iterator):");
        Student.printStudents(students, 3);

    }

    public static void main(String[] args) {

// HW 1 - Union && Interception
//        HwOne();

// HW 2 - person
//        HwTwo();

// HW 2 - Student
        HwTree();
    }


}
