package MyLinkedListTest;

import java.util.List;

/**
 * Created by root on 21.04.2015.
 */
public class SimpleList<E>  {

    private static class Entry<E> // ����� ��� �������� ������� � ������
    {
        E element;
        Entry<E> next;

        Entry(E element)
        {
            this.element = element; // �������� �������
            this.next = null; // ������ �� ��������� �������
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

    public void addFirst(E Element) {
        Entry<E> node = new Entry<E>(Element);
        if(size == 0) {
            tail = new Entry<E>(null) ;
            tail.next = node;
            head = tail;
            size++;
        }
        Entry<E> current = new Entry<E>(Element);
        for(Entry<E> e = tail; e != null; e = e.next) {
            current = e;
        }
        current.next = node;

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

    E getFirst() { // ����� ��� ����������� ������� ��������
        E ret = (E)tail.element;
        for(Entry<E> e = tail; e != null; e = e.next) {
        ret = e.element;
        }
        return (E)ret;
    }

    E getLast() { // ����� ��� ����������� ������� ��������
        E ret = (E)tail.next.element;
        return (E)ret;
    }


}
