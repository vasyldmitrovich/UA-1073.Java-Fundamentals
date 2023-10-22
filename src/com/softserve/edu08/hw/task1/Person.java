package com.softserve.edu08.hw.task1;

public abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;

    protected Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    protected Person(Person template){
        this.age = template.age;
        this.fullName = new FullName(template.fullName);
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    public abstract String activity();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return fullName.equals(person.fullName);
    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    protected Person clone() {
        try {
            Person copy = (Person) super.clone();
            copy.fullName = fullName.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public FullName(FullName template) {
            this.firstName = template.firstName;
            this.lastName = template.lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FullName copyFullName = (FullName) o;

            if (!firstName.equals(copyFullName.firstName)) return false;
            return lastName.equals(copyFullName.lastName);
        }

        @Override
        public int hashCode() {
            int result = firstName.hashCode();
            result = 31 * result + lastName.hashCode();
            return result;
        }

        @Override
        protected FullName clone() {
            try {
                return (FullName) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
