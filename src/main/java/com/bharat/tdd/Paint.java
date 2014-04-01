package com.bharat.tdd;

/**
 * Created with IntelliJ IDEA.
 * User: kondetib
 * Date: 8/1/13
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Paint {
    private int red;
    private int blue;
    private int yellow;
    private int white;
    private Finish finish;

    public Paint(int red, int blue, int yellow, int white, Finish finish) {

       checkWhiteLevelsForGloss(white, finish);

       checkSaturation(red, blue, yellow);

       this.red = red;
       this.blue = blue;
       this.yellow = yellow;
       this.white = white;
       this.finish = finish;
    }

    private void checkWhiteLevelsForGloss(int white, Finish finish) {
        if(finish == Finish.GLOSS && white < 50)
            throw new IllegalArgumentException("Gloss paint cannot have white whose value is less than 50");
    }

    private void checkSaturation(int red, int blue, int yellow) {
        int count = 0;
        if(red > 200) ++ count;
        if(blue > 200) ++ count;
        if(yellow > 200) ++ count;

        if(count > 1)
            throw new IllegalArgumentException("More than one of the primary colors is above 200");
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getYellow() {
        return yellow;
    }

    public int getWhite() {
        return white;
    }

    public Finish getFinish() {
        return finish;
    }
}
