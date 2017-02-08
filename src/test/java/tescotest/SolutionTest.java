package tescotest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jpowel on 07/02/2017.
 */
public class SolutionTest {
    @Test
    public void test() {
        int solution = new Solution().solution(new int[]{-1, 3, -4, 5, 1, -6, 2, 1});
        assertEquals(1, solution);
    }

    @Test
    public void testEmpty() {
        assertEquals(-1, new Solution().solution(new int[]{}));
    }

    @Test
    public void testSingle() {
        assertEquals(-1, new Solution().solution(new int[]{99}));
    }

    @Test
    public void testDouble() {
        assertEquals(-1, new Solution().solution(new int[]{99, 98}));
    }

    @Test
    public void testSimple() {
        assertEquals(1, new Solution().solution(new int[]{0, 0, 0}));
    }

    @Test
    public void testLonger() {
        assertEquals(3, new Solution().solution(new int[]{1, 2, 3, 99, 3, 2, 1}));
    }
}