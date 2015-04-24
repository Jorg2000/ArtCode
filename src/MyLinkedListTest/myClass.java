package MyLinkedListTest;

import java.util.LinkedList;

/**
 * Created by root on 21.04.2015.
 */

public class myClass {
    public static void main(String[] args) {
        SimpleList<String> test = new SimpleList<>();
        LinkedList<String> test2 = new LinkedList<String>();
/*
        long t1 = System.currentTimeMillis();
        for (long i = 0; i < 10000000; i++) {
            test2.add(Long.toString(i));
        }
        System.out.println(" Def" + (System.currentTimeMillis() - t1));


        t1 = System.currentTimeMillis();
        for (long i = 0; i < 10000000; i++) {
            test.add(Long.toString(i));
        }
        System.out.println("My " + (System.currentTimeMillis() - t1));

*/

        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");
        test.add("6");
        test.add("7");
        test.add("8");
        test.addFirst("0");

        System.out.println(test);
        System.out.println(test.getFirst());
        System.out.println(test.getLast());

    }
}
