package com.softserve.edu08.pt;

class App {

    public static void main(String[] args) {


// Pt 1 - Departments
        Department department1 = new Department();
        System.out.println("Step1 - create empty department object\n" + department1 +
                "\n\nStep2 - use methods to set name and city of our department");

        department1.setName("Security");
        department1.setCity("Kyiv");
        System.out.println(department1 +
                "\n\nStep3 - finalize address of our department with street and building");

        department1.setStreet("Shevchenka");
        department1.setBuilding(15);
        System.out.println(department1 +
                "\n\nStep4 - clone our department with deep clone() method");

        // now try to make deep clone of department1

        Department department2 = department1.clone();
        System.out.println(department2 +
                "\n\nStep5 - change fields in our clone copy and print both departments");

        // let's change some fields in department2

        department2.setAddress("Lviv", "Ploshcha rynok", 1);
        department2.setName("IT");

        // check department1  &  department2 to find are we correctly create deep clone() method

        System.out.println("Our original department -" + department1);
        System.out.println("Our clone department -" + department2);

    }
}
