package MyLinkedListTest;

import java.util.List;

/**
 * Created by root on 21.04.2015.
 */
public class SimpleList<E>  {

    private static class Entry<E> // Класс для хранения элмента в списке
    {
        E element;
        Entry<E> next;

        Entry(E element)
        {
            this.element = element; // Хранимый элемент
            this.next = null;       // Ссылка на следующий элемент
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
            tail = node;
            size++;
        }
        else {
            Entry<E> oldTail = tail;
            tail = node;
            tail.next = oldTail;
            size++;
        }

    }

    public void addFirst(E Element) {
        Entry<E> node = new Entry<E>(Element);
        if(size == 0) {
            tail = node;
            size++;
        }
        else {
            Entry<E> current = new Entry<E>(Element);
            for (Entry<E> e = tail; e != null; e = e.next) {
                current = e;
            }
            current.next = node;
        }

    }

    @Override
    public String toString() {
        String str = "";
        Entry<E> current = tail;
        if (tail != null) {
            while (current != null) {
                if (current.next != null) {
                    str = str + current.element + ", ";
                }
                else {
                    str = str + current.element;
                }
                current = current.next;
            }
        }
        return "[" + str + "]";
    }

    E getFirst() { // Метод для возвращения первого элемента
        E ret = (E)tail.element;
        for(Entry<E> e = tail; e != null; e = e.next) {
        ret = e.element;
        }
        return ret;
    }

    E getLast() { // Метод для возвращения последнего элемента
        E ret = (E)tail.element;
        return ret;
    }

    public void clear() {
        for(Entry<E> e = tail; e != null; ) {
            Entry<E> next = e.next;
            e.next = null;
            e.element = null;
            e = next;
        }
        tail = null;
        size = 0;

    }

    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Entry<E> e = tail; e != null; e = e.next) {
                if (e.next == null)
                    return (size) - index;
                index++;
            }
        } else {
            for (Entry<E> e = tail; e != null; e = e.next) {
                if (o.equals(e.element))
                    return (size) - index;
                index++;
            }
        }
        return -1;
    }




}
