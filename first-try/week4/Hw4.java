package week4;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(scannerObj.nextLine());
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(scannerObj.nextLine());
        System.out.print("Enter third number: ");
        int num3 = Integer.parseInt(scannerObj.nextLine());
        System.out.print("Enter fourth number: ");
        int num4 = Integer.parseInt(scannerObj.nextLine());
        System.out.print("Enter fifth number: ");
        int num5 = Integer.parseInt(scannerObj.nextLine());
        
        if (num1 < 0) {
            negativeCount++;
        }
        if (num1 == 0) {
            zeroCount++;
        }
        if (num1 > 0) {
            positiveCount++;
        }

        if (num2 < 0) {
            negativeCount++;
        }
        if (num2 == 0) {
            zeroCount++;
        }
        if (num2 > 0) {
            positiveCount++;
        }

        if (num3 < 0) {
            negativeCount++;
        }
        if (num3 == 0) {
            zeroCount++;
        }
        if (num3 > 0) {
            positiveCount++;
        }

        if (num4 < 0) {
            negativeCount++;
        }
        if (num4 == 0) {
            zeroCount++;
        }
        if (num4 > 0) {
            positiveCount++;
        }

        if (num5 < 0) {
            negativeCount++;
        }
        if (num5 == 0) {
            zeroCount++;
        }
        if (num5 > 0) {
            positiveCount++;
        }
        
        System.out.printf("There are %d zeros\n", zeroCount);
        System.out.printf("There are %d negatives\n", negativeCount);
        System.out.printf("There are %d positives\n", positiveCount);
    }
}