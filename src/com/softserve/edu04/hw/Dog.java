package com.softserve.edu04.hw;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog () {
        this("N/A", Breed.NONE, 0);
    }

    public Dog (String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static boolean checkUniqueName(Dog dog1, Dog dog2, Dog dog3) {
        boolean hasUniqueName = dog1.isUniqueName(dog2);

        if (hasUniqueName) {
            hasUniqueName = dog2.isUniqueName(dog3);
        }

        return hasUniqueName;
    }

    public static Dog findOldestDog(Dog[] dogs) {
        Dog oldestDog = null;
        for (Dog dog : dogs) {
            if (oldestDog == null || oldestDog.isOlder(dog)) {
                oldestDog = dog;
            }
        }

        return oldestDog;
    }

    public boolean isOlder(Dog dog){
        return age > dog.getAge();
    }
    public boolean isUniqueName(Dog dog) {
        return !name.equals(dog.getName());
    }

    public void printInfo () {
        String info = "Dog's name is " + name + '\n' + "Dog's breed is "+ breed.getName();
        System.out.println(info);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Breed getBreed () {
        return breed;
    }

    public void setBreed (Breed breed) {
        this.breed = breed;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}

enum Breed {
    NONE("No Breed"),
    LABRADOR_RETRIEVER("Labrador Retriever"),
    GERMAN_SHEPHERD("German Shepherd"),
    GOLDEN_RETRIEVER("Golden Retriever"),
    FRENCH_BULLDOG("French Bulldog"),
    BEAGLE("Beagle"),
    BULL_TERRIER("Bull Terrier"),
    POODLE("Poodle"),
    BOXER("Boxer"),
    DACHSHUND("Dachshund"),
    CHIHUAHUA("Chihuahua");

    final String name;

    Breed(String name) {
        this.name=name;
    }

    public String getName () {
        return name;
    }
}
