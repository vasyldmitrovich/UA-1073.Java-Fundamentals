package com.softserve.edu8.hw.task2;

import com.softserve.edu08.hw.task1.Person;
import com.softserve.edu08.hw.task2.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestStudent {
    private Student student;

    @BeforeEach
    void createObject(){
        student = new Student(new Person.FullName("Bohdan", "Mysko"), 20, 4);
    }

    @Test
    void cloneStudentMethod_correctClone_DifferentMemoryLocation(){
        Student copyStudent = student.clone();

        assertThat(copyStudent)
                .as("Can't be empty")
                .isNotNull()
                .as("Must refer to different memory locations")
                .isNotSameAs(student);

    }

    @Test
    void cloneStudentMethod_correctClone_SameContent(){
        Student copyStudent = student.clone();

        assertThat(copyStudent)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects must be the same")
                .isEqualTo(student);
    }

    @Test
    void cloneStudentMethod_correctClone_DifferentContent(){
        Student copyStudent = student.clone();
        copyStudent.setFullName(new Person.FullName("Ivan", "Ivanov"));

        assertThat(copyStudent)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects should be different")
                .isNotEqualTo(student);
    }

    @Test
    void cloneStudentConstructor_correctClone_DifferentMemoryLocation(){
        Student copyStudent = new Student(student);

        assertThat(copyStudent)
                .as("Can't be empty")
                .isNotNull()
                .as("Must refer to different memory locations")
                .isNotSameAs(student);

    }

    @Test
    void cloneStudentConstructor_correctClone_SameContent(){
        Student copyStudent = new Student(student);

        assertThat(copyStudent)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects must be the same")
                .isEqualTo(student);
    }

    @Test
    void cloneStudentConstructor_correctClone_DifferentContent(){
        Student copyStudent = new Student(student);
        copyStudent.setFullName(new Person.FullName("Ivan", "Ivanov"));

        assertThat(copyStudent)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects should be different")
                .isNotEqualTo(student);
    }

    @Test
    void clonePersonMethod_correctClone_DifferentMemoryLocation(){
        Person person = student.clone();

        assertThat(person)
                .as("Can't be empty")
                .isNotNull()
                .as("Must refer to different memory locations")
                .isNotSameAs(student);

    }

    @Test
    void clonePersonMethod_correctClone_SameContent(){
        Person person = student.clone();

        assertThat(person)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects must be the same")
                .isEqualTo(student);
    }

    @Test
    void clonePersonMethod_correctClone_DifferentContent(){
        Person person = student.clone();
        person.setFullName(new Person.FullName("Ivan", "Ivanov"));

        assertThat(person)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects should be different")
                .isNotEqualTo(student);
    }

    @Test
    void clonePersonConstructor_correctClone_DifferentMemoryLocation(){
        Person person = new Student(student);

        assertThat(person)
                .as("Can't be empty")
                .isNotNull()
                .as("Must refer to different memory locations")
                .isNotSameAs(student);

    }

    @Test
    void clonePersonConstructor_correctClone_SameContent(){
        Person person = new Student(student);

        assertThat(person)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects must be the same")
                .isEqualTo(student);
    }

    @Test
    void clonePersonConstructor_correctClone_DifferentContent(){
        Person person = new Student(student);
        person.setFullName(new Person.FullName("Ivan", "Ivanov"));

        assertThat(person)
                .as("Can't be empty")
                .isNotNull()
                .as("The internal content of objects should be different")
                .isNotEqualTo(student);
    }

    @Test
    void testPrintActiveStudent(){
        assertThat(student.activity())
                .as("The method produces an unexpected result")
                .isEqualTo("I study at university");
    }

    @Test
    void testPrintInfoStudent(){
        assertThat(student.info())
                .as("The resulting string does not match the expected pattern.")
                .containsPattern("First name: .*, Last name: .*, Age: .*, Course: .*");
    }

    @Test
    void testPrintInfoPerson(){
        Person person = new Student(student);

        assertThat(person.info())
                .as("The resulting string does not match the expected pattern.")
                .containsPattern("First name: .*, Last name: .*, Age: .*");
    }
}
