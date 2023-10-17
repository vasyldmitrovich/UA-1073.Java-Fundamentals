package com.softserve.edu08.hw.Task1;

public class App implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(new FullName("Mike", "Green"), 25) {
            @Override
            public String activity() {
                return null;
            }
        };
        Person copyOfPerson = (Person) person.clone();
        person.info();
        copyOfPerson.info();

        copyOfPerson.getFullName().setFirstName("Nick");
        copyOfPerson.getFullName().setLastName("Brown");
        copyOfPerson.setAge(37);

        person.info();
        copyOfPerson.info();
    }

}
