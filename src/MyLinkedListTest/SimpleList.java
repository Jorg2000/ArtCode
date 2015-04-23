package MyLinkedListTest;

import com.sun.deploy.security.DeployURLClassPathCallback;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by root on 21.04.2015.
 */
public class SimpleList<E> {

    private static class Entry<E>
    {
        E element;
        Entry<E> next;

        Entry(E element)
        {
            this.element = element;
            this.next = null;

        }
    }

    private Entry head;
    private Entry tail;
    private Entry current;
    private int size;
    public SimpleList() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    public void add(E Element) {

        Entry<E> node = new Entry<E>(Element);
        if(size == 0) {
            tail = new Entry<E>(null) ;
            tail.next = node;
            head = tail;
            size++;
        }
        else {
            Entry<E> current = tail.next;
            tail.next = node;
            node.next = current;
            size++;
        }

    }

    @Override
    public String toString() {
        String str = "";
        Entry<E> current = tail.next;
        while (current != null){
            str = str + " " + current.element;
            current = current.next;
        }
        return str;
    }
}
