import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your favorite city: ");
        String city = keyboard.nextLine();

        keyboard.close();

        System.out.println("City has " + city.length() + " characters.");
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.charAt(0));
    }
}
