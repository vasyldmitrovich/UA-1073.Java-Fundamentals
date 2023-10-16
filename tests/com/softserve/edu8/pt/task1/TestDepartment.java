package com.softserve.edu8.pt.task1;

import com.softserve.edu08.pt.task1.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestDepartment {
    @Test
    void testCorrectCloneMethod(){
        Department unexpected = new Department("IT", new Department.Address("Київ", "Хрещатик", 5));
        Department copy = unexpected.clone();
        copy.getAddress().setCity("Львів");

        Assertions.assertNotEquals(unexpected.getAddress().getCity(), copy.getAddress().getCity());
    }

    @Test
    void testCorrectCloneConstructor(){
        Department unexpected = new Department("IT", new Department.Address("Київ", "Хрещатик", 5));
        Department copy = new Department(unexpected);
        copy.getAddress().setCity("Львів");

        Assertions.assertNotEquals(unexpected.getAddress().getCity(), copy.getAddress().getCity());
    }
}
