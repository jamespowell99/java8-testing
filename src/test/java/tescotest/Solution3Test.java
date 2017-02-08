package tescotest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jpowel on 07/02/2017.
 */
public class Solution3Test {
    private Solution3 solution3 = new Solution3();
    @Test
    public void testEmptyStrings() {
        assertTrue(solution3.solution("",""));
    }

    @Test
    public void testSmallStrings() {
        assertTrue(solution3.solution("x","x"));
    }

    @Test
    public void testSmallWildcardStrings() {
        assertTrue(solution3.solution("1","1"));
    }

    @Test
    public void testCompare() {
        assertTrue(solution3.solution("A2Le", "2pL1"));
    }

    @Test
    public void testCompare2() {
        assertTrue(solution3.solution("a10", "10a"));
    }

    @Test
    public void testCompare3() {
        assertFalse(solution3.solution("ba1", "1Ad"));
    }

    @Test
    public void testCompare4() {
        assertTrue(solution3.solution("xxxx", "4"));
    }

    @Test
    public void testCompare5() {
        assertFalse(solution3.solution("3x2x", "8"));
    }

    @Test
    public void testCompare6() {
        assertTrue(solution3.solution("A2Le", "AmpLe"));
    }

    @Test
    public void testCompare7() {
        assertTrue(solution3.solution("AmpLe", "2pL1"));
    }

    @Test
    public void testCompare8() {
        assertFalse(solution3.solution("Ample", "2pL1"));
    }

    @Test
    public void testCompare9() {
        assertTrue(solution3.solution("a10", "axxxxxxxxxx"));
    }

    @Test
    public void testCompare10() {
        assertTrue(solution3.solution("xxxxxxxxxxa", "10a"));
    }


    @Test
    public void testReplaceEmpty() {
        assertEquals("", solution3.replaceNumbersWithWildcards(""));
    }

    @Test
    public void testReplaceLetters() {
        assertEquals("ABCabc", solution3.replaceNumbersWithWildcards("ABCabc"));
    }

    @Test
    public void testReplace() {
        assertEquals("A??Le", solution3.replaceNumbersWithWildcards("A2Le"));
    }

    @Test
    public void testReplace2() {
        assertEquals("??pL?", solution3.replaceNumbersWithWildcards("2pL1"));

    }

    @Test
    public void testReplace3() {
        assertEquals("pL?", solution3.replaceNumbersWithWildcards("0pL1"));
    }

    @Test
    public void testReplaceLong() {
        assertEquals("??????????pL??????????", solution3.replaceNumbersWithWildcards("10pL10"));
    }

}