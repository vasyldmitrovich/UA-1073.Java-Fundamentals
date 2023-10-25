package com.softserve.edu09.hw.task1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class TestTask2 {
    private List<Integer> collection;

    @BeforeEach
    void createCollection(){
        collection = new ArrayList<>(List.of(13, -6, -3, 7, 11, -7, 12, -4, 8, 7));
    }

     @Test
     void testCreateCollection(){
         int size = 10;
         List<Integer> collection = Task1.generateCollection(size);

         assertThat(collection)
                 .isNotNull()
                 .hasSize(size);
     }

     @Test
     void testSwapMaxAndMinElement(){
         List<Integer> expected = new ArrayList<>(List.of(-7, -6, -3, 7, 11, 13, 12, -4, 8, 7));

         Task1.swapMaxWithMin(collection);

         assertThat(collection)
                 .isNotNull()
                 .hasSize(expected.size())
                 .containsExactlyElementsOf(expected);
     }

     @Test
     void testInsertRandomThreeDigit(){
         int randomNum = 111;
         List<Integer> expected = new ArrayList<>(List.of(13, randomNum, -6, -3, 7, 11, -7, 12, -4, 8, 7));

         Task1.insertRandomThreeDigit(collection, randomNum);

         assertThat(collection)
                 .isNotNull()
                 .hasSize(expected.size())
                 .containsExactlyElementsOf(expected);
     }

    @Test
    void testInsertZero(){
        List<Integer> expected = new ArrayList<>(List.of(13, 0, -6, -3, 0, 7, 11, 0, -7, 0, 12, 0, -4, 0, 8, 7));

        Task1.insertZero(collection);

        assertThat(collection)
                .isNotNull()
                .hasSize(expected.size())
                .containsExactlyElementsOf(expected);
    }

    @Test
    void test_CopyDirectAndReversOrder_InputCollectionDoesChange(){
         int k = 4;
         List<Integer> expected = new ArrayList<>(List.of(13, -6, -3, 7, 11, -7, 12, -4, 8, 7));

         Task1.copyDirectAndReversOrder(collection, k);

         assertThat(collection)
                 .isNotNull()
                 .hasSize(expected.size())
                 .containsExactlyElementsOf(expected);
    }

    @Test
    void test_CopyDirectAndReversOrder_CorrectCopyDirect(){
        int k = 4;
        List<Integer> expectedDirect = new ArrayList<>(List.of(13, -6, -3, 7));

        TwoLists lists = Task1.copyDirectAndReversOrder(collection, k);

        assertThat(lists.directOrder())
                .isNotNull()
                .hasSize(expectedDirect.size())
                .containsExactlyElementsOf(expectedDirect);
    }

    @Test
    void test_CopyDirectAndReversOrder_CorrectCopyRevers(){
        int k = 4;
        List<Integer> expectedRevers = new ArrayList<>(List.of(7, 8, -4, 12, -7, 11));

        TwoLists lists = Task1.copyDirectAndReversOrder(collection, k);

        assertThat(lists.reversOrder())
                .isNotNull()
                .hasSize(expectedRevers.size())
                .containsExactlyElementsOf(expectedRevers);
    }

    @Nested
    class TestRemoveLastElement{
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
        void testRemoveLastEvenElement_Correct(){
            List<Integer> expected = new ArrayList<>(List.of(13, -6, -3, 7, 11, -7, 12, -4, 7));

            Task1.removeLastEvenElement(collection);

            assertThat(collection)
                    .isNotNull()
                    .hasSize(expected.size())
                    .containsExactlyElementsOf(expected);
        }

        @Test
        void testRemoveLastEvenElement_Wrong(){
            List<Integer> actual = new ArrayList<>(List.of(13, -7, -3, 7, 11, -7, 13, -5, 9, 7));

            String expectedMessage = "The paired item is not in the collection";

            Task1.removeLastEvenElement(actual);
            assertThat(outContent.toString().trim())
                    .contains(expectedMessage);

        }
    }

    @Nested
    class TestRemoveElementFollowingFirstMin{
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
        void testRemoveElementFollowingFirstMin_Correct(){
            List<Integer> expected = new ArrayList<>(List.of(13, -6, -3, 7, 11, -7, -4, 8, 7));

            Task1.removeElementFollowingFirstMin(collection);

            assertThat(collection)
                    .isNotNull()
                    .hasSize(expected.size())
                    .containsExactlyElementsOf(expected);
        }

        @Test
        void testRemoveElementFollowingFirstMin_Wrong(){
            List<Integer> actual = new ArrayList<>(List.of(13, -6, -3, 7, 11, 12, -4, 8, 7, -7));

            String expectedMessage = "The item cannot be deleted. The minimum item is the last in the collection.";

            Task1.removeElementFollowingFirstMin(actual);
            assertThat(outContent.toString().trim())
                    .contains(expectedMessage);

        }
    }
}
