// import all java libraries
import java.util.*;
import java.io.*;
import java.text.*;

// create a class called Functions
public class Functions
{
	// create a function that will take a char array and convert to ascii values
	public static int[] charArrayToAsciiArray(char[] inputArray)
	{
		// create a return array variable
		int[] returnArray = new int[inputArray.length];
		// loop for the duration of the length of the input array
		for(int i = 0; i < inputArray.length; i++)
		{
			// set the current value of return array to the integer type casted value of the input array 
			returnArray[i] = (int)inputArray[i];
		}
		// return the return array
		return returnArray;
	} 

	// create a function that converts an ascii int array into a string
	public static String asciiArrayToString(int[] inputArray)
	{
		// set and initialize the return string
		String returnString = "";
		// loop for the duration of the input array
		for(int i = 0; i < inputArray.length; i++)
		{
			// set the return string to the previous return string plus the char type case of the current input array value
			returnString = returnString + (char)inputArray[i];
		}
		// return the return string
		return returnString;
	}

	// create a function that writes an input string to a certain file name
	// Code from Lecuture 8 of COMP1007
	public static void writeOneRow(String inFileName, String stringToWrite)
	{
		// create an output file stream and set to be empty
		FileOutputStream fileStrm = null;
		// create a print writing variable
		PrintWriter pw;
		// attempt to...
		try
		{
			// ...set the filestream to the passed in filename
			fileStrm = new FileOutputStream(inFileName);
			// set the print writer to the file stream
			pw = new PrintWriter(fileStrm);
			// print to a line, stringToWrite into the print writer
			pw.println(stringToWrite);
			// close the print writer
			pw.close();
		}
		// catch any output exceptions
		catch(IOException e)
		{
			// print out an error message
			System.out.println("Error in writing to file: " + e.getMessage());
		}
	}

	// create a function to ask the user which capitalization they'd like to choose
	public static boolean askWhichCaseMenu()
	{
		// setup, looping, return boolean, and scanner variables
		boolean runningCaseToConvertTo = true;
		boolean wantUpper = false;
		Scanner sc = new Scanner(System.in);
		// runa w hile loop, while the looping variable is true
		while(runningCaseToConvertTo == true)
        {
			// print out options of which case the user can choose to convert to
            System.out.println("\nTo which case would you like to convert to?");
            System.out.println(" > (U)ppercase");
            System.out.println(" > (L)owercase");
			// ask the user to make their selection
            System.out.print("\n\nPlease make your selection: ");
			// set the input to the lowercase version of the next line 
            String caseToConvertInput = sc.nextLine().toLowerCase();
			// compare the input in a switch case
            switch(caseToConvertInput)
            {
				// check if the input was equal to "u"
                case "u":
					// set the return boolean to true
					wantUpper = true;
					// set the looping variable to false
                    runningCaseToConvertTo = false;
					// break out of the switch case
                    break;
				// check if the input was equal to "l"
                case "l":
					// set the return boolean to false
					wantUpper = false;
					// set teh looping variable to false
                    runningCaseToConvertTo = false;
					// break out of the switch case
                    break;
				// if the input doesn't equal any of the cases
                default:
					// tell the user that the input was invalid 
                    System.out.println("Your input was invalid");
            }

        }
		// return the return boolean 
		return wantUpper;
	}
	
	// create a function that'll take a users input and convert the capitalization
	public static void a_ConvertCases(List<char[]> inputCharList)
	{
		// set the capitalization boolean to the output of askWhichCaseMenu
		boolean wantUpper = askWhichCaseMenu();
		
		/*		White-box Testing
		wantUpper = true;
		wantUpper = false;
		*/

		// run a for loop, the duration of the size of the input list
		for(int i = 0; i < inputCharList.size(); i++)
		{
			// set the char array to the i'th value of the input list
			char[] charArray = inputCharList.get(i);
			// convert the char array to an ascii array using charArrayToAsciiArray
			int[] asciiArray = charArrayToAsciiArray(charArray);
			// set up a convertedAsciiArray array
			int[] convertedAsciiArray;
			// set originalString to the output of asciiArrayToString passing in the asciiarray
			String originalString = asciiArrayToString(asciiArray);
			// check if the capitalization boolean is true...
			if(wantUpper == true)
			{
				// set the convertedAsciiArray to the output of arrayToUpper
				convertedAsciiArray = arrayToUpper(asciiArray);

			}
			// ...otherwise
			else
			{
				// set the convertedAsciiArray to the output of arrayToLower
				convertedAsciiArray = arrayToLower(asciiArray);
			}

			// set convertedString to the output of asciiArrayToString passing the convertedAsciiArray
			String convertedString = asciiArrayToString(convertedAsciiArray);
			// set the string to print to be the converted string plus some text
			String stringToPrint = "Your converted string is: " + convertedString;
			// print out the the original, then the converted string
			System.out.println("\nYour original string was: " + originalString);
			System.out.println(stringToPrint);
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
			// write the string to print to a text file called a_ConvertCases.txt using writeOneRow
			writeOneRow("a_ConvertCases.txt", stringToPrint);
		}
	}

