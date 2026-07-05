/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates.
 */
package Presentation; // Specifies that this class belongs to the Presentation package.

import java.util.Scanner; // Imports the Scanner class to read user input.

/**
 *
 * @author 03
 */
public class Method {

    public static void main(String[] args) {

        // ---------------- contains() ----------------
        //Checks if a string contains a specific word or sequence of characters. Returns true if found; otherwise false.
        System.out.println("Contains()"); // Displays the method name.

        // Creates a String variable.
        String message = "Welcome to the Java Programming";

        // Checks if the string contains the word "Java".
        if (message.contains("Java")) {

            // Executes when "Java" exists in the string.
            System.out.println("The word 'Java' was found.");

        } else {

            // Executes when "Java" does not exist in the string.
            System.out.println("The word 'Java' was not found.");
        }

        // Prints a blank line.
        System.out.println("");

        // ---------------- endsWith() ----------------
        //Checks if a string ends with a specified suffix. Returns true or false.
        System.out.println("EndsWith()"); // Displays the method name.

        // Creates a String variable.
        String text = "Programming.java";

        // Checks if the string ends with ".java".
        System.out.println("Ends with .java : " + text.endsWith(".java"));

        // Checks if the string ends with ".txt".
        System.out.println("Ends with .txt : " + text.endsWith(".txt"));

        // Prints a blank line.
        System.out.println("");

        // ---------------- startsWith() ----------------
        //Checks if a string starts with a specified prefix. Returns true or false.
        System.out.println("startsWith()"); // Displays the method name.

        // Creates a String variable.
        String starts = "Java Programming";

        // Checks if the string starts with "Java".
        System.out.println("Starts with Java : " + starts.startsWith("Java"));

        // Checks if the string starts with "Python".
        System.out.println("Starts with Python : " + starts.startsWith("Python"));

        // Prints a blank line.
        System.out.println("");

        // ---------------- indexOf() ----------------
        //Returns the index of the first occurrence of a character or substring. Returns -1 if not found.
        System.out.println("IndexOf()"); // Displays the method name.

        // Creates a String variable.
        String index = "Programming";

        // Returns the index of the first occurrence of 'g'.
        System.out.println("Index of 'g' : " + index.indexOf("g"));

        // Returns the index of the first occurrence of 'm'.
        System.out.println("Index of 'm' : " + index.indexOf("m"));

        // Returns -1 because 'z' does not exist.
        System.out.println("Index of 'z' : " + index.indexOf("z"));

        // Prints a blank line.
        System.out.println("");

        // ---------------- isEmpty() ----------------
        //Checks if a string is empty. Returns true if it has no characters; otherwise false.
        System.out.println("isEmpty()"); // Displays the method name.

        // Creates an empty string.
        String empty1 = "";

        // Creates a non-empty string.
        String empty2 = "Java";

        // Checks whether the first string is empty.
        System.out.println("empty1 is empty : " + empty1.isEmpty());

        // Checks whether the second string is empty.
        System.out.println("empty2 is empty : " + empty2.isEmpty());

        // Prints a blank line.
        System.out.println("");

        // ---------------- trim() ----------------
        //Removes spaces at the beginning and end of a string.
        System.out.println("Trim()"); // Displays the method name.

        // Creates a string with extra spaces.
        String trim = "   Hello Trim    ";

        // Displays the original string.
        System.out.println("Before trim :");
        System.out.println("'" + trim + "'");

        // Removes leading and trailing spaces.
        System.out.println("After trim :");
        System.out.println("'" + trim.trim() + "'");

        // Prints a blank line.
        System.out.println("");

        // ---------------- replace() ----------------
        //Replaces a specified character or word with another character or word.
        System.out.println("Replace()"); // Displays the method name.

        // Creates a String variable.
        String replace = "I like badminton.";

        // Replaces "badminton" with "basketball".
        String newText = replace.replace("badminton", "basketball");

        // Displays the original string.
        System.out.println("Original : " + replace);

        // Displays the modified string.
        System.out.println("Updated  : " + newText);

        // Prints a blank line.
        System.out.println("");

        // ---------------- toCharArray() ----------------
        //Converts a string into an array of characters.
        System.out.println("toCharArray()"); // Displays the method name.

        // Creates a String variable.
        String array = "Java";

        // Converts the string into an array of characters.
        char[] letters = array.toCharArray();

        // Displays a heading.
        System.out.println("Characters in the string:");

        // Loops through each character in the array.
        for (char letter : letters) {

            // Prints one character at a time.
            System.out.println(letter);
        }

        // Prints a blank line.
        System.out.println("");

        // ---------------- nextLine().charAt() ----------------
        //Reads user input and gets the character at a specified index.
        System.out.println("nextLine().charAt()"); // Displays the method name.

        // Creates a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a name.
        System.out.print("Enter your Name: ");

        // Reads the entire line and gets the first character.
        char firstLetter = input.nextLine().charAt(0);

        // Displays the first character entered.
        System.out.println("First letter : " + firstLetter);

        // Prints a blank line.
        System.out.println("");

        // ---------------- valueOf() ----------------
        //Converts different data types into a String.
        System.out.println("valueOf()"); // Displays the method name.

        // Declares an integer variable.
        int number = 100;

        // Declares a double variable.
        double decimal = 99.99;

        // Declares a boolean variable.
        boolean status = true;

        // Converts the integer into a String.
        String numString = String.valueOf(number);

        // Converts the double into a String.
        String decString = String.valueOf(decimal);

        // Converts the boolean into a String.
        String staString = String.valueOf(status);

        // Displays the converted integer string.
        System.out.println("Integer : " + numString);

        // Displays the converted double string.
        System.out.println("Double  : " + decString);

        // Displays the converted boolean string.
        System.out.println("Status  : " + staString);

        // Closes the Scanner object.
        input.close();
    }
}