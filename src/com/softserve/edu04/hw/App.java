package com.softserve.edu04.hw;

public class App {

    public static void main(String[] args) {

        // HW1 - Float numbers

//        FloatNumbers.checkNumbers();

        // HW2 - Three Integers

//        ThreeIntegers.minAndMax();

        //HW3 - HTTP errors

//        HTTPError.getNameByNumber();

        //HW4 - Faculty

//        Faculty f = Faculty.createFaculty();
//        System.out.println(f);


        // HW4 (рефакторинг ) - у мене питання, у методі test (наведений нижче) я хотів з консолі зчитати текст
        // потім його toUpperCase, прогнати через світч і згенерувати об"єкт.
        // але у мене сканер в такій інтерпретаціїї взагалі не працює, можете пояснити будь-ласка чому.
//        Faculty f = Faculty.test();
//        System.out.println(f);

        // HW 5 - Dogs

        Dog a = new Dog("Alice", 4, Dog.Breed.BEAGLE);
        Dog b = new Dog("Ted", 7, Dog.Breed.BULLDOG);
        Dog c = new Dog("Alice", 3, Dog.Breed.LABRADOR);
        Dog.oldestDog(a, b, c);
        Dog.sameName(a, b, c);
    }
}
