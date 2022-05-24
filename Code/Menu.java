import java.util.*;
import java.io.*;

public class Menu
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean runningMain = true;
		
		String input = sc.next();
		
		while(runningMain == true)
		{
			System.out.println("Select which function to run");
	
			System.out.println("(0) > Exit");
			System.out.println("(1) Cat.1a > Convert given string to upper case or lower case");
			System.out.println("(2) Cat.1b > Identify whether numeric values are in a given string");
			System.out.println("(3) Cat.1c > Identify whether a given string is a valid number");
			System.out.println("(4) Cat.1d > Remove numeric values in a given string then conver to upper or lower case");
			System.out.println("(5) Cat.2c > Convert time");

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

		sc.close();

	}

}
