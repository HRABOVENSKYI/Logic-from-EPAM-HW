package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        System.out.println("A ==> 1 ==> A\nB ==> 2 ==> B\nZ ==> 26 ==> Z\nAA ==> 27 ==> AA\nAZ ==> 52 ==> AZ" +
                "\nBA ==> 53 ==> BA\nZZ ==> 702 ==> ZZ\nAAA ==> 703 ==> AAA");
    }

    public static int str2int(String number) {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            int numOfElementInAscii = number.charAt(i);
            int numOfElementInAlphabet = numOfElementInAscii - 64;
            double elementOrder = Math.pow(26, (double) number.length() - 1 - i);
            double elementFigure = numOfElementInAlphabet * elementOrder;
            result += elementFigure;
        }

        return result;
    }

    public static String int2str(int number) {
        int numOfLetters = getNumOfLetters(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numOfLetters; i++) {
            int rawNumberForLetter = number;

            for (int j = 0; j < numOfLetters - i - 1; j++) {
                rawNumberForLetter -= Math.pow(26, j);
            }

            int numOfThisLetters = Math.floorDiv(rawNumberForLetter, (int) Math.pow(26, (double) numOfLetters - i - 1));

            result.append((char) (numOfThisLetters + 64));

            number -= numOfThisLetters * Math.pow(26, (double) numOfLetters - i - 1);
        }
        return result.toString();
    }

    private static int getNumOfLetters(int number) {
        int numOfLetters = 1;

        while (true) {
            if (number > getMaxNumOfLetters(numOfLetters)) {
                numOfLetters++;
            } else {
                break;
            }
        }

        return numOfLetters;
    }

    public static int getMaxNumOfLetters(int rank) {
        return (int) (26 * (Math.pow(26, rank) - 1) / (26 - 1));
    }

    public static String rightColumn(String number) {
        int numNumOfRightColumn = str2int(number) + 1;
        return int2str(numNumOfRightColumn);
    }
}
