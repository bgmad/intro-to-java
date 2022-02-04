package week5;

import java.util.Scanner;
public class Hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        String output = "";
        for (int i = input.length - 1; i >= 0; i--) {
            output = output + input[i];
        }
        System.out.println(output);
    }
}
