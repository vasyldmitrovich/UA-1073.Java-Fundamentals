package com.softserve.edu03.hw.Task3;

    public class Person {//Move this class to file Person.java
        private String firstName;
        private String lastName;
        private int birthYear;

        //Do not correct order method in this class, please read java convention
        public int getAge() {
            int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
            return currentYear - birthYear;
        }

        public Person() {}
        public void changeName(String fn, String ln) {
            this.firstName = fn;
            this.lastName = ln;
        }

        public String output() {
            return this.toString();
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Person(String firstName, String lastName, int birthYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        @Override
        public String toString() {
            return "Person: " +
                    "First Name = '" + firstName + '\'' +
                    ", Last Name = '" + lastName + '\'' +
                    ", birth Year = " + birthYear;
        }
    }

