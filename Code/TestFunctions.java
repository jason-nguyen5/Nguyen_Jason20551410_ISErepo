import java.util.*;
import java.io.*;

public class TestFunctions
{
    String testString1 = "1410";
    char[] charArray1 = Menu.runStringToCharArray(testString1);
    int[] asciiArray1 = Functions.charArrayToAsciiArray(charArray1);

    String testString2 = "Nguyen";
    char[] charArray2 = Menu.runStringToCharArray(testString2);
    int[] asciiArray2 = Functions.charArrayToAsciiArray(charArray2);

    String testString3 = "Jason NGUYEN";
    char[] charArray3 = Menu.runStringToCharArray(testString3);
    int[] asciiArray3 = Functions.charArrayToAsciiArray(charArray3);

    String testString4 = "Doctor Strange in the Multiverse of Madness";
    char[] charArray4 = Menu.runStringToCharArray(testString4);
    int[] asciiArray4 = Functions.charArrayToAsciiArray(charArray4);



    public static void main(String args[])
    {
        boolean runningWhichFunction = true;
        Scanner sc = new Scanner(System.in);

        while(runningWhichFunction == true)
		{
			System.out.println("\nWhich function do you wish to test??");
			//System.out.println(" > (1) askWhichCaseMenu");
			System.out.println(" > (1) arrayToUpper");
			System.out.println(" > (2) arrayToLower");
			System.out.println(" > (3) checkNumericsExist");
			System.out.println(" > (4) arrayToNumbers");
			//System.out.println(" > (6) whichTimeConversion");
			System.out.println(" > (5) getFromUnit");
			System.out.println(" > (0) Exit");

			System.out.print("\nPlease enter your choice: ");

			String input = sc.next().toLowerCase();
			
			switch(input)
			{
				case "0":
					runningWhichFunction = false;
					break;
                //case "1":
                  //  test_askWhichCaseMenu();
					//break;
				case "1":
					test_arrayToUpper();
					break;
                case "2":
                    test_arrayToLower();
					break;
				case "3":
					test_checkNumericsExist();
					break;
                case "4":
                    test_arrayToNumbers();
					break;
				//case "6":
				//	test_whichTimeConversion();
				//	break;
                case "5":
                    test_getFromUnit();
					break;
				default:
					System.out.println("Choice was invalid");
			}
		}
    }		

    public static void test_askWhichCaseMenu()
    {
        //Functions.askWhichCaseMenu().caseToConvertInput = "u";
        //boolean check_askWhichCaseMenu = Functions.askWhichCaseMenu().caseToConvertInput;
        //assert "u" == check_askWhichCaseMenu: "Output was not true";
        
        System.out.println("Test Completed");
    }

    public static void test_arrayToUpper()
    {
        int[] inputArray = {-1,0};
        int[] outputArray = {-1,0};
        assert outputArray[0] == Functions.arrayToUpper(inputArray)[0] : "-1 Boundary";
        assert outputArray[1] == Functions.arrayToUpper(inputArray)[1] : "0 Boundary";

        inputArray[0] = 96;
        inputArray[1] = 97;
        outputArray[0] = inputArray[0];
        outputArray[1] = inputArray[1] - 32;
        assert outputArray[0] == Functions.arrayToUpper(inputArray)[0] : "96 Boundary";
        assert outputArray[1] == Functions.arrayToUpper(inputArray)[1] : "97 Boundary";

        inputArray[0] = 122;
        inputArray[1] = 123;
        outputArray[0] = inputArray[0] - 32;
        outputArray[1] = inputArray[1];
        assert outputArray[0] == Functions.arrayToUpper(inputArray)[0] : "122 Boundary";
        assert outputArray[1] == Functions.arrayToUpper(inputArray)[1] : "123 Boundary";
    }
    
