<style type="text/css">
  body{
  font-size: 12pt;
}
</style>

# **Introduction to Software Engineering Final Assessment**

<p style="text-align: center;">20551410 - Jason Nguyen</p>
<p style="text-align: center;">Wednesday 4:00PM - 6:00PM</p>
<p style="text-align: center;">Building 314, Room 218</p>

<div style="page-break-after: always;"></div>

---
## **Introduciton**
---

<p style="text-align:justify;">
For the Final Assessment of ISAD1000, we have been tasked with create a program that can perform multiple conversions. We are being evaluated not by our coding skills, but rather our coding pratices which were picked up throughout the semester. It has been designed to test the basics of <b>software testing, modularity, version control and ethics</b>. The were taught and tested through the semester with weekly signoff, however this assessment is about to test our ability to incorporate these technics is actuality. 
</p>

<p style = "text-align: justify;">
In my code I have decided to implement the all four of the <b>Category 1</b> functionalities and then <b>Category 2's</b> time conversion. My code has implemented a system that initially askes if the user would like manually input their values, or to allow the program to read from a file pointed to by the user within a looped menu to avoid any misinputs. When the user makes their choice they are asked to confirm whether what they have entered was correct, and if it was not then they will get an opportunity to type in their string once more. Afterwards the program brings them to another menu displaying the choices of conversion they'd like to follow through with is displayed. The options displayed are: 
<br>
<ol>
  <li>Convert given string to upper case or lower case. . . . . . . . . . . . . . . . . .(1a)</li>
  <li>Identify whether numeric values are in a given string . . . . . . . . . . . . . . .(1b)</li>
  <li>Identify whether a given string is a valid number . . . . . . . . . . . . . . . . .(1c)</li>
  <li>Remove numeric values in a given string then convert to upper or lower case . . . .(1d)</li>
  <li>Convert time. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .(2c)</li>
</ol>
Aferwards, the user can choose any conversion they'd like and the program will run the conversion and print out the result, along with saving the result to a text document. After each conversion the user is brought back to the same menu where they can choose another conversion or to hit <b>0.</b> to exit and quit the program.
</p>

<p style = "text-align: justify;">
The code has been designed to where I have created multiply functions that rely on one another. Newer functions can call upon old functions to use their outputs. While this does increase coupling, it does promote the program to be more generic and versatile. The program is designed to use arrays and lists, for both automatic and manual data entry, so no matter what method of inputting data, the program still runs the same exact code without needing modification. There is a menu class which will be ran on startup, however it only gets the input type which conversion the user would like to run. When it comes to the actual calculations, the functions have been put in anothe class which the menu file calls and uses.
</p>

<p style = "text-align: justify;">
As for testing,
</p>

<div style="page-break-after: always;"></div>

---
## Module Description
---
<p style = "text-align: justify;">
My program currently has five main functions. All of <b>Category 1 and Category 2's (C)</b> conversions. However, there more methods contained in the program exist to aid in the opperation of the system. They were designed to enable the repetition of code without worrying about data redundacy. Each of the main modules was heavily described in the the Preliminary Description documents, however smaller functions haven't been.
</p>

### 1A. Converting a String to Uppercase or Lowercase

<p style = "text-align: justify;">
This function is intended to be used to take a string in and then convert the letter to uppercase or lowercase based on the user's choice. The program should ignore all non-letter characters and only perform the capitilization on the letters of the English alphabet. It doesn't support special letters with tones, as programming for each case would cause the program to contain a lot of if-else or cases, which would hinder the readability of the program. A rough description of how the program works is quoted and adjusted from the Preliminary Description: 
<br>

> - This method will run a menu loop that asks the user to choose between converting to uppercase and lowercase.
> - Afterwards the program will run a for loop that will get the i'th element of the list, and set that as a char array.
> - This array will then passed into "charArrayToAsciiArray" to which it'll then be set to an ascii array.
> - This ascii array will then be passed into a function called "arrayToUpper" or "arrayToLower" depending on the option chosen by the user.
>   - The program will check if the int is within the range of being either lowercase or uppercase and convert them to the right case by adding or subtracting 32 for each respective cases.
>   - It'll loop through the entire array and set the current element of the passed array.
>   - Then it'll run asciiArrayToString method and set the output to "returnString"
>   -  Afterwards it'll return this string.
> - The returned value will then be saved into a "convertedString" variable.
> - And the program will print both the original and "convertedString" variable out to the user and save it into a next row of a new file.
> - The program will then loop through and then afterwards end itself and save that new file.

</p>

### 1B. Identifying Whether or Not a String Contains Any Numbers

<p style = "text-align: justify;">
This function is inteded to be used in order to take in a string, and then check if there are any numbers within the string. After checking each character in the string th eprogram will display a message of whether there was or wasn't a number within the string. Afterward it should write the result out to a file. It'll accomplish this by checking the ascii value of the char against the range of ascii values between 48 & 57 inclusive, as those are the ascii values of the number 0-9. A runthrough of how the program is quote and adjusted form the Preliminary Description below:
<br>

