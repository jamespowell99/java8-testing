package tescotest;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by jpowel on 07/02/2017.
 */
public class Solution2 {
    public int solution(String S) {
        BigInteger intToTest = new BigInteger(S, 2);

        int i = 0;
        while (intToTest.compareTo(BigInteger.ZERO) > 0) {
            i++;
            if (intToTest.getLowestSetBit() != 0) {
                intToTest = intToTest.divide(BigInteger.valueOf(2));
            } else {
                intToTest = intToTest.subtract(BigInteger.ONE);
            }
        }
        return i;
    }


}
