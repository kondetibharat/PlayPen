package com.bharat.ds;

/**
 * Created by kondetib on 12/21/13.
 */
public class LinkedList<T> {
    private Entry<T> header = new Entry<T>(null,null,null);
    private int size;

    public LinkedList() {
        header.previous = header.next = header;
    }


    public void add(T value) {
        addBefore(value, header);
    }

    public int size() {
        return size;
    }

    private void addBefore(T value, Entry<T> element) {
        final Entry<T> newEntry = new Entry<T>(value, element.previous, element);
        newEntry.previous.next = newEntry;
        newEntry.next.previous =newEntry;
        size++;
    }

    @Override
    public String toString() {
        Entry<T> s = header;

        StringBuilder print = new StringBuilder();

        print.append("[");

        if(null != s.next.value) {
            while(null != s.next.value) {
                s = s.next;
                print.append(s.value);
                if(null != s.next.value)
                    print.append(",");
            }
        }

        print.append("]");

        return print.toString();
    }
}
