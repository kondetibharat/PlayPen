package com.bharat.ds;

import java.util.Stack;

/**
 * Created by kondetib on 12/22/13.
 */
public class Utils {

    public static String convertDecimalToBinary(int number) {
        Stack stack = new Stack();
        while(number > 0) {
            int digit = number % 2;
            stack.push(digit);
            number = number / 2;
        }
        StringBuilder binary = new StringBuilder();
        while(!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    public static int evaluateInfixExpression(String expression) {
        final Stack<Character> stack = new Stack<Character>();
        expression = expression.replaceAll("\\s+","");
        final char[] chars = expression.toCharArray();

        for(Character c :chars) {
            System.out.println(c);
            switch (c) {
                case '(' :

            }
        }
        return 0;
    }
}
