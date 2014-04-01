package com.bharat.ds;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kondetib on 12/22/13.
 */
public class UtilsTest {
    @Test
    public void testconvertDecimalToBinaryWhenInputIs2() throws Exception {
        final String toBinary = Utils.convertDecimalToBinary(2);
        Assert.assertEquals("10",toBinary);
    }

    @Test
    public void testconvertDecimalToBinary() throws Exception {
        final String toBinary = Utils.convertDecimalToBinary(57);
        Assert.assertEquals("111001",toBinary);
    }

    @Test
    public void testEvaluateInfixExpression() throws Exception {
        final int i = Utils.evaluateInfixExpression("(((2 * 5) - (1 * 2)) / (11 - 9))");
        Assert.assertEquals(4,i);
    }

}
