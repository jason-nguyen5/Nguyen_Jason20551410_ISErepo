import java.util.*;
import java.io.*;

public class Menu
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<char[]> listOfStrings = new ArrayList<char[]>();
		boolean runningMain = true;
		
		listOfStrings = inputTypeMenu();

		while(runningMain == true)
		{
			System.out.println("\nSelect which function to run:\n");
			
			System.out.println("(1) > Convert given string to upper case or lower case (1a)");
			System.out.println("(2) > Identify whether numeric values are in a given string (1b)");
			System.out.println("(3) > Identify whether a given string is a valid number (1c)");
			System.out.println("(4) > Remove numeric values in a given string then conver to upper or lower case (1d)");
			System.out.println("(5) > Convert time (2c)");
			System.out.println("(0) > Exit");
			
			System.out.print("\nPlease enter your choice: ");

			String input = sc.next();
			
			switch(input)
			{
				case "0":
					runningMain = false;
					break;
				case "1":
					Cat1a.main(args);
					break;
	
				case "2":
					Cat1b.main(args);
					break;
	
				case "3":
					Cat1c.main(args);
					break;
	
				case "4":
					Cat1d.main(args);
					break;
	
				case "5":
					Cat2c.main(args);
					break;
				default:
					System.out.println("Choice was invalid");
			}
			
		}

	}

	public static List<char[]> inputTypeMenu()
	{
		Scanner sc = new Scanner(System.in);
		List<char[]> returnList = new ArrayList<char[]>();
		boolean runningInputTypeMenu = true;



		while(runningInputTypeMenu == true)
		{
			System.out.println("\nHow would you like to enter you data?");
			System.out.println(" > (R)ead or (A)utomatically from a file?");
			System.out.println(" > (M)anually enter the string?");
			System.out.println(" > (E)xit");

			System.out.print("\nPlease enter your choice: ");

			String input = sc.next().toLowerCase();
			
			switch(input)
			{
				case "e":
					runningInputTypeMenu = false;
					break;
				case "m":
					returnList = runManualInput();
					runningInputTypeMenu = false;
					break;
				case "r":
					returnList = runAutomaticInput();
					runningInputTypeMenu = false;
					break;
				case "a":
					returnList = runAutomaticInput();
					runningInputTypeMenu = false;
					break;
				default:
					System.out.println("Choice was invalid");
			}
		}

		return returnList;
	}

	public static List<char[]> runManualInput()
	{
		Scanner sc = new Scanner(System.in);
        boolean runningStringConfirm = true;
        String stringInput = "";
		List<char[]> returnList = new ArrayList<char[]>();
		
        while(runningStringConfirm == true)
        {
			System.out.print("\nPlease enter the string you wish to convert: ");
			
            stringInput = sc.nextLine();
            
            System.out.println("\nYou have entered: " + stringInput);
            System.out.println("\nWould you like to continue? ");
            System.out.println(" > (Y)es ");
            System.out.println(" > (N)o ");
            System.out.print("\nPlease make your selection: ");
            
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
		
		char[] charArray = new char[stringInput.length()];

		for(int i = 0; i < stringInput.length(); i++)
		{
			charArray[i] = stringInput.charAt(i);

		}

		returnList.add(charArray);

		return returnList;
	}

	public static List<char[]> runAutomaticInput()
	{
		//
	}




}
