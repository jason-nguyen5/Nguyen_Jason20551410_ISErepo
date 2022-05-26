import java.util.*;
import java.io.*;

public class Functions
{
	public static int[] charArrayToAsciiArray(char[] inputArray)
	{
		int[] returnArray = new int[inputArray.length - 1];

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

	


}
