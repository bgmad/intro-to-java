package midterm;

import java.util.Scanner;
public class Midterm {
    public static void main(String[] args) {
        int count = 1;
        while ( count <= 10 ) {
            if (count == 1 || count == 4 || count == 7 || count == 10) {
                System.out.println("****");
            } else {
                System.out.println("++++");
            }
            count++;
        }

    }

}

