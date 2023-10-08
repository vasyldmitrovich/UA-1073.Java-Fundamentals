package com.softserve.edu07.pt.task1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnimalTest {
    @Test
    void testVoiceDog(){
        var dog = new Dog();
        assertEquals("Woof, woof!!!", dog.voice());
    }

    @Test
    void testVoiceCat(){
        var cat = new Cat();
        assertEquals("Meow, meow!!!", cat.voice());
    }

    @Test
    void testFeedDog(){
        var dog = new Dog();
        assertEquals("I like to eat meat.", dog.feed());
    }

    @Test
    void testFeedCat(){
        var cat = new Cat();
        assertEquals("I like to eat fish.", cat.feed());
    }
}
