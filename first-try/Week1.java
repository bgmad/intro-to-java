public class Week1 {
    public static void main(String[] args) {
        double halfDollars = 0.5 * 12;
        double quarters = 0.25 * 20;
        double dimes = 0.10 * 32;
        double nickles = 0.05 * 45;
        double pennies = 0.01 * 27;
        double total = halfDollars + quarters + dimes + nickles + pennies;
        System.out.println("Piggy bank total: " + total);
    }
}