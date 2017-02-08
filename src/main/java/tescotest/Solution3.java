package tescotest;

/**
 * Created by jpowel on 07/02/2017.
 */
public class Solution3 {
    private static final char WILDCARD_CHAR = '?';
    public boolean solution(String S, String T) {
        String sWildcards = replaceNumbersWithWildcards(S);
        String tWildcards = replaceNumbersWithWildcards(T);
        if (sWildcards.length() != tWildcards.length()) {
            //Strings are the same length
            return false;
        }

        for (int i = 0; i < sWildcards.length(); i++) {
            char sChar = sWildcards.charAt(i);
            char tChar = tWildcards.charAt(i);
            if(sChar != WILDCARD_CHAR && tChar != WILDCARD_CHAR) {
                if (sChar != tChar) {
                    return false;
                }
            }
        }
        return true;

    }

    protected String replaceNumbersWithWildcards(String input) {
        StringBuilder sb = new StringBuilder();
        StringBuilder numberSb = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                numberSb.append(c);
            } else {
                if (numberSb.length() > 0) {
                    sb.append(numbersToWildcards(numberSb));
                    numberSb = new StringBuilder();
                }
                sb.append(c);
            }
        }
        if (numberSb.length() > 0) {
            sb.append(numbersToWildcards(numberSb));
        }
        return sb.toString();
    }

    private String numbersToWildcards(StringBuilder numberSb) {
        int numWildcards = Integer.parseInt(numberSb.toString());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <numWildcards; i++) {
            sb.append(WILDCARD_CHAR);
        }
        return sb.toString();
    }
}
