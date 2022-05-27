import java.util.*;
import java.io.*;

public class Functions
{
	public static int[] charArrayToAsciiArray(char[] inputArray)
	{
		int[] returnArray = new int[inputArray.length];

		for(int i = 0; i < inputArray.length; i++)
		{
			returnArray[i] = (int)inputArray[i];
		}
	
		return returnArray;
	} 

	public static String asciiArrayToString(int[] inputArray)
	{
		String returnString = "";

		for(int i = 0; i < inputArray.length; i++)
		{
			returnString = returnString + (char)inputArray[i];
		}

		return returnString;
	}

	// Code from Lecuture 8 of COMP1007
	public static void writeOneRow(String inFileName, String stringToWrite)
	{
		FileOutputStream fileStrm = null;
		PrintWriter pw;
		try
		{
			fileStrm = new FileOutputStream(inFileName);
			pw = new PrintWriter(fileStrm);
			pw.println(stringToWrite);
			pw.close();
		}
		catch(IOException e)
		{
			System.out.println("Error in writing to file: " + e.getMessage());
		}
	}

	public static boolean askWhichCaseMenu()
	{
		boolean runningCaseToConvertTo = true;
		boolean wantUpper = false;
		Scanner sc = new Scanner(System.in);
		
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
					wantUpper = true;
                    runningCaseToConvertTo = false;
                    break;

                case "l":
					wantUpper = false;
                    runningCaseToConvertTo = false;
                    break;

                default:
                    System.out.println("Your input was invalid");
            }

        }

		return wantUpper;
	}
	
	public static void a_ConvertCases(List<char[]> inputCharList)
	{
		boolean wantUpper = askWhichCaseMenu();
		
		for(int i = 0; i < inputCharList.size(); i++)
		{
			char[] charArray = inputCharList.get(i);
			int[] asciiArray = charArrayToAsciiArray(charArray);
			int[] convertedAsciiArray;
			String originalString = asciiArrayToString(asciiArray);

			if(wantUpper == true)
			{
				convertedAsciiArray = arrayToUpper(asciiArray);

			}
			else
			{
				convertedAsciiArray = arrayToLower(asciiArray);
			}

			String convertedString = asciiArrayToString(convertedAsciiArray);

			System.out.println("\nYour original string was: " + originalString);
			System.out.println("Your converted string is: " + convertedString);
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

			writeOneRow("a_ConvertCases.txt", convertedString);
		}
	}

	public static int[] arrayToUpper(int[] inputArray)
	{
		int[] returnArray = new int[inputArray.length];
		for(int i = 0; i < inputArray.length; i++)
		{
			if((inputArray[i] < 123) && (inputArray[i] > 96))
			{
				returnArray[i] = inputArray[i] - 32;
			}
			else
			{
				returnArray[i] = inputArray[i];
			}
		}

		return returnArray;
	}

	public static int[] arrayToLower(int[] inputArray)
	{
		int[] returnArray = new int[inputArray.length];
		for(int i = 0; i < inputArray.length; i++)
		{
			if((inputArray[i] < 91) && (inputArray[i] > 64))
			{
				returnArray[i] = inputArray[i] + 32;
			}
			else
			{
				returnArray[i] = inputArray[i];
			}
		}

		return returnArray;
	}

	public static void b_DoNumericsExist(List<char[]> inputCharList)
	{
		for(int i = 0; i < inputCharList.size(); i++)
		{
			boolean doNumericsExist = false;
			char[] charArray = inputCharList.get(i);
			int[] asciiArray = charArrayToAsciiArray(charArray);
			String originalString = asciiArrayToString(asciiArray);

			doNumericsExist = checkNumericsExist(asciiArray);

			if(doNumericsExist == true)
			{
				System.out.println("\nNumbers do exist in: " + originalString);
				System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
				
				writeOneRow("b_DoNumercsExist.txt", "Numbers do exist");
			}
			else
			{
				System.out.println("\nNumbers do NOT exist in: " + originalString);
				System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
				
				writeOneRow("b_DoNumercsExist.txt", "Numbers do NOT exist");
			}
		}
	}

	public static boolean checkNumericsExist(int[] inputArray)
	{
		boolean booleanToReturn = false;
		for(int i = 0; i < inputArray.length; i++)
		{
			if((inputArray[i] < 58) && (inputArray[i] > 47))
			{
				booleanToReturn = true;
			}
		}

		return booleanToReturn;
	}


}
