import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int cents = Integer.parseInt(sc.nextLine());
        int halfDollar = cents / 50;
        cents %= 50;
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickles = cents / 5;
        cents %= 5;
        int pennies = cents / 1;
        System.out.printf("Number of half-dollars: %d\n", halfDollar);
        System.out.printf("Number of quarters: %d\n", quarters);
        System.out.printf("Number of dimes: %d\n", dimes);
        System.out.printf("Number of nickles: %d\n", nickles);
        System.out.printf("Number of pennies: %d\n", pennies);
    }
}