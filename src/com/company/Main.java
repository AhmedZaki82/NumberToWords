package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWord(100);
        System.out.println(getDigitCount(100));

        //System.out.println(reverse(123));
    }

    public static void numberToWord(int number) {

        int numberPlus = 0;
        int rev = reverse(number);
       // System.out.println(rev);


        while (rev > 0) {
            numberPlus = rev % 10;
            rev = rev / 10;

            switch (numberPlus) {

                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

            }

            int remain = getDigitCount(number) - getDigitCount(reverse(number));
            for (int i = 0; i < remain; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {


        int last = 0;

        while (number > 0) {

            last = last * 10 + number % 10;
            number /= 10;

        }

        return last;
    }

    public static int getDigitCount(int number) {

        if (number >= 0) {
            int count = 0;
            if (number == 0) {
                count = 1;
            } else {
                while (number > 0) {
                    count++;
                    number /= 10;
                }
            }
            return count;
        }

        return -1;

//        int count = 0;
//
//        if (number >= 0) {
//            count = 1;
//        }
//        while (number >= 0) {
//            count++;
//            number /= 10;
//        }
//
//        return count;
    }
}
