package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {

        char[] chars = args[0].toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += Character.getNumericValue(c);
        }
        System.out.print(sum);
    }
	
}
