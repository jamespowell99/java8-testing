package tescotest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jpowel on 07/02/2017.
 */
public class Solution2Test {
    private Solution2 solution2 = new Solution2();

//    @Test(expected = NumberFormatException.class)
//    public void testEmpty() {
//        assertEquals(0, solution2.solution(""));
//    }
//
//    @Test
//    public void test1() {
//        assertEquals(1, solution2.solution("1"));
//    }
//
//    @Test
//    public void test2() {
//        assertEquals(2, solution2.solution("10"));
//    }
//
//    @Test
//    public void test3() {
//        assertEquals(14, solution2.solution("0001110"));
//    }

    @Test
    public void test0() {
        assertEquals(0, solution2.solution("0"));
    }

    @Test
    public void test1() {
        assertEquals(1, solution2.solution("01"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution2.solution("010"));
    }

    @Test
    public void test3() {
        assertEquals(3, solution2.solution("011"));
    }

    @Test
    public void test() {
        assertEquals(7, solution2.solution("011100"));
    }

    @Test
    public void testLarge() {
        assertEquals(7, solution2.solution("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
    }
}