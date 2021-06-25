package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        int gcd = 1;

        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            if (Integer.parseInt(args[0]) % i == 0 && Integer.parseInt(args[1]) % i == 0) {
                gcd = i;
            }
        }

        System.out.print(gcd);
    }

}
