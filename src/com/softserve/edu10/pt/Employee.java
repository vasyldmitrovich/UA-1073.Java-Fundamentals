package com.softserve.edu10.pt;

import java.util.Objects;

class Employee implements Cloneable {
    private String name;
    private String position;
    private int salary;
    private Date dateOfBirth;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String position, int salary, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this(name);
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = new Date(dayOfBirth, monthOfBirth, yearOfBirth);
    }

    private class Date implements Cloneable{
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            if (day <= 0 || month <= 0 || year <= 0 || day > 31 || month > 12 || year > 2023) {
                throw new IllegalArgumentException("Please insert correct day of birth");
            }
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Date date = (Date) o;
            return getDay() == date.getDay() &&
                    getMonth() == date.getMonth() &&
                    getYear() == date.getYear();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getDay(), getMonth(), getYear());
        }

        @Override
        public String toString() {
            return getDay() +
                    "." + getMonth() +
                    "." + getYear();
        }

        @Override
        protected Date clone() {
            Date copy = null;
            try {
                copy =  (Date) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
            return copy;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDay(int day) {
        dateOfBirth.setDay(day);
    }

    public void setMonth(int month) {
        dateOfBirth.setMonth(month);
    }

    public void setYear(int year) {
        dateOfBirth.setYear(year);
    }

    @Override
    public String toString() {
        return "Employee " + getName() +
                ", position - " + getPosition() +
                ", salary - " + getSalary() +
                " $, date of birth  - " + getDateOfBirth();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary() &&
                getName().equals(employee.getName()) &&
                getPosition().equals(employee.getPosition()) &&
                getDateOfBirth().equals(employee.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPosition(), getSalary(), getDateOfBirth());
    }

    @Override
    protected Employee clone() {
        Employee copy = null;
        try {
            copy = (Employee) super.clone();
            copy.setDateOfBirth(this.getDateOfBirth().clone());
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
