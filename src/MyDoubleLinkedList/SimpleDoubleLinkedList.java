package MyDoubleLinkedList;

/**
 * Created by root on 29.04.2015.
 */

/*
    My very simple double linked list;


        First           Current 0       Current N       Last
        --------        --------        --------       --------
        | DATA |        | DATA |       | DATA |        | DATA |
        | NEXT | -->    | NEXT | -->   | NEXT | -->    | NEXT | NULL
NULL    | PREV | <--    | PREV | <--   | PREV | <--    | PREV |
        --------        --------       --------        --------

 */

public class SimpleDoubleLinkedList <E> {

    int size;
    Entry<E> first;
    Entry<E> last;
    public SimpleDoubleLinkedList () {
        size = 0;
    }

    //When we try to add new  element, we always do it at first position
    public void add(E element) {
        addFirst(element);
     }

    // Adding first element
    public void addFirst(E element) {
        Entry<E> node = new Entry<>(element);
        if(size == 0) {
            first = last = node;
            size++;
        }
        else {
            node.next = first;
            first = node;
            node.next.prev = first;
            size++;
        }
     }

    // Adding element by index
    public void add(int index, E element) {
        Entry<E> node = new Entry<>(element);
        // The first element will be the las if list is empty
        if(size == 0) {
            first = last = node;
            size++;
        }
        // Using functions to add element to the and or to the beginning of the list
        // depends on index
        else if (index == 0){
            addLast(element);
        }
        else if (index == size - 1){
            addFirst(element);
        }
        else {

            // Search for the elements with desirable index
            // I am always make search from the last element
            Entry<E> current = last;
            int count = 0;
            while (current != null && count != index)
            {
                count++;
                //Going through the list. Current element became previous.
                current = current.prev;
            }
            /*
            1) I want to put new element strictly on the certain index in the old list,
            so I move old element to the "left" and put new node on his place
            2) I don't want to move next (right) element so I assign his reference to new nod
            3) The most interesting part. To insert new node to the list I am use reference of the
               "previous" reference of the node next to current.
            4) I am reference of my new node to the current;
            To create this algoritm I used Java data structures and algorithm by Robert Lafore p 220 in russian edition
             of 2013 year
            */
            node.prev = current;
            node.next = current.next;
            current.next.prev = node;
            current.next = node;
            size++;

        }
    }
    /*
    * Internal function to delete last element
    * */
    private void deleteLast(){
        Entry<E> current = last;
        current.prev.next = null;
        last = current.prev;
        size --;
    }

    /*
    * Removing first element
    * */

    private void deleteFirst(){
        Entry<E> current = first;
        current.next.prev = null;
        first = current.next;
        size --;
    }

    /*
    * Just removing
    * */

    public void remove (int index) {
        int count = 0;

        if (index == 0) {
            deleteLast();
        }
        else if (index == size - 1) {
            deleteFirst();
        }
        else {

            Entry<E> current = last;
            while (current != null && count != index) {
                count++;
                current = current.prev;
            }
            /*
            * To delete element I am connect next and prev references of the elements from left and
               * right side directly to each other  (i.e. without "current" element )
            * */

            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }

    }

    // Adding last element
    public void addLast(E element) {
        Entry<E> node = new Entry<>(element);
        if(size == 0) {
            last = first = node;
            size++;
        }
        else {
            last.next = node;
            node.prev = last;
            last = node;
            size++;
        }
    }


    @Override
    public String toString() {
        String res = " ";
        Entry<E> current = first;

        while(current != null) {
            res = res + current.element + " ";
            current = current.next;
        }
        return res;
    }

    public String reverseString(){
        String res = " ";
        Entry<E> current = last;

        while(current != null) {
            res = res + current.element + " ";
            current = current.prev;
        }
        return res;
    }


    /*
    * Data structure which store every element*/
    public static class Entry<E> {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element) {
            this.element = element;
            this.prev = null;
            this.next = null;
        }
    }
}
