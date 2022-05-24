import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String args[])
	{
		System.out.println("Select which function to run");

		System.out.println("(1) Cat.1a > Convert given string to upper case or lower case");
		System.out.println("(2) Cat.1b > Identify whether numeric values are in a given string");
		System.out.println("(3) Cat.1c > Identify whether a given string is a valid number");
		System.out.println("(4) Cat.1d > Remove numeric values in a given string then conver to upper or lower case");
		System.out.println("(5) Cat.2c > Convert time");
		
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		switch(input)
		{
			case "1":
				//
				break;

			case "2":
				//
				break;

			case "3":
				//
				break;

			case "4":
				//
				break;

			case "5":
				//
				break;
			default:
				System.out.println("Choice was invalid");
		}

		sc.close();

	}

}