	// create a function to convert an ascii array to uppercase
	public static int[] arrayToUpper(int[] inputArray)
	{
		// create a returnArray the same length as the inputArray
		int[] returnArray = new int[inputArray.length];
		// run a for loop the duration of the input array length
		for(int i = 0; i < inputArray.length; i++)
		{
			// check if the current int ascii value is with 96 to 123 exclusive...
			if((inputArray[i] < 123) && (inputArray[i] > 96))
			{
				// set the current returnArray value to the input array value minus 32
				returnArray[i] = inputArray[i] - 32;
			}
			// ...otherwise
			else
			{
				// set the current returnArray value to the currentInput array value
				returnArray[i] = inputArray[i];
			}
		}
		// return the returnArray
		return returnArray;
	}
	
	// create a function to convert an ascii array to lowercase
	public static int[] arrayToLower(int[] inputArray)
	{
		// create a returnArray the same length as the inputArray
		int[] returnArray = new int[inputArray.length];
		// run a for loop the duration of the input array length
		for(int i = 0; i < inputArray.length; i++)
		{
			// check if the current int ascii value is with 64 to 91 exclusive...
			if((inputArray[i] < 91) && (inputArray[i] > 64))
			{
				// set the current returnArray value to the input array value add 32
				returnArray[i] = inputArray[i] + 32;
			}
			// ... otherwise
			else
			{
				// set the current returnArray value to the currentInput array value
				returnArray[i] = inputArray[i];
			}
		}
		// return the returnArray
		return returnArray;
	}

	// create a function to check if numerics exist in a given string
	public static void b_DoNumericsExist(List<char[]> inputCharList)
	{
		// run a for loop for the duration of the inputCharList size
		for(int i = 0; i < inputCharList.size(); i++)
		{
			// set the boolean of doNumericsExist to false
			boolean doNumericsExist = false;
			// set the char arary to the current i'th element of the input list
			char[] charArray = inputCharList.get(i);
			// set asciiArray to the output of charArrayToAsciiArray passing in the char array
			int[] asciiArray = charArrayToAsciiArray(charArray);
			// set originalString to the output of asciiArrayToString passing in asciiArray
			String originalString = asciiArrayToString(asciiArray);
			// set doNumericsExist to the output of checkNumericsExist passing in asciiArray
			doNumericsExist = checkNumericsExist(asciiArray);
			
			/*		White-box Testing
			doNumericsExist = true;
			doNumericsExist = false;
			*/

			// check if doNumericsExist is true...
			if(doNumericsExist == true)
			{
				// set stringToPrint to "number Exist in the string"
				String stringToPrint = "\nNumbers do exist in: " + originalString;
				// print stringToPrint
				System.out.println(stringToPrint);
				System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
				// write the stringToPrint to a file called b_DoNumercsExist.txt using writeOneRow
				writeOneRow("b_DoNumercsExist.txt", stringToPrint);
			}
			// ...otherwise
			else
			{
				// set stringToPrint to "number do NOT exist in the string"
				String stringToPrint = "\nNumbers do NOT exist in: " + originalString;
				// print stringToPrint
				System.out.println(stringToPrint);
				System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
				// write the stringToPrint to a file called b_DoNumercsExist.txt using writeOneRow
				writeOneRow("b_DoNumercsExist.txt", stringToPrint);
			}
		}
	}

	// create a function that checks if numerics exist in a string
	public static boolean checkNumericsExist(int[] inputArray)
	{
		// set booleanToReturn to false
		boolean booleanToReturn = false;
		// run a for loop the duration of the input array length
		for(int i = 0; i < inputArray.length; i++)
		{
			// check if the current value of the input array is between 48 to 57 inclusive
			if((inputArray[i] <= 57) && (inputArray[i] >= 48))
			{
				// set booleanToReturn to true
				booleanToReturn = true;
			}
		}
		// return booleanToReturn
		return booleanToReturn;
	}

