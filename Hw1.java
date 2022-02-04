/**
 * Hw1
 */

import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {
        circuitBoardProfit();
    }
    
    public static void circuitBoardProfit() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter retail price: ");
        double retailPrice = kb.nextDouble();
        
        kb.close();

        double profit = retailPrice * 0.4;
        System.out.println("Profit: " + profit +
                           "\nSold for: " + (retailPrice + profit));

    }

    public static double testAverage() {
        double tests[] = new double[3];
        Scanner kb = new Scanner(System.in);
    
        for(int i = 0; i < tests.length; i++) {
            System.out.print("Test " + (i + 1) + ": ");
            tests[i] = kb.nextDouble();
        }
        
        kb.close();
    
        double total = 0;
        for(int i = 0; i < tests.length; i++) {
            total += tests[i];
        }
    
        return total / tests.length;
    }
    
    public static double milesPerGallon() {
        Scanner kb = new Scanner(System.in);
    
        System.out.print("Miles driven: ");
        double milesDriven = kb.nextDouble();

        System.out.print("Gallons used: ");
        double gallonsUsed = kb.nextDouble();

        kb.close();

        return milesDriven / gallonsUsed;
    }

    public static void cookieCalories() {
        Scanner kb = new Scanner(System.in);
    
        System.out.print("Cookies eaten: ");
        int cookiesEaten = kb.nextInt();

        kb.close();

        System.out.println(cookiesEaten / 10.0 * 300);
    }

    public static void salesTax() {
        Scanner kb = new Scanner(System.in);
    
        System.out.print("Purchase: ");
        double purchase = kb.nextDouble();

        kb.close();

        System.out.println("Purchase total: " + CalculateSalesTax(purchase));
    }

    public static double CalculateSalesTax(double purchaseValue) {
        double salesTax = purchaseValue * 0.04;
        double countyTax = purchaseValue * 0.02;
        System.out.println("Sales tax: " + salesTax);
        System.out.println("County tax: " + countyTax);
        return salesTax + countyTax + purchaseValue;
    }

    public static double landCalculation(int squareFeet) {
        return squareFeet / 43560;
    }

    public static double salesPrediction(float salesCut, double totalSales) {
        return totalSales * salesCut;
    }

    public static void nameAgeAndAnnualIncome() {
        Scanner kb = new Scanner(System.in);
    
        System.out.print("Enter name: ");
        String name = kb.nextLine();
    
        System.out.print("Enter age: ");
        int age = kb.nextInt();
    
        System.out.print("Enter annual pay: ");
        double annualPay = kb.nextDouble();
    
        kb.close();
    
        System.out.printf("My name is %s, my age is %d and I hope to ear $%f per year.", name, age, annualPay);
    }

    public static void personalInformation() {
        Scanner kb = new Scanner(System.in);
    
        System.out.print("Enter name: ");
        String name = kb.nextLine();

        System.out.print("Enter college major: ");
        String collegeMajor = kb.nextLine();

        System.out.print("Enter address: ");
        String address = kb.nextLine();

        System.out.print("Enter city: ");
        String city = kb.nextLine();

        System.out.print("Enter state: ");
        String state = kb.nextLine();

        System.out.print("Enter zip: ");
        int zip = kb.nextInt();        

        System.out.print("Enter telephone: ");
        int telephoneNumber = kb.nextInt();


        kb.close();

        System.out.println("\n\nName: " + name + 
                        "\nCollege Major: " + collegeMajor +
                        "\nAddress: " + address + 
                        "\nCity: " + city +
                        "\nState: " + state +
                        "\nZip: " + zip +
                        "\nTelephone: " + telephoneNumber);
    }
}