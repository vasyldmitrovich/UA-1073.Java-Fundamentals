package com.softserve.edu08.pt.task1;

public class Department implements Cloneable {
    private String field;
    private Address address;

    public Department (String field, String city, String street, int buildings) {
        this.field = field;
        this.address = new Address(city, street, buildings);
    }

    @Override
    protected Object clone () throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();

        return copyOfDepartment;
    }

    public class Address implements Cloneable {
        private String city;
        private String street;
        private int buildings;

        public Address (String city, String street, int buildings) {
            this.city = city;
            this.street = street;
            this.buildings = buildings;
        }

        @Override
        protected Object clone () throws CloneNotSupportedException {
            return super.clone();
        }

        public void setCity (String city) {
            this.city = city;
        }

        @Override
        public String toString () {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", buildings=" + buildings +
                    '}';
        }
    }

    public String getField () {
        return field;
    }

    public void setField (String field) {
        this.field = field;
    }

    public Address getAddress () {
        return address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    @Override
    public String toString () {
        return "Department{" +
                "field='" + field + '\'' +
                ", address=" + address +
                '}';
    }
}
