package com.bharat.ds;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by kondetib on 12/21/13.
 */
public class LinkedListTest {

    @Test
    public void testSizeForNewList() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Assert.assertEquals(0,list.size());
    }

    @Test
    public void testAddOneElement() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);

        Assert.assertEquals(1,list.size());
    }

    @Test
    public void testAddMultipleElements() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(3,list.size());
    }

    @Test
    public void testToStringWhenOneElement() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);

        Assert.assertEquals("[1]",list.toString());
    }

    @Test
    public void testToStringWhenMultipleElements() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals("[1,2,3]",list.toString());
    }

    @Test
    public void testToStringWhenNoElements() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Assert.assertEquals("[]",list.toString());
    }
}