	// create a function that checks if the string is a valid number, without other characters
	public static void c_StringIsValidNumber(List<char[]> inputCharList)
	{
		// run a for loop the duration of the input list size
		for(int i = 0; i < inputCharList.size(); i++)
		{
			// set charArray to the current i'th element of the list
			char[] charArray = inputCharList.get(i);
			// set asciiArray to the output of charArrayToAsciiArray passing in charArray
			int[] asciiArray = charArrayToAsciiArray(charArray);
			// create a list an empty list
			List<String> returnedList = new ArrayList<String>();

			// set the returnList to the output of arrayToNumbers passing in asciiArray
			returnedList = arrayToNumbers(asciiArray);
			
			/*	White-box Testing 
			returnedList.set(0, "Invalid");
			returnedList.set(0, "Valid");
			*/

			// set stringToPrint to the 0'th element of the returnedList
			String stringToPrint = "\nThe string: " + asciiArrayToString(asciiArray) + returnedList.get(0);
			// print the stringToPrint
			System.out.println(stringToPrint);
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
			// write the string to print to a text file called c_StringIsValidNumber.txt using writeOneRow
			writeOneRow("c_StringIsValidNumber.txt", stringToPrint);
		}
	}

	public static List<String> arrayToNumbers(int[] inputArray)
	{
		// create outputString and nonNumberString
		String outputString = "";
		String nonNumberString = "";
		
		/*	Redundant Code
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US); // redundant code
		String onlyNumberString = ""; 
		int numDigits = 0;
		int numOfCommasInString = 0;
		int numOfPeriods = 0;
		*/
		
		// set stringIsInvalid to false
		boolean stringIsInvalid = false;
		// create an empty list
		List<String> returnList = new ArrayList<String>();

		// run a for loop the duration of the input array length
		for(int i = 0; i < inputArray.length; i++)
		{
			// check if the current input array element is within 47 to 58 exclusive...
			if((inputArray[i] < 58) && (inputArray[i] > 47))
			{
				// set the output string to the current char type casted value of the current  
				outputString = outputString + (char)inputArray[i];
				/*		Redundant Code
				onlyNumberString = onlyNumberString + (char)inputArray[i];
				numDigits = numDigits + 1;
				*/
			}
			/*		Redundant Code
			else if(inputArray[i] == 44)
			{
				outputString = outputString + ",";
				nonNumberString = nonNumberString + ",";
				numOfCommasInString = numOfCommasInString + 1;
			}
			else if(inputArray[i] == 46)
			{
				outputString = outputString + ".";
				nonNumberString = nonNumberString + ".";
				onlyNumberString = onlyNumberString + (char)inputArray[i];
				numOfPeriods = numOfPeriods + 1;
			}
			*/
			// ... otherwise
			else
			{
				// set stringIsInvalid to true
				stringIsInvalid = true;
				// set nonNumberString to the previous nonNumberString plus the char type cast of the current inputArray
				nonNumberString = nonNumberString + (char)inputArray[i];	
			}

		}
		/*		White-box Testing
		System.out.print("OUTPUT STRING: " + outputString);
		*/
		// check if the outputString is empty
		if(outputString.equals("") == true)
		{
			// set outputString to "0"
			outputString = "0";
		}
		/*
		int numCommasShouldBe = (int)(Math.floor(numDigits/3 - 1));
		int ifMod = (numDigits%3);
		if((ifMod != 0) && (numDigits != 3))
		{
			numCommasShouldBe = numCommasShouldBe + 1;
		}

		String tempString = (String)nf.format(Integer.parseInt(onlyNumberString));
		System.out.println("TEMPSTRING: " + tempString);

		if((numOfPeriods > 1) || (stringIsInvalid == true))
		{
			returnList.add(" was not a real number." );
			returnList.add(nonNumberString);
		}
		else if(tempString.equals(outputString) == false)
		{
			if((numCommasShouldBe != numOfCommasInString) && (onlyNumberString.equals(outputString) == false))
			{
				System.out.println("ONLYNUMBERSTRING: " + onlyNumberString);
				System.out.println("OUTPUTSTRING: " + outputString);
				returnList.add(" was invalid." );
				returnList.add(nonNumberString);
			}
			else
			{
				returnList.add(" was the valid number: " + outputString );
				returnList.add(nonNumberString);
			}
		}
		else
		{
			returnList.add(" was the valid number: " + outputString );
			returnList.add(nonNumberString);
		}
		*/
		// check if stringIsInvalid is true...
		if(stringIsInvalid == true)
		{
			// add string saying invalid to the returnList
			returnList.add(" was invalid. (Commas and Periods are not included)" );
			// add the nonNumberString to returnList
			returnList.add(nonNumberString);
			// add the outputString to returnList
			returnList.add(outputString);
		}
		// ...otherwise
		else
		{
			// add string saying valid to the returnList
			returnList.add(" was the valid number: " + outputString );
			// add the nonNumberString to returnList
			returnList.add(nonNumberString);
			// add the outputString to returnList
			returnList.add(outputString);
		}
		// return the retunrList
		return returnList;
	}

