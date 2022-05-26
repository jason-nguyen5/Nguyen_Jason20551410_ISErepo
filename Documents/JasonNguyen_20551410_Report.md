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

---
## Module Description
---
<p style = "text-align: justify;">
My program currently has five main functions. All of <b>Category 1 and Category 2's (C)</b> conversions. However, there more methods contained in the program exist to aid in the opperation of the system. They were designed to enable the repetition of code without worrying about data redundacy. Each of the main modules was heavily described in the the Preliminary Description documents, however smaller functions haven't been.
</p>

### 1A. Converting a String to Uppercase or Lowercase

<p style = "text-align: justify;">
This function is intended to be used to take a string in and then convert the letter to uppercase or lowercase based on the user's choice. The program should ignore all non-letter characters and only perform the capitilization on the letters of the English alphabet. It doesn't support special letters with tones, as programming for each case would cause the program to contain a lot of if-else or cases, which would hinder the readability of the program. A rough description of how the program works is quoted below: 
<br>

> - This method will run a menu loop that asks the user to choose between converting to uppercase and lowercase.
> - Afterwards the program will run a for loop that will get the i'th element of the list, and set that as a temp array.
> - This array will then passed into "charArrayToAsciiArray" to which it'll then be set to the temp array again.
> - This temp array will then be passed into a function called "arrayToUpper" or "arrayToLower" depending on the option chosen by the user.
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
Text here

> - This method will run loop that runs through the passed list and set the current element of the list to a temp array.
> - This temp array is then going to be passed into another method called "checkNumericsExist"
>   - "checkNumericsExist" will return a true or false value.
>   - It takes the array and cycles through it, checking if there is a value in the array that is between 48 and 57 inc
>   - If it finds a match it'll set a variable called "numericsExistInString" to true.
>   - Then the function will return "numericsExistInString".
> - Based on the returned value the function will print out whether or not a numeric value existed within the provided string.

</p>