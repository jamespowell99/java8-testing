package javaeight.testing;

import javaeight.testing.Trader;
import javaeight.testing.Transaction;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by jpowel on 25/01/2017.
 */
public class TraderTransactionTest {
    private static final Trader raoul = new Trader("Raoul", "Cambridge");
    private static final Trader mario = new Trader("Mario","Milan");
    private static final Trader alan = new Trader("Alan","Cambridge");
    private static final Trader brian = new Trader("Brian","Cambridge");

    private static final List<Transaction> TRANSACTIONS = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    @Test
    public void test1() {
        List<Transaction> transactions = TRANSACTIONS.stream()
                .filter(tx -> tx.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println("TRANSACTIONS = " + transactions);
    }

    @Test
    public void test2() {
        System.out.println(TRANSACTIONS.stream()
                .map(tx -> tx.getTrader().getCity())
                .distinct()
                .collect(toList()));
    }

    @Test
    public void test3() {
        System.out.println(TRANSACTIONS.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList()));
    }

    @Test
    public void test4() {
        String s = String.join(",", TRANSACTIONS.stream()
                .map(tx -> tx.getTrader().getName())
                .sorted()
                .distinct()
                .collect(toList()));
        System.out.println("s = " + s);
    }

    @Test
    public void test5() {
        System.out.println(TRANSACTIONS.stream()
                .anyMatch(tx -> tx.getTrader().getCity().equals("Milan")));
    }

    @Test
    public void test6() {
        TRANSACTIONS.stream()
                .filter(tx -> tx.getTrader().getCity().equals("Cambridge"))
                .forEach(tx -> System.out.println(tx.getValue()));
    }

    @Test
    public void test7() {
        System.out.println(TRANSACTIONS.stream()
                .mapToInt(Transaction::getValue)
                .max().orElse(0));
    }

    @Test
    public void test8() {
        System.out.println(TRANSACTIONS.stream()
                .min(comparing(Transaction::getValue)).get());
    }


}
