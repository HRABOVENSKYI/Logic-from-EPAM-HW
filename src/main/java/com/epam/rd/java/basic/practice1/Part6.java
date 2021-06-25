package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int status = 1;
        int num = 3;
        int n = Integer.parseInt(args[0]);

        if (n >= 1) {
            //2 is a known prime number
            System.out.print(2);
        }

        int i = 2;

        while (i <= n) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print(" " + num);
                i++;
            }
            status = 1;
            num++;
        }
    }

}
