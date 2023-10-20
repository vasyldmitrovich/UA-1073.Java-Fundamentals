package com.softserve.edu09.hw;

import com.softserve.edu09.RandomListOf10Integers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {

    public static void main(String[] args) {

// HW 1 you can set length of Collection? bounds of random generation below (for better check of my code)
        int length = 10;
        int origin = -10;
        int bound = 10;

        List<Integer> myCollection = RandomListOf10Integers.createAndFillRandomLinkedList(length, origin, bound);
        System.out.println("Create and fill randomly new collection:\n" + myCollection);

        Hw1.swapMaxAndMin(myCollection);
        System.out.println("After swap min and max values:\n" + myCollection);

//insert random three-digit number (I chose positive three-digit numbers)

        Hw1.setThreeDigitNumberBeforeMin(myCollection);
        System.out.println("After inserting three-digits number before first negative:\n" + myCollection);

        Hw1.insertZeroBetweenAllElementsWithDifferentSigns(myCollection);
        System.out.println("After inserting a zero between all neighboring elements with different signs:\n" +
                myCollection);

// You can change k (safety from 0 to 10)
        int k = 4;
        List<Integer> list1 = Hw1.copyWithRule(myCollection, k);
        System.out.println("After copying first " + k + " elements in direct order, and the rest - in reverse order:\n" +
                "list1 - " + list1);

        Hw1.removeLastEvenElement(myCollection);
        System.out.println("After removing last even element:\n" + myCollection);

        Hw1.removeElementFollowingTheFirstMinimum(myCollection);

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//Hw2

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Benjamin", 1, 1, RandomListOf10Integers.fill()));
        students.add(new Student("Dwight", 1, 1, RandomListOf10Integers.fill()));
        students.add(new Student("George", 2, 1, RandomListOf10Integers.fill()));
        students.add(new Student("Bill", 2, 1, RandomListOf10Integers.fill()));
        students.add(new Student("Joe", 1, 2, RandomListOf10Integers.fill()));
        students.add(new Student("John", 1, 2, RandomListOf10Integers.fill()));
        students.add(new Student("Barack", 2, 2, RandomListOf10Integers.fill()));
        students.add(new Student("Thomas", 2, 2, RandomListOf10Integers.fill()));
        students.add(new Student("Woodrow", 1, 3, RandomListOf10Integers.fill()));
        students.add(new Student("Andrew", 2, 3, RandomListOf10Integers.fill()));

        System.out.println(students);

        StudentService.removeGradeLess3(students);
        System.out.println("After removing\n" + students);


        Scanner sc = new Scanner(System.in);
        System.out.println("Please input course (from 1 to 3):");
        int num = sc.nextInt();
        sc.nextLine();
        StudentService.printStudents(students, num);
    }
}
