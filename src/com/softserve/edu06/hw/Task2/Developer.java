package com.softserve.edu06.hw.Task2;


    public class Developer extends Employee {
        private String position;

        public String getPosition() {
            return position;
        }


        public Developer(String name, int age, double salary, String position) {
            super(name, age, salary);
            this.position = position;
        }

        @Override
        public void allInfo() {
            super.allInfo();
            System.out.println("Position: " + position);
        }


        public String reportDev() {
            return String.format(("Name: " + getName() + ", Age: " + getAge()
                    + " Salary: " + getSalary() + " Position: " + getPosition()));
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "position='" + getPosition() + '\'' +
                    ", name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", salary=" + getSalary() +
                    '}';
        }
    }

