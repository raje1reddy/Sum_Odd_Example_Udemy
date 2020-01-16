package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class SumOddExampleTest {

    SumOddExample sumOddExample;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){
            sumOddExample = new SumOddExample();
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            //sumOddExample = null;
        }
        @Test
        public void SumOddExampl0() {
            int result = sumOddExample.sumOddExample(0,0);
            System.out.println(result);
            int expectedresult = 225;
            assertEquals(expectedresult,result);
        }

        @Test
        public void sumOddExample9() {
            int result = sumOddExample.sumOddExample(9,9);
            System.out.println(result);
            int expectedresult = 33174;
            assertEquals(expectedresult,result);
        }

        @Test
        public void sumOddExample99() {
        int result = sumOddExample.sumOddExample(99,99);
        System.out.println(result);
        int expectedresult = 33264;
        assertEquals(expectedresult,result);
        }

        @Test
        public void sumOddExample999() {
        int result = sumOddExample.sumOddExample(999,999);
        System.out.println(result);
        int expectedresult = 34164;
        assertEquals(expectedresult,result);
        }

        @Test
        public void sumOddExample9999() {
        int result = sumOddExample.sumOddExample(9999,9999);
        System.out.println(result);
        int expectedresult = 43164;
        assertEquals(expectedresult,result);
        }

        @Test
        public void sumOddExampleEven() {
        int result = sumOddExample.sumOddExample(2,2);
        System.out.println(result);
        int expectedresult = 92;
        assertEquals(expectedresult,result);
        }

        @Test
        public void sumOddExampleInvalid() {
        int result = sumOddExample.sumOddExample(-1,-1);
        System.out.println(result);
        int expectedresult = 314;
        assertEquals(expectedresult,result);
        }

        @Test
        public void sumOddExampleNegative() {
        int result = sumOddExample.sumOddExample(-2147483647,-2147483647);
        System.out.println(result);
        int expectedresult = -2147450482;
        assertEquals(expectedresult,result);
        }
         @Test
        public void sumOddExampleLarge() {
        int result = sumOddExample.sumOddExample(2147483647,2147483647);
        System.out.println(result);
        int expectedresult = -2147450484;
        assertEquals(expectedresult,result);
    }













}



