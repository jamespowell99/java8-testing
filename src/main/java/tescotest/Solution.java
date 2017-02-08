package tescotest;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by jpowel on 07/02/2017.
 */
public class Solution {
    public int solution(int[] A) {
        for (int i = 1; i < A.length;  i++) {
            int[] arrayBefore = Arrays.copyOfRange(A, 0, i);
            int[] arrayAfter = Arrays.copyOfRange(A, i+1, A.length);
            if (IntStream.of(arrayBefore).sum() == IntStream.of(arrayAfter).sum()) {
                return i;
            }

        }
        return -1;
    }
}
