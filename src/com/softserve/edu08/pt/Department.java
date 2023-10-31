package com.softserve.edu08.pt;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department() {
        this.address = new Address();
    }

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
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

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.address.setCity(city);
    }

    public String getCity() {
        return this.address.getCity();
    }

    public void setStreet(String street) {
        this.address.setStreet(street);
    }

    public String getStreet() {
        return this.address.getStreet();
    }

    public void setBuilding(int building) {
        this.address.setBuilding(building);
    }

    public int getBuilding() {
        return this.address.getBuilding();
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
            Department copyOfDepartment = (Department) super.clone();
            copyOfDepartment.address = copyOfDepartment.address.clone();
            return copyOfDepartment;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public class Address implements Cloneable {
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

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
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
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}