> - The method will run a for loop that will get the i'th element of the list, and set that as a char array.
> - This array will then passed into "charArrayToAsciiArray" to which it'll then be set to an ascii array.
> - The ascii array is then sent into a function called "checkNumericsExist" and the output assigned to "doNumericsExist".
>   - The function will loop through each element in the array.
>   - And check them against the range of 48 to 57 inclusive.
>   - If there is a number within the range, a return boolean is set to true, otherwise it remains false.
> - Afterwards, the main method will run an if statement check if the variable "doNumericsExist" is true or false.
> - Depending on which state the boolean is, it'll print out saying that there was or wasn't a number in the given string.
> Lastly it'll save the print output into a file.

</p>

### 1C. Identifying Whether or Not a Given String is a Valid Number

<p style = "text-align: justify;">
The purpose of this function is to identify is the string that is give is a valid number. It checks is there or only numbers contained within a string that is provided, otherwise it'll tell the user that the string proposed was no valid. It does this by checking if the passed ascii values array has any values which are not within the range of 48 to 57 represent the numbers 0-9. If there are any outside this range it'll return a string state that the initial string provided was invalid. A rundown of the code is taken from the preliminary description and shown below:
<br>

> - The program will run a for loop that will get the i'th element of the list, and set that as a char array.
> - Afterwards, inside this loop the array is passed into a function called charArrayToAsciiArray to convert the char array to an ascii array.
> - This array is then sent to "arrayToNumbers" and the return value to a list.
>   - Inside "arrayToNumbers" it'll loop based on the length of the array.
>   - Inside this loop it'll set "inputArray" to the i'th element and compare using an if statement.
>     - If "inputArray" value is between 48 and 57 inclusive, it'll set outputString to outputString + the respective number.
>     - Otherwise, it'll set "stringIsInvalid" to true, and set "nonNumberString" to the "noNumberString" + the value of the current element.
>   - At the end it'll check if "stringIsInvalid" is true.
>     - If so, the returnList element 0 is set to " was invalid. (Commas and Periods are not included)".
>     - Otherwise the returnList element 0 is set to " was the valid number: " + outputString
>     - Plus it'll set the returnList element 1 to "nonNumberString".
>     - And returnList element 2 to "outputString".
>   - Afterwards the function will set "stringToPrint" to the 0'th element of the returned list.
>   - Lastly, the program will print out the result and save it to a text file.
</p>

### 1D. Removing Numbers from a String and Changing the Case

<p style = "text-align: justify;">
This function is designed to take in a string and then remove any numbers that are in it and then change the capitalization of the string through user input. First it'll take in the string and convert it to an ascii array, and then check if there are any ascii values that represent numbers. If so it'll remove those values and then ask the user if they'd like to go to lowercase of upppercase. This function reuses code from 1A and 1C, and a breakdown of the code is taken from the Preliminary Description and shown below:
<br>

> - This method will run a menu loop that asks the user to choose between converting to uppercase and lowercase.
>  - Afterwards, the program will run a loop that'll get the i'th element of the passed in list, and set it to a char array.
> - This char array is then converted to an ascii array.
> - The ascii array then sent to "arrayToNumbers" and the 1st element set to "nonNumberString".
> - "nonNumberString" is then changed to a char array then to an ascii value array.
> - Afterwards, the new ascii array is then passed into "arrayToUpper" or "arrayToLower" depending on the the choice the user made.
> - Finally it is printout out and then saved into a text file.
</p>

### 2C. Conveting a Number Between Hours, Minutes and Seconds

<p style = "text-align: justify;">
This code is used to convert a given amount of time to a different unit of time. It can convert seconds, to minutes or hours, vice versa in any combination. You could go directly from hours to seconds, rather than hours to minutes. Doing it this way made it a lot easier without having to think about too much extra. It works by taking in the the units the user in coming from and then which units they'd like to convert to. An overview of the code was taken from the Preliminary Decription, adjusted and displayed below:
<br>

> - The function will start by running a new menu funciton called "whichTimeConversion".
> - This'll get the units in which the user wants to convert to and from.
> - It'll set the units to "convertTo" and "convertFrom".
> - Afterwards, it'll run a loop that will get the i'th element of the passed in list and set it to a char array.
> - This char array is then converted to an ascii array.
> - Then "timeNumber" is set to the parsed integer form of the 2nd element of "arrayToNumbers" passing in the ascii array.
> - Afterwards a switch case is used to check "convertFrom" and then run if statements inside each case.
>   - It checks the "convertTo" value and then does multiplication or division dependingly.
>   - It all also does a mod check to get the remainder and then set each of the "convertedHours", "convertedMinutes", "convertedSeconds" variables.
> - These variables are then put into a string with the original unit to convert from.
> - And then printed to the terminal and saved in a text file.
> 
</p>

---
## Modularity
----

<p style = "text-align: justify;">
<i>Description on how to run your production code with correct commands.
Discussion on how different modularity concepts are applied in your code, review checklist you have created, results of conducting the review using the review checklist with explanation on your results and how you have addressed any issues.
You can use screen shots to support your answer in this part.</i>

