package MyDoubleLinkedList;

import java.util.LinkedList;

/**
 * Created by root on 29.04.2015.
 */
public class myClass {

    public static void main(String[] args) {
        SimpleDoubleLinkedList<String> test = new SimpleDoubleLinkedList<String>();

        test.add("0");
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.addFirst("555");
        test.addLast("666");

        test.add(2, "222");
        System.out.println(test);
        test.remove(7);
        System.out.println("xxx");
        System.out.println(test);
        System.out.println(test.reverseString());

    }


}
