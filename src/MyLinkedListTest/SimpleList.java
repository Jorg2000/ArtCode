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
        else {
            while (current != null){
                current = current.next;
            }

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

    E listFirst() { // ����� ��� ����������� ������� ��������
        return (E)head.element;
    }


}