	// create a function that will remove the numerics and then conver the case of a string
	public static void d_RemoveNumericsAndConvertCase(List<char[]> inputCharList)
	{
		// set the wantUpper boolean to the output of askWhichCaseMenu
		boolean wantUpper = askWhichCaseMenu();
		// run a for loop the duration of the list size
		for(int i = 0; i < inputCharList.size(); i++)
		{
			// set charArray to the current list element
			char[] charArray = inputCharList.get(i);
			// set the asciiArray to the output of charArrayToAsciiArray passing charArray
			int[] asciiArray = charArrayToAsciiArray(charArray);
			// create an int array called asciiArrayToString
			int[] convertedAsciiArray;
			// set originalString to the output of asciiArrayToString passing asciiArray
			String originalString = asciiArrayToString(asciiArray);
			// create an empty list called returnedList
			List<String> returnedList = new ArrayList<String>();
			// set returnedList to the output of arrayToNumbers passing asciiArray
			returnedList = arrayToNumbers(asciiArray);
			// set nonNumberStringnonNumberString to the 1st element of returnedList
			String nonNumberString = returnedList.get(1);
			// set charArray to the output of runStringToCharArray from Menu passing nonNumberString
			charArray = Menu.runStringToCharArray(nonNumberString);
			// set asciiArray to charArrayToAsciiArray passing charArray
			asciiArray = charArrayToAsciiArray(charArray);
			// check if wantUpper is true...
			if(wantUpper == true)
			{
				// set convertedAsciiArray to the output of arrayToUpper passing the asciiArray
				convertedAsciiArray = arrayToUpper(asciiArray);

			}
			// ...otherwise
			else
			{
				// set convertedAsciiArray to the output of arrayToLower passing the asciiArray
				convertedAsciiArray = arrayToLower(asciiArray);
			}
			// set convertedString to the output of asciiArrayToString passing in convertedAsciiArray
			String convertedString = asciiArrayToString(convertedAsciiArray);
			// print out the original and the converted strings
			System.out.println("\nYour original string was: " + originalString);
			System.out.println("Your converted string is: " + convertedString);
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
			// save the converted string to d_RemoveNumericsAnConvertCase.txt using writeOneRow
			writeOneRow("d_RemoveNumericsAnConvertCase.txt", "Your converted string is: " + convertedString);
		}
	}

