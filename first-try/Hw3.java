import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter side 1 length: ");
        int side1 = Integer.parseInt(scannerObj.nextLine());
        System.out.print("Enter side 2 length: ");
        int side2 = Integer.parseInt(scannerObj.nextLine());
        System.out.print("Enter side 3 length: ");
        int side3 = Integer.parseInt(scannerObj.nextLine());
        
        if ((side1 + side2 > side3) && 
            (side1 + side3 > side2) && 
            (side3 + side2 > side1)) {
            System.out.println("These could be sides to a triangle.");
        } else {
            System.out.println("These do not form a triangle.");
        }
    }
}