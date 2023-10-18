package com.softserve.edu09.hw.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class TestUniversity {
    private University university;

    @BeforeEach
    void createStudentList(){
        Set<Student> students = new HashSet<>();

        students.add(new Student("Ivan", "KN", 3, new ArrayList<>(List.of(5,3,4,2,3,4,2,5))));
        students.add(new Student("Kolya", "IPZ", 4, new ArrayList<>(List.of(5,3,5,4,5,4,4))));
        students.add(new Student("Ilia", "PP", 2, new ArrayList<>(List.of(5,3,4,2))));
        students.add(new Student("Anna", "PP", 4, new ArrayList<>(List.of(2,2,2,2,2,4,3))));
        students.add(new Student("Petro", "TT", 3, new ArrayList<>(List.of(5,5,5,4,4,5))));
        students.add(new Student("Olya", "IPZ", 3, new ArrayList<>(List.of(4,4,3,2,1,5,4))));
        students.add(new Student("Emma", "IPZ", 2, new ArrayList<>(List.of(1,2,3,2,2,4,3))));

        university = new University(students);
    }

    @Test
    void testCreateEmptyUniversityAndSetData(){
        int expectedSize = 5;
        University university = new University();

        university.addStudent(new Student("Ivan", "KN", 3, new ArrayList<>(List.of(5,3,4,2,3,4,2,5))));
        university.addStudent(new Student("Kolya", "IPZ", 4, new ArrayList<>(List.of(5,3,5,4,5,4,4))));
        university.addStudent(new Student("Ilia", "PP", 2, new ArrayList<>(List.of(5,3,4,2))));
        university.addStudent(new Student("Petro", "TT", 3, new ArrayList<>(List.of(5,5,5,4,4,5))));
        university.addStudent(new Student("Olya", "IPZ", 3, new ArrayList<>(List.of(4,4,3,2,1,5,4))));

        assertThat(university.getStudents())
                .isNotNull()
                .hasSize(expectedSize);
    }

    @Test
    void testRemoveStudent(){
        Student student = new Student("Ivan", "KN", 3, new ArrayList<>(List.of(5,3,4,2,3,4,2,5)));
        int expectedSize = university.getStudents().size() - 1;

        university.removeStudent(student);

        assertThat(university.getStudents())
                .isNotNull()
                .hasSize(expectedSize)
                .doesNotContain(student);
    }

    @Test
    void testRemoveStudentsBelowAverage(){
        University expected = new University();

        expected.addStudent(new Student("Ivan", "KN", 3, new ArrayList<>(List.of(5,3,4,2,3,4,2,5))));
        expected.addStudent(new Student("Kolya", "IPZ", 4, new ArrayList<>(List.of(5,3,5,4,5,4,4))));
        expected.addStudent(new Student("Ilia", "PP", 2, new ArrayList<>(List.of(5,3,4,2))));
        expected.addStudent(new Student("Petro", "TT", 3, new ArrayList<>(List.of(5,5,5,4,4,5))));
        expected.addStudent(new Student("Olya", "IPZ", 3, new ArrayList<>(List.of(4,4,3,2,1,5,4))));

        university.removeStudentsBelowAverage();

        assertThat(university.getStudents())
                .isNotNull()
                .hasSize(expected.getStudents().size())
                .containsExactlyElementsOf(expected.getStudents());
    }

    @Nested
    class TestPrintInfoStudents{
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final PrintStream originalOut = System.out;

        @BeforeEach
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }

        @AfterEach
        public void restoreStreams() {
            System.setOut(originalOut);
        }

        @Test
        void testPrintInfo_Correct(){
            String expectedMessage = """
                    Name: Olya
                    Name: Ivan
                    Name: Petro""";

            university.printStudents(3);

            assertThat(outContent.toString().trim())
                    .contains(expectedMessage);
        }

        @Test
        void testPrintInfo_Wrong(){
            String expectedMessage = "Nothing was found for your search";

            university.printStudents(1);

            assertThat(outContent.toString().trim())
                    .contains(expectedMessage);

        }
    }
}
