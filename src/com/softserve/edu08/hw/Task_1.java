package com.softserve.edu08.hw;

public class Task_1 {
}

 class FullName implements Cloneable{
    String firstName;
    String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }
 }

abstract class Person {

    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    String info() {
        return "FirstName: " + fullName.getFirstName()
                + " LastName: " + fullName.getLastName() + " Age: " + getAge();
    }

    public abstract String activity();


}