	// create a function called twoC_TimeConversion that'll convert the input between hours, minutes and seconds
	public static void twoC_TimeConversion(List<char[]> inputCharList)
	{
		// set convertFrom and convertTo to the output of whichTimeConversion passing in "from" and "to" respecrtively
		char convertFrom = whichTimeConversion("from");
		char convertTo = whichTimeConversion("to");
		
		// run a for loop, the duration of the size of the inputted list
		for(int i = 0; i < inputCharList.size(); i++)
		{
			// set charArray to the current list element
			char[] charArray = inputCharList.get(i);
			// set asciiArray to the output of charArrayToAsciiArray passing in the char array
			int[] asciiArray = charArrayToAsciiArray(charArray);
			// set timeNumber to the integer of the 2nd element of the output of arrayToNumbers passing in the ascii array
			int timeNumber = Integer.parseInt(arrayToNumbers(asciiArray).get(2));
			
			// set converted time units to 0
			double convertedHours = 0;
			double convertedMintues = 0;
			double convertedSeconds = 0;
			
			/*		White-box Testing
			timeNumber = 1410;

			convertFrom = 'h';
			convertFrom = 'm';
			convertFrom = 's';
			
			convertTo = 'h';
			convertTo = 'm';
			convertTo = 's';
			*/

			// run a switch case comparing convertFrom
			switch(convertFrom)
			{
				// if convertFrom is equal to 'h'
				case 'h':
					// check if convertTo is 'm'
					if(convertTo == 'm') {
						// set convertedMinutes to timeNumber multiplied by 60
						convertedMintues = timeNumber * 60;
					}
					// check if convertTo is equal to convertFrom
					else if(convertTo == convertFrom)
					{
						// set the convertedHours to the time number
						convertedHours = timeNumber;
					}
					// otherwise
					else {
						// set the convertedSeconds to the timeNumber multiplied by 3600
						convertedSeconds = timeNumber * 60 * 60;
					}
					// break out of the case
					break;
				// if convertFrom is equal to 'm'
				case 'm':
					// check if convertTo is 'h'
					if(convertTo == 'h') {
						// set convertedHours to the rounded down values of timeNumbers divided by 60
						convertedHours = Math.floor((double)timeNumber / 60);
						// set the convertedMinutes to the values of timeNumber mod 60
						convertedMintues = timeNumber % 60;
					}
					// check if convertTo is equal to convertFrom
					else if(convertTo == convertFrom)
					{
						// set the convertedMinutes to the timeNumber
						convertedMintues = timeNumber;
					}
					// otherwise
					else {
						// set the converted seconds to the timeNumber multiplied by 60
						convertedSeconds = timeNumber * 60;
					}
					// break out of the case
					break;
				// if convertFrom is equal to 's'
				case 's':
					// check if convertTo is 'h'
					if(convertTo == 'h') {
						// set convertedMinutes to the rounded down value of time number divided by 60
						convertedMintues = Math.floor((double)timeNumber / 60);
						// set the convertedSeconds to the timeNumber mod 60
						convertedSeconds = timeNumber % 60;
						// set the convertHours to the rounded down value of convertedMinutes divided by 60
						convertedHours = Math.floor(convertedMintues / 60);
						// set the converted minutes to convertedMinutes mod 60
						convertedMintues = convertedMintues % 60;
					}
					// check if convertTo is equal to convertFrom
					else if(convertTo == convertFrom)
					{
						// set ocnvertedSeconds to timeNumber
						convertedSeconds = timeNumber;
					}
					// otherwise
					else
					{
						// set convertedMinutes to the rounded down value of timeNumber divided by 60
						convertedMintues = Math.floor((double)timeNumber / 60);
						// set convertedSeconds to timeNumber mod 60
						convertedSeconds = timeNumber % 60;
					}
					// break out of the case
					break;
			}
			// set fromUnit to the outpuf of getFromUnit passing covnertFrom
			String fromUnit = getFromUnit(convertFrom);
			// create stringToPrint, setting it as the converted time of hours, minutes, and seconds
			String stringToPrint = "Your converted time is: " + (int)convertedHours + " Hours, " + (int)convertedMintues + " Minutes and " + (int)convertedSeconds + " Seconds";
			// print out the original and converted time strings
			System.out.println("\nYour original time was: " + timeNumber + fromUnit);
			System.out.println(stringToPrint);
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
			// write thte stringToPrint to d_RemoveNumericsAnConvertCase.txt using writeOneRow
			writeOneRow("d_RemoveNumericsAnConvertCase.txt", stringToPrint);
		}
	}

	// create a function to check which time conversions the user would like to perform
	public static char whichTimeConversion(String choiceIndex)
	{
		// set up return, scanner, input, and looping variable
		char returnChar = '0';
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean runningConvertLoop = true;

		// run a while loop, while the looping variable is true
		while(runningConvertLoop == true)
		{
			// print out which options the user would like to convert based on the choiceIndex passed in
			System.out.println("Which unit would you like to convert " + choiceIndex + "?");
			System.out.println(" > (H)ours");
			System.out.println(" > (M)inutes");
			System.out.println(" > (S)econds");
			// ask the user to make a selection
			System.out.print("\nPlease make your selection: ");
			// set the input to the next lowercase string
			input = sc.next().toLowerCase();
			// compare input using a switch case
			switch(input)
			{
				// if input is "h"
				case "h":
					// set return char to 'h' and set the looping string to false
					returnChar = 'h';
					runningConvertLoop = false;
					// break out of the case
					break;
				// if input is "m"
				case "m":
				// set return char to 'm' and set the looping string to false
					returnChar = 'm';
					runningConvertLoop = false;
					// break out of the case
					break;
				// if input is "s"
				case "s":
				// set return char to 's' and set the looping string to false
					returnChar = 's';
					runningConvertLoop = false;
					// break out of the case
					break;
				// otherwise
				default:
					// tell the user the input was invalid
					System.out.println("The input was invalid");
			}
		}
		// return the returnChar
		return returnChar;
	}

	// create a function to convert the the convert char to a full string
	public static String getFromUnit(char convertFrom)
	{
		// create an empty returnString
		String returnString = "";
		// check if convertFrom is 'h'
		if(convertFrom == 'h')
		{
			// set returnString to " Hours"
			returnString = " Hours";
		}
		// check if convertFrom is 'm'
		else if(convertFrom == 'm')
		{
			// set returnString to " Minutes"
			returnString = " Mintues";
		}
		// otherwise
		else
		{
			// set returnString to " Seconds"
			returnString = " Seconds";
		}
		// return the returnString
		return returnString;
	}

}