package com.bharat.tdd;

import junit.framework.Assert;
import org.junit.Test;


/**
 * Created with IntelliJ IDEA.
 * User: kondetib
 * Date: 8/1/13
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class PaintTest {

    @Test
    public void testPaintObjectCreation() {
        Paint paint = new Paint(10, 20, 30, 60, Finish.GLOSS);
        Assert.assertEquals(paint.getRed(), 10);
        Assert.assertEquals(paint.getBlue(), 20);
        Assert.assertEquals(paint.getYellow(), 30);
        Assert.assertEquals(paint.getWhite(), 60);
        Assert.assertEquals(paint.getFinish(), Finish.GLOSS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaintCreationShouldThrowIllegalArgumentExceptionWhenWhiteInGlossFinishPaintIsBelow50() {
        Paint paint = new Paint(10, 20, 30, 40, Finish.GLOSS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaintCreationShouldThrowIllegalArgumentExceptionWhenMoreThanOneOfThePrimaryColorsIsAbove200() {
        Paint paint = new Paint(201, 210, 30, 60, Finish.GLOSS);
    }
}