    public static void test_arrayToLower()
    {
        int[] inputArray = {-1,0};
        int[] outputArray = {-1,0};
        assert outputArray[0] == Functions.arrayToLower(inputArray)[0] : "-1 Boundary";
        assert outputArray[1] == Functions.arrayToLower(inputArray)[1] : "0 Boundary";

        inputArray[0] = 64;
        inputArray[1] = 65;
        outputArray[0] = inputArray[0];
        outputArray[1] = inputArray[1] + 32;
        assert outputArray[0] == Functions.arrayToLower(inputArray)[0] : "64 Boundary";
        assert outputArray[1] == Functions.arrayToLower(inputArray)[1] : "65 Boundary";

        inputArray[0] = 90;
        inputArray[1] = 91;
        outputArray[0] = inputArray[0] + 32;
        outputArray[1] = inputArray[1];
        assert outputArray[0] == Functions.arrayToLower(inputArray)[0] : "90 Boundary";
        assert outputArray[1] == Functions.arrayToLower(inputArray)[1] : "91 Boundary";

        System.out.println("\nAll Test Completed");
    }
    
    public static void test_checkNumericsExist()
    {
        int[] inputArray = {47, 48};
        boolean output = true;
        assert output == Functions.checkNumericsExist(inputArray) : "47, 48 Boundary";

        inputArray[0] = 47;
        inputArray[1] = 47;
        output = false;
        System.out.println(Functions.checkNumericsExist(inputArray));
        assert output == Functions.checkNumericsExist(inputArray) : "47 Boundary";

        inputArray[0] = 48;
        inputArray[1] = 48;
        output = true;
        assert output == Functions.checkNumericsExist(inputArray) : "48 Boundary";
        
        inputArray[0] = 57;
        inputArray[1] = 58;
        output = true;
        assert output == Functions.checkNumericsExist(inputArray) : "57, 58 Boundary";

        inputArray[0] = 57;
        inputArray[1] = 57;
        output = true;
        assert output == Functions.checkNumericsExist(inputArray) : "57 Boundary";

        inputArray[0] = 58;
        inputArray[1] = 58;
        output = false;
        assert output == Functions.checkNumericsExist(inputArray) : "58 Boundary";

    }
    
    public static void test_arrayToNumbers()
    {
        int[] inputArray = {47, 48};
        String output = " was invalid. (Commas and Periods are not included)";
        assert output.equals((Functions.arrayToNumbers(inputArray).get(0))) : "47, 48 Boundary";
        
        inputArray[0] = 57;
        inputArray[1] = 58;
        output = " was invalid. (Commas and Periods are not included)";
        assert output.equals((Functions.arrayToNumbers(inputArray).get(0))) : "57, 58 Boundary";

        inputArray = new int[1];
        inputArray[0] = 47;
        output = " was invalid. (Commas and Periods are not included)";
        assert output.equals((Functions.arrayToNumbers(inputArray).get(0))) : "47 Boundary";

        inputArray = new int[1];
        inputArray[0] = 48;
        System.out.println((Functions.arrayToNumbers(inputArray).get(0)));
        output = " was the valid number: 0";
        assert output.equals((Functions.arrayToNumbers(inputArray).get(0))) : "48 Boundary";

        inputArray = new int[1];
        inputArray[0] = 57;
        output = " was the valid number: 9";
        assert output.equals((Functions.arrayToNumbers(inputArray).get(0))) : "57 Boundary";

        inputArray = new int[1];
        inputArray[0] = 58;
        output = " was invalid. (Commas and Periods are not included)";
        assert output.equals((Functions.arrayToNumbers(inputArray).get(0))) : "58 Boundary";
    }
    
    public static void test_whichTimeConversion()
    {
        //
    }
    
    public static void test_getFromUnit()
    {
        char inputChar = 'h';
        String output = " Hours";
        assert output.equals((Functions.getFromUnit(inputChar)));

        inputChar = 'm';
        output = " Minutes";
        assert output.equals((Functions.getFromUnit(inputChar)));

        inputChar = 's';
        output = " Seconds";
        assert output.equals((Functions.getFromUnit(inputChar)));
    }



}