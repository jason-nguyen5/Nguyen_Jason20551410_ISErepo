// impoprt neccesary java repos
import java.util.*;
import java.io.*;

// create a public class
public class Menu
{
	// create the main method to run on startup
	public static void main(String args[])
	{
		// create a scanner, list, and running loop variable
		Scanner sc = new Scanner(System.in);
		List<char[]> listOfStrings = new ArrayList<char[]>();
		boolean runningMain = true;
		
		// set the list to the output of inputTypeMenu
		listOfStrings = inputTypeMenu();

		/*	white-box testing
		listOfStrings.set(0, new char[1])); // 1 Line, Manual Representation
		listOfStrings.add(new char[5]); // 5 character, 3 Lines, Read Representation
		listOfStrings.add(new char[6]); // 6 character, 3 Lines, Read Representation
		listOfStrings.add(new char[2]); // 2 character, 3 Lines, Read Representation
		*/

		// create a while loop that runs while the running loop variable are true and while theh list of strings isn't nothing
		while((runningMain == true) && (listOfStrings.size() != 0))
		{
			// print out the functions menu and options
			System.out.println("\nSelect which function to run:\n");
			
			System.out.println("(1) > Convert given string to upper case or lower case								(1a)");
			System.out.println("(2) > Identify whether numeric values are in a given string							(1b)");
			System.out.println("(3) > Identify whether a given string is a valid number								(1c)");
			System.out.println("(4) > Remove numeric values in a given string then convert to upper or lower case 	(1d)");
			System.out.println("(5) > Convert time																	(2c)");
			System.out.println("(0) > Exit");
			// ask the user to enter their input
			System.out.print("\nPlease enter your choice: ");
			// set the input to the next string the scanner gets
			String input = sc.next();
			// run a switch case comparing against the input value
			switch(input)
			{
				// check that input equals 0
				case "0":
					//System.out.println("0 was choosen");		// White-box testing
					// set the loop to false to stop running
					runningMain = false;
					// break out the case
					break;
				// check that the input equals 1
				case "1":
					//System.out.println("1 was choosen");		// White-box testing
					// run a_ConvertCases from Functions file, passing listOfStrings
					Functions.a_ConvertCases(listOfStrings);
					// break out the case
					break;
				// check that the input equals 1
				case "2":
					//System.out.println("2 was choosen");		// White-box testing
					// run b_DoNumericsExist from Functions file, passing listOfStrings
					Functions.b_DoNumericsExist(listOfStrings);
					// break out the case
					break;
				// check that the input equals 1
				case "3":
					//System.out.println("3 was choosen");		// White-box testing
					// run c_StringIsValidNumber from Functions file, passing listOfStrings
					Functions.c_StringIsValidNumber(listOfStrings);
					// break out the case
					break;
				// check that the input equals 1
				case "4":
					//System.out.println("4 was choosen");		// White-box testing
					// run d_RemoveNumericsAndConvertCase from Functions file, passing listOfStrings
					Functions.d_RemoveNumericsAndConvertCase(listOfStrings);
					// break out the case
					break;
				// check that the input equals 1
				case "5":
					//System.out.println("5 was choosen");		// White-box testing
					// run twoC_TimeConversion from Functions file, passing listOfStrings
					Functions.twoC_TimeConversion(listOfStrings);
					// break out the case
					break;
				// if input doesn't equal any the able
				default:
					//System.out.println("Default Reached");	// White-box testing
					// tell the user that the choice was invalid
					System.out.println("Choice was invalid");
			}
			
		}

	}

	// create a method that asks the user which input type they would like to select
	public static List<char[]> inputTypeMenu()
	{
		// create a scanner for the input
		Scanner sc = new Scanner(System.in);
		// create an empty char array
		List<char[]> returnList = new ArrayList<char[]>();
		// create the loop variable
		boolean runningInputTypeMenu = true;

		// run a while loop while the loop variable is true
		while(runningInputTypeMenu == true)
		{
			// print out asking the user which type of input they'd like to enter
			System.out.println("\nHow would you like to enter you data?");
			System.out.println(" > (R)ead or (A)utomatically from a file?");
			System.out.println(" > (M)anually enter the string?");
			System.out.println(" > (E)xit");
			// ask the user to make their choice
			System.out.print("\nPlease enter your choice: ");
			// set the input to the lowercase version of the next string read by the scanner
			String input = sc.next().toLowerCase();
			// run a switch case comparing the input
			switch(input)
			{
				// if the input equals "e"
				case "e":
					// set the looping variable to false
					runningInputTypeMenu = false;
					// break out of the case
					break;
				// if the input equals "m"
				case "m":
					// set the returnList to the output of runManualInput
					returnList = runManualInput();
					// set the looping variable to false
					runningInputTypeMenu = false;
					// break out of the loop
					break;
				// if the input equals "r"
				case "r":
					// set the returnList to the output of runAutomaticInput
					returnList = runAutomaticInput();
					// set the looping variable to false
					runningInputTypeMenu = false;
					// break out of the switch case
					break;
				// if the input equals "a"
				case "a":
					// set the returnList to the output of runAutomaticInput
					returnList = runAutomaticInput();
					// set the looping variable to false
					runningInputTypeMenu = false;
					// break out of the switch case
					break;
				// if the input didn't equal any of the cases
				default:
					// tell the user the choice was invalid
					System.out.println("Choice was invalid");
			}
		}
		
		// return the returnList
		return returnList;
	}

