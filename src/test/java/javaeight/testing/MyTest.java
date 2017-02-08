package javaeight.testing;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by jpowel on 20/01/2017.
 */
public class MyTest {
    @Test
    public void test1() {
        File root = new File(".");
        File[] files = root.listFiles();
        System.out.println(files.length);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        File[] files2 = root.listFiles(File::isHidden);
        System.out.println("HIDDEN...");
        for (File file : files2) {
            System.out.println(file.getAbsolutePath());
        }
    }

    @Test
    public void letterCount() {
        List<String> words = Arrays.asList("hello", "world");
        List<Integer> integers = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println("integers = " + integers);
    }

    @Test
    public void pairs() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<int[]> collect = list1.stream()
                .flatMap(x -> list2.stream().map(y -> new int[]{x, y}))
                .collect(Collectors.toList());
        collect.stream().forEach( x-> System.out.println("pair = " + Arrays.toString(x)));

    }

    @Test
    public void pairs2() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<int[]> collect = list1.stream()
                .flatMap(x -> list2.stream()
                        .filter( y -> (y + x) % 3 == 0)
                        .map(y -> new int[]{x, y}))
                .collect(Collectors.toList());
        collect.stream().forEach( x-> System.out.println("pair = " + Arrays.toString(x)));

    }


}
