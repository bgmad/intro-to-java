import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the miles driven: ");
        double milesDriven = Double.parseDouble(scannerObj.nextLine());
        System.out.print("Enter the gallons of gas used: ");
        double gasUsed = Double.parseDouble(scannerObj.nextLine());
        double mpg = milesDriven / gasUsed;
        System.out.printf("The miles / gallon is %.1f\n", mpg);
    }
}