package com.bharat.ds;

/**
 * Created by kondetib on 12/18/13.
 */
public class EntryUtil {
    public static <T> Entry makeNode(T value, Entry previous, Entry next) {
       return new Entry<T>(value, previous, next);
    }

    public static void main(String arsg[]) {
        EntryUtil.makeNode(new Integer(5), null, null);
    }
}
