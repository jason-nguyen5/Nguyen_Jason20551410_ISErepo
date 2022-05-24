import java.util.*;
import java.io.*;
import java.text.*;

public class Cat1c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean runningOne = true;

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Welcome to the Uppercase Lowercase Converter Program");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("");

        while(runningOne == true)
        {
            printInputType();
            
            String input = sc.next().toLowerCase();

            switch(input)
            {
                case "e":
                    runningOne = false;
                    break;
                case "exit":
                    runningOne = false;
                    break;

                case "m":
                    runManualMode();
                    break;
                case "manual":
                    runManualMode();
                    break;

                case "r":
                    runReadMode();
                    break;
                case "read":
                    runReadMode();
                    break;

                default:
                    System.out.println("The input was invalid, please try again.");
            }
        }
        
        
    }

    public static void printInputType()
    {
        System.out.println("Would you like to: ");
        System.out.println(" > (R)ead from a file?");
        System.out.println(" > (M)anually enter data?");
        System.out.println(" > (E)xit program");
    }

    public static void runManualMode()
    {

    }

    public static void runReadMode()
    {
        
    }
}