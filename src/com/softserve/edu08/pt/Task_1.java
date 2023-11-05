package com.softserve.edu08.pt;

public class Task_1 {
    public static void main(String[] args) {
        Department department1 = new Department(
                "IT", new Department.Address("Lviv", "Chervonoyi Kalyny", 12)
        );
        Department department2 = department1.clone();
        System.out.println(department1);
        System.out.println(department2);
        department2.name = "IT2";
        department2.address.city = "Kyiv";
        System.out.println(department1);
        System.out.println(department2);

    }
}

class Department implements Cloneable {
    String name;
    Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    static class Address implements Cloneable{
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public  Department clone()  {
        try {
            Department copy = (Department) super.clone();
            copy.address = address.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}



