import java.util.*;
import java.io.*;
import java.text.*;

public class Cat1a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean runningOne = true;

        System.out.println("\n= = = = = = = = = = = = = = = = = = = = = = = = = = =");
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
        System.out.println("\nWould you like to: ");
        System.out.println(" > (R)ead from a file?");
        System.out.println(" > (M)anually enter data?");
        System.out.println(" > (E)xit program");
        System.out.println("\n");
        System.out.print("Please enter your selection: ");
    }

    public static void runManualMode()
    {
        Scanner sc = new Scanner(System.in);
        boolean runningStringConfirm = true;
        String stringInput = "";

        boolean runningCaseToConvertTo = true;


        while(runningStringConfirm == true)
        {
            System.out.print("\nPlease enter the string you wish to convert: ");

            stringInput = sc.nextLine();
            
            System.out.println("\nYou have entered: " + stringInput);
            System.out.println("\nWould you like to continue? ");
            System.out.println(" > (Y)es ");
            System.out.println(" > (N)o ");
            System.out.print("\n\nPlease make your selection: ");
            
            String confirmInput = sc.nextLine().toLowerCase();

            switch(confirmInput)
            {
                case "y":
                    runningStringConfirm = false;
                    break;

                case "n":
                    runningStringConfirm = true;
                    break;
                
                default:
                    System.out.println("That input was invalid");
            }

        }

        while(runningCaseToConvertTo == true)
        {
            System.out.println("\nTo which case would you like to convert to?");
            System.out.println(" > (U)ppercase");
            System.out.println(" > (L)owercase");
            System.out.print("\n\nPlease make your selection: ");

            String caseToConvertInput = sc.nextLine().toLowerCase();

            switch(caseToConvertInput)
            {
                case "u":
                    runConvertToUpper(stringInput);
                    runningCaseToConvertTo = false;
                    break;

                case "l":
                    runConvertToLower(stringInput);
                    runningCaseToConvertTo = false;
                    break;

                default:
                    System.out.println("Your input was invalid");
            }

        }


    }

    public static void runReadMode()
    {

    }

    public static void runConvertToUpper(String originalString)
    {
        String newString = originalString.toUpperCase();
        System.out.println("\nYour original string was: " + originalString);
        System.out.println("The uppercase version is: " + newString);
    }

    public static void runConvertToLower(String originalString)
    {
        String newString = originalString.toLowerCase();
        System.out.println("\nYour original string was: " + originalString);
        System.out.println("The lowercase version is: " + newString);
    }



}