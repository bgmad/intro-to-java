import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
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