In order to run the production code, you need to build the Menu.java file using `javac Menu.java`. This should automatically build the Function.java aswell, as the Menu file calls upon the Function file. Afterwards the Menu can simply be run using `java Menu`. All these commands should be run inside the Cdoe folder directory. Afterwards the user can just follow the on-screen instructions and make their choices using the keyboard.
</p>

<p style = "text-align: justify;">
Some of the modularity concepts used in my code are, coupling, cohension and redundacy. Code has been programmed in a sense where there is little to no reliance on global variables. All functions create their own local variables, and either get passed or return variables. There should be no instances where global variables are being adjusted within the entire program. Furthermore, variables have been named very clearly and are named based on their function so that upon quick inspection, it is easy to tell what the variable should be. i.e, the boolean wantUpper would indicate that depending on if it's true or false the user want to convert to upper or lowercase. Additionally, all functions and variables have adhered to camal casing practices.  
</p>

<p style = "text-align: justify;">
Cohesion and redundacy have been represent through the menu codes. Most of the menus are run using methods that contain loops. This is so that the main code can be presented as more readble while still being able to undestand where the certain print statements are located. Within these menus, they all run while loops that check the user's input and they should all be able to realise when the input is invalid and request the user to try again. A prime example or redudancy avoidance, is the reusage of modules from 1A and 1C for the completion of 1D. The task for 1D requires the program to remove numbers, and change the cases, therefore I just reused the menu from 1A asking which case the user would like to change. In addition, from 1C, additionally functionality was added so that while it's check the ascii values of the non 0-9 numbers, it'd add them to another array and return that as 2nd element in the already returned list. Writing the code in 1C made more sense than rewriting the same exact checking code except with different outputs. By simply adding an extra few lines of code, it made it reusable and prevention the need for excessive repeated code. Afterwards just converting the arrays to upper and lowercase was easily done by calling the respective functions.
</p>

<b> Coding Checklist </b>
<ol>
  <li>Is each "/" operator working with the correct datatype?</li>
  <li>Do all string comparisons use the ".equals()" method?</li>
  <li>For functions that return a value, is the returned value being used?</li>
  <li>Are there any variables that have not been initialized?</li>
  <li>Are the return values the same and as the function type?</li>
  <li>Are there "tolerance" values for real numbers?</li>
  <li>Do calls provide the necessary parameters in the correct order?</li>
  <li>Can a variable's purpose be quick and easily identified by just the name?</li>
  <li>Are there null values being used?</li>
  <li>Are arrays and variables atleast set to empty rather than null?</li>
  <li>Are there any global variables?</li>
  <li>Are if statements less than 3 if's long?</li>
  <li>Are lines of code larger than the screen and need to go to next line?</li>
  <li>Are comments on seperate lines?</li>
  <li>Are all lines of code ended with a semi-coloum, where necessary?</li>
  <li>Are variables created, and assigned in the right order?</li>
</ol>

---
## Black-Box Test Cases
----

### 1A. Converting a String to Uppercase or Lowercase

<p style = "text-align: justify;">
Boundary Value Testing was chosen to test this function. It was chosen as the input is an integer from an integer array. The code compares current element of the array against a range of integers that represent the capitalization of each character in a string. Testing these boundaries can verify that the set ranges are working properly and perform the right function based on the calculation being required. However, the code still needs to take in the user input before performing the conversion, as it needs to ask if the user is converting to uppercase or lowercase. There is no need to test these values, as the program will automatically let the user know if the input was invalid. 

Since we are only testing the raw, arrayToUpper and arrayToLower, we can use an array with the numbers, -1 & 0, to check the valid ascii boundary, 64 & 65 for the boundary between uppercase "A" and then 90 & 91 for the boundary between uppercase "Z" for arrayToLower. Values between 65 and 90 inclusive, should be registered as valid and change to their lowercase counterpart, while any other values should remain the exact same. Similarly, for arrayToUpper, the values -1 & 0, for ascii range, 96 & 97 for lowercase "a", and 122 & 123 for lowercase "z". Once more, only those within the lowercase bounds should change and nothing else should become different.
<br>

</p>

---
## White-Box Test Cases
----

<p style = "text-align: justify;">
All test cases you have designed as answer for the part 5 of this assessment, assumptions you made if any, brief explanation why you have done the test design in the way you have done
<br>
</p>

---
## Test Implementation and Testing
----

<p style = "text-align: justify;">
Description of how to run your test code with correct commands.
Results of test execution with test success and failures with short discussion of results from part 6 of this assessment, discussion on whether you have attempted to improve your code and new results, if any.
You can use screen shots to support your answer in this part.
You are supposed to produce a table which shows following information to help you and the marker to check the work you have done. ( EP: Equivalence partitioning, BVA: Boundary value Analysis, BB : Black-box, WB: White-box)
<br>
</p>

---
## Version Control
----

<p style = "text-align: justify;">
Log of the use of your version control system, any explanation /discussion on version control. (refer part 1 of the detailed description)
<br>
</p>

---
## Ethics
----

<p style = "text-align: justify;">
Answer to Q7
<br>
</p>

---
## Discussion
----

<p style = "text-align: justify;">
Reflection of your own work, ways to improve your work and any other thing you wish to present.
<br>
</p>