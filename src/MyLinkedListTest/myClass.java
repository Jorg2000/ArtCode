package MyLinkedListTest;

import java.util.LinkedList;

/**
 * Created by root on 21.04.2015.
 */

public class myClass {
    public static void main(String[] args) {
        SimpleList<String> test = new SimpleList<>();
        LinkedList<String> test2 = new LinkedList<>();
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
        test.addFirst("77");
        System.out.println(test);
        test.add(5, "fff");

        System.out.println(test);

        /*
        for (String str : test) {

        }*/

       /* test2.add("1");
        test2.add("2");
        test2.add("3");
        test2.add("4");
        test2.add("5");
        test2.add("6");
        test2.add("7");
        test2.add("8");
        test2.addFirst("77");
        System.out.println(test2);
        test2.add(10, "fff");

        System.out.println(test2);*/



       /* System.out.println(test.getFirst());
        System.out.println(test.getLast());

        System.out.println(test.indexOf("8"));

        test.clear();


        System.out.println(test);

        System.out.println(test.indexOf("8"));

        test.add("zzz");
        test.addFirst("77");
        System.out.println(test);

        System.out.println(test.getFirst());
        System.out.println(test.getLast());
*/
    }
}
