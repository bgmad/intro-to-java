import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
               String  input; 
               char marcode;
         
          Scanner keyboard =new Scanner(System.in);
          System.out.print ("Enter a marital code:");
                         input = keyboard.nextLine();
                         marcode= input.charAt(0);
           if(marcode=='M')
                         System.out.print ("\nIndividual is married");
           else if (marcode=='S')
                         System.out.print ("\nIndividual is single");
           else if (marcode=='D')
                        System.out.print ("\nIndividual is divorced");
           else if (marcode == 'W')
                       System.out.print ("\nIndividual is widowed");
           else
                      System.out.print ("\nAn invalid code was entered");

    }
 }
