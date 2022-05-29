import java.util.*;
import java.io.*;

public class TestFunctions
{
    String testString1 = "1410";
    String testString2 = "Nguyen";
    String testString3 = "Jason NGUYEN";
    String testString4 = "Doctor Strange in the Multiverse of Madness";


    public static void main(String args[])
    {
        boolean runningWhichFile = true;
        Scanner sc = new Scanner(System.in);

        while(runningWhichFile == true)
		{
			System.out.println("\nWhich file do you wish to access?");
			System.out.println(" > (M)enu");
			System.out.println(" > (F)unctions");
			System.out.println(" > (E)xit");

			System.out.print("\nPlease enter your choice: ");

			String input = sc.next().toLowerCase();
			
			switch(input)
			{
				case "e":
					runningWhichFile = false;
					break;
				case "m":
                    runMenuTestMenu();
					break;
				case "f":
					runFunctionTestMenu();
					break;
				default:
					System.out.println("Choice was invalid");
			}
		}
    }

    public static void runMenuTestMenu()
    {
        //
    }

    public static void runFunctionTestMenu()
    {
        //
    }





}