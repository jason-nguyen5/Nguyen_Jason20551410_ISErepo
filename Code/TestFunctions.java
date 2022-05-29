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
			System.out.println(" > (1) askWhichCaseMenu");
			System.out.println(" > (2) arrayToUpper");
			System.out.println(" > (3) arrayToLower");
			System.out.println(" > (4) checkNumericsExist");
			System.out.println(" > (5) arrayToNumbers");
			System.out.println(" > (6) whichTimeConversion");
			System.out.println(" > (7) getFromUnit");
			System.out.println(" > (0) Exit");

			System.out.print("\nPlease enter your choice: ");

			String input = sc.next().toLowerCase();
			
			switch(input)
			{
				case "0":
					runningWhichFunction = false;
					break;
                case "1":
                    test_askWhichCaseMenu();
					break;
				case "2":
					test_arrayToUpper();
					break;
                case "3":
                    test_arrayToLower();
					break;
				case "4":
					test_checkNumericsExist();
					break;
                case "5":
                    test_arrayToNumbers();
					break;
				case "6":
					test_whichTimeConversion();
					break;
                case "7":
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

    }
    
    public static void test_arrayToNumbers()
    {

    }
    
    public static void test_whichTimeConversion()
    {

    }
    
    public static void test_getFromUnit()
    {

    }



}