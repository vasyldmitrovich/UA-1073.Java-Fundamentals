package com.softserve.edu07.pt;

import com.softserve.edu07.pt.pt1.*;
import com.softserve.edu07.pt.pt2.*;

import java.util.Random;

class App {


    public static void main(String[] args) {

        Random random = new Random();

// Pt 1  - Cat and Dog_____________________________________________________________________

        Animal[] pets = new Animal[10];
        for (int i = 0; i < pets.length; i++) {
            pets[i] = MyRandomGenerator.getRandomAnimal(random.nextInt(0, 2));
        }
        for (Animal animal : pets) {
            animal.voice();
            animal.feed();
            System.out.println("---------------");
        }


// Pt 2  - Person __________________________________________________________________________

        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = MyRandomGenerator.getRandomPerson(random.nextInt(1, 4));
        }
        for (Person person : persons) {
            person.print();
            if (person instanceof Stuff) {
                ((Stuff) person).salary();
            }
            System.out.println("-------------");
        }
    }
}



