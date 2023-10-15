package com.softserve.edu08.pt;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department() {
        this.address = new Address();
    }

    public Department(String name) {
        this.name = name;
        this.address = new Address();
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    private class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Address() {
        }

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address: city - " + getCity() +
                    ", street - " + getStreet() +
                    ", building - " + getBuilding();
        }

        @Override
        protected Address clone() {
            try {
                return (Address)super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String city, String street, int building) {
        this.address = new Address(city, street, building);
    }

    public void setCity(String city) {
       this.address.setCity(city);
    }

    public void setStreet(String street) {
        this.address.setStreet(street);
    }

    public void setBuilding(int building) {
        this.address.setBuilding(building);
    }

    @Override
    protected Department clone(){
        try {
            Department copy = (Department) super.clone();
            copy.address = copy.address.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Department \"" + getName() + "\", " + getAddress();
    }
}
