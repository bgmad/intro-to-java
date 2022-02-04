package test2;

public class Test2 {
    public static void main(String[] args) {
        for(int g = 10; g <= 20; g++) {
            System.out.println(g + " gallons --> " + Convert_Gallon(g) + " litres");
        }
    }

    public static Double Convert_Gallon(int gallons) {
        return gallons * 3.785;
    }
}
