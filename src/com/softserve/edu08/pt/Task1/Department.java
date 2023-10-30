package com.softserve.edu08.pt.Task1;

public class Department implements Cloneable{
    String name;
    Address adress;

    public Department(String name, Address adress) {
        this.name = name;
        this.adress = adress;
    }

    static class Address implements Cloneable{
        String ciy;
        String street;
        int building;

        public Address(String ciy, String street, int building) {
            this.ciy = ciy;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "ciy='" + ciy + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public Department clone() {
        try {
            Department copy = (Department) super.clone();
            copy.adress = adress.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", adress=" + adress.toString() +
                '}';
    }
}
