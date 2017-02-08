package javaeight.testing;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by jpowel on 26/01/2017.
 */
public class FibTest {
    @Test
    public void test() {
        Stream.iterate(new int[]{0, 1}, a -> new int[] {a[1], a[0] + a[1]})
        .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
    }
}
