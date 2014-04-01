package com.bharat.ds;

/**
 * Created by kondetib on 12/18/13.
 */
public class Entry<T> {
    T value;
    Entry previous;
    Entry next;

    public Entry(T value, Entry<T> previous, Entry<T> next) {
      this.value = value;
      this.previous = previous;
      this.next = next;
    }
}
