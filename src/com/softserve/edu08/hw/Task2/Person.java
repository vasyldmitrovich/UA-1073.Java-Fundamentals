package com.softserve.edu08.hw.Task2;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String info() {
        return "I am a person. My name is " + name;
    }

    public String activity() {
        return "I am active";
    }
}

    class Student extends Person {
        private int course;

        public Student(String name, int course) {
            super(name);
            this.course = course;
        }

        @Override
        public String info() {
            return super.info() + ". I am a student, and I am taking course " + course;
        }

        @Override
        public String activity() {
            return "I study at university";
        }
    }

