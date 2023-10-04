package com.softserve.edu05.apptest;

/*<<<<<<< HEAD

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
=======
import org.junit.*;
>>>>>>> b5dcf80 (Add jUnit tests)

public class CalcTest {
    private static Calc calc;

<<<<<<< HEAD
    @BeforeAll
=======
    @BeforeClass
>>>>>>> b5dcf80 (Add jUnit tests)
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        calc = new Calc();
    }

<<<<<<< HEAD
    @AfterAll
=======
    @AfterClass
>>>>>>> b5dcf80 (Add jUnit tests)
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

<<<<<<< HEAD
    @BeforeEach
=======
    @Before
>>>>>>> b5dcf80 (Add jUnit tests)
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

<<<<<<< HEAD
    @BeforeEach
=======
    @Before
>>>>>>> b5dcf80 (Add jUnit tests)
    public void setUp2() throws Exception {
        System.out.println("\t@Before setUp2()");
    }

<<<<<<< HEAD
    @AfterEach
=======
    @After
>>>>>>> b5dcf80 (Add jUnit tests)
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

<<<<<<< HEAD
    @Test
    public void testException() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            System.out.println("\t\t@Test testException()");
            int i = 0;
            i = 10 / i;
            System.out.println("\t\t\ti = " + i);
        });

=======
    @Test(expected = ArithmeticException.class)
    public void testException() {
        System.out.println("\t\t@Test testException()");
        int i = 0;
        i = 10 / i;
        System.out.println("\t\t\ti = " + i);
>>>>>>> b5dcf80 (Add jUnit tests)
    }

    @Test
    public void testAdd1() {
        System.out.println("\t\t@Test testAdd1()");
        //Assert.fail("Not yet implemented");


        //int i = 0;
        double i = 0;
        i = 10 / i;
        System.out.println("\t\t\ti = " + i);
//        throw new RuntimeException("Hahaha");


        Calc calc = new Calc();
        double actual;
        double expected;

        actual = calc.add(4, 5);
        expected = 9.0001;

<<<<<<< HEAD
        assertEquals(expected, actual, 0.001);
=======
        Assert.assertEquals(expected, actual, 0.001);
>>>>>>> b5dcf80 (Add jUnit tests)
        System.out.println("\t\t@Test testAdd1() - work correct");
    }

    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd2()");
        //
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        actual = calc.add(4, 6);
        expected = 10;
        //
<<<<<<< HEAD
        assertEquals(expected, actual, 0.001);
=======
        Assert.assertEquals(expected, actual, 0.001);
>>>>>>> b5dcf80 (Add jUnit tests)
    }

    @Test
    public void testDiv1() {
        System.out.println("\t\t@Test testDiv1()");
        //
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        actual = calc.div(20, 4);
        expected = 5;
        //
<<<<<<< HEAD
        assertEquals(expected, actual, 0.001);
=======
        Assert.assertEquals(expected, actual, 0.001);
>>>>>>> b5dcf80 (Add jUnit tests)
    }

    @Test
    public void testDiv2() {
        System.out.println("\t\t@Test testDiv2()");
        //
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        actual = calc.div(20, 8);
        expected = 2.5;
        //
<<<<<<< HEAD
        assertEquals(expected, actual, 0.001);
=======
        Assert.assertEquals(expected, actual, 0.001);
>>>>>>> b5dcf80 (Add jUnit tests)
    }

}

