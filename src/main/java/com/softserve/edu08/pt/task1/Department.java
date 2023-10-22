package com.softserve.edu08.pt.task1;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Department(Department template){
        this.name = template.name;
        this.address = new Address(template.address);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Department clone() {
        try {
            Department copy = (Department) super.clone();
            copy.address = address.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Address implements Cloneable{
        private String city;
        private String street;
        private int numHouse;

        public Address(String city, String street, int numHouse) {
            this.city = city;
            this.street = street;
            this.numHouse = numHouse;
        }

        public Address(Address template){
            this.city = template.city;
            this.street = template.street;
            this.numHouse = template.numHouse;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setNumHouse(int numHouse) {
            this.numHouse = numHouse;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getNumHouse() {
            return numHouse;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", num_house=" + numHouse +
                    '}';
        }

        @Override
        public Address clone(){
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