	// create a method that gets and confirms the string
	public static String stringInputAndConfirm(String query)
	{
		// create scanner, loop, stringInput variables
		Scanner sc = new Scanner(System.in);
        boolean runningStringConfirm = true;
        String stringInput = "";
		// run a loop while the looping variable is true
		while(runningStringConfirm == true)
        {
			// print out the passed in query
			System.out.print("\n" + query);
			// set the stringInput to the next string read by the scanner
            stringInput = sc.nextLine();
            // print out the string the user has entered and ask them to confirm
            System.out.println("\nYou have entered: " + stringInput);
            System.out.println("\nWould you like to continue? ");
            System.out.println(" > (Y)es ");
            System.out.println(" > (N)o ");
            System.out.print("\nPlease make your selection: ");
            // set the confirmInput to the lowercase of the next line
            String confirmInput = sc.nextLine().toLowerCase();
			// run a switch case comparing confirmInput
            switch(confirmInput)
            {
				// if confirmInput equals "y"
				case "y":
					// set the loop variable to false
					runningStringConfirm = false;
					// break out the case
					break;
				// if confirmInput equals "n"
                case "n":
					// set the looping variable to true
					runningStringConfirm = true;
					// break out of the case
					break;
                // if confirmInput doesn't equal any of the cases
                default:
					// tell the user the input was invalid
					System.out.println("That input was invalid");
            }
		}
		// return stringInput
		return stringInput;
	}

	// create a method that converts a string to char array
	public static char[] runStringToCharArray(String stringInput)
	{
		// create a new char array, the length of the string
		char[] charArray = new char[stringInput.length()];
		// run a for loop, until i reaches the length of the stringInput
		for(int i = 0; i < stringInput.length(); i++)
		{
			// set the current i'th element of the char array to the char at i of the string
			charArray[i] = stringInput.charAt(i);
		}
		// return the array
		return charArray;
	}

	// create a method that takes in the user's input and set it to a list
	public static List<char[]> runManualInput()
	{
		// create scanner, stringInput and list variables
		Scanner sc = new Scanner(System.in);
        String stringInput = "";
		List<char[]> returnList = new ArrayList<char[]>();
		// set the stringInput to the out of stringInputAndConfirm asking to enter the string
        stringInput = stringInputAndConfirm("Please enter the string you wish to convert: ");
		/*		White-box testing
		stringInput = "1410";
		stringInput = "Nguyen"
		stringInput = "Jason Nguyen";
		stringInput = "Doctor Strange in the Multiverse of Madness";
		*/

		// add the output of the runStringToCharArray passing in the input
		returnList.add(runStringToCharArray(stringInput));
		// return the returnList
		return returnList;
	}

	// create a method that takes in the user's input and read the input file and save it to a list
	public static List<char[]> runAutomaticInput()
	{
		// create the scanner, input, and the list variables
		Scanner sc = new Scanner(System.in);
        String stringInput = "";
		List<char[]> returnList = new ArrayList<char[]>();
		// set the input to the output of stringInputAndConfirm passing in, asking for the file name and extension
        stringInput = stringInputAndConfirm("Please enter the path to the file, including the extension: ");
		// set the returnList to the out of readFile passing in stringInput
		returnList = readFile(stringInput);
		// return the returnList
		return returnList;
	}

	// create a method that reads a file and return it as a char list
	// Using code from COMP1007 Lecture 8
	public static List<char[]> readFile(String inFileName)
	{
		// create file reading variables
		FileInputStream fileStream = null;
		InputStreamReader isr;
		BufferedReader bufRdr;
		int lineNum;
		String line;
		// create a list of char arrays
		List<char[]> returnList = new ArrayList<char[]>();
		// run a try catch 
		try
		{
			// set filestream, isr, bufRdr to new fileinputstreams, inputstreamreaders, bufferedreaders
			fileStream = new FileInputStream(inFileName);
			isr = new InputStreamReader(fileStream);
			bufRdr = new BufferedReader(isr);
			// set lineNum to 0
			lineNum = 0;
			// set the line to the read line of the buffered reader
			line = bufRdr.readLine();
			// run a while loop, while the line isn't null
			while(line != null)
			{
				// increment lineNum
				lineNum = lineNum + 1;
				// set a temp char array to the output of runStringToCharArray passing in the line
				char[] tempArray = runStringToCharArray(line);
				// add this temp array to returnList
				returnList.add(tempArray);
				// set the line to the next line of the buffered reader
				line = bufRdr.readLine();
			}
			// close the file stream
			fileStream.close();
		}
		// catch errors
		catch(IOException errorDetails)
		{
			// check if the filestream is not null
			if(fileStream != null)
			{
				// run a try catch
				try
				{
					// close the file stream
					fileStream.close();
				}
				// catch any errors
				catch(IOException ex2)
				{ }
			}
			// print out an error message
			System.out.println("Error in fileProcessing: " + errorDetails.getMessage());
			// add a new char array of length 1 to the returnList
			returnList.add(new char[1]);
		}
		// return the returnList
		return returnList;
	}

}
