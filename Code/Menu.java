import java.util.*;
import java.io.*;

public class Menu
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean runningMain = true;
		
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

}
