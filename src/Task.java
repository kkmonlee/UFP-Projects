/**
 * Created by Atul Anand Sinha on 04 May 2016.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NM
 */
public class Task {

    // attributes
    Scanner userInput;
    int store[] = new int[]{1, 2, 3, 4, 5};

    // This is a special method called a constructor
    // It is called when the object is created
    Task() {
        System.out.println("This is the constructor method");
        userInput = new Scanner(System.in);
    }

    // Define a method to acomplish each of the tasks you have been set
    void showNumbers() {
        int index;
        System.out.println("This is the showNumbers() method");

        // display the first 5 positive integers
        for (index = 1; index < 6; index++) {
            System.out.printf("%d\n", index);
        }
    }


    // method to display a prompt string
    // and read a single integer from the user
    // Note there is no check for invalid input
    // returns the value of the integer entered by the user
    int getInteger(String promptStr) {
        String inputStr;
        int value;
        System.out.println(promptStr);
        inputStr = userInput.nextLine();
        value = Integer.parseInt(inputStr);
        return (value);
    }

    // method to display a prompt string and read a single real number from the user
    // Note there is no check for invalid input
    // returns the value of the real number entered by the user as a float type
    float getReal(String promptStr) {
        String inputStr;
        float value;
        System.out.println(promptStr);
        inputStr = userInput.nextLine();
        value = Float.parseFloat(inputStr);
        return (value);
    }

    // method to display a prompt string
    // and read a text string from the user
    // Note there is no check for invalid input
    // returns the value of the text entered by the user
    String getText(String promptStr) {
        String inputStr;
        String valueStr;
        System.out.println(promptStr);
        valueStr = userInput.nextLine();
        return (valueStr);
    }

    boolean linearSearch(int [] arr, int target)
    {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                return true;
            }
            ++i;
        }
        return false;
    }


    void PlanetWeight()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in Kgs: \n");
        DecimalFormat df = new DecimalFormat("#.00");

        double humanWeight = input.nextDouble();
        double mass = humanWeight / 9.8;

        double timePeriod;
        double earthTimePeriod = 2 * Math.PI * Math.sqrt(0.5 / 1);

        System.out.print("Your mass on Earth is: " + mass + "\n");
        System.out.print("The time period of a 0.5m pendulum on Earth is: " + df.format(earthTimePeriod) + "\n");

        System.out.print("Choose your planetary body: \n 1. Mercury \n 2. Venus \n 3. Moon \n 4. Mars \n 5. Jupiter \n 6. Saturn \n 7. Uranus \n 8. Neptune\nType the number you want: ");
        Scanner input2 = new Scanner(System.in);
        int planetNumInt = input2.nextInt();


        int switchArray[] = {1, 2, 3, 4, 5, 6, 7, 8};


        switch(planetNumInt) {
            case 1:
                if (linearSearch(switchArray, 1)) {
                    planetNumInt = (int) (humanWeight * 0.378);
                    System.out.println("Your weight on Mercury is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.378);
                    System.out.println("The time period of a 0.5m pendulum on Mercury is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 2:
                if (linearSearch(switchArray, 2)) {
                    planetNumInt = (int) (humanWeight * 0.907);
                    System.err.println("Your weight on Venus is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.907);
                    System.out.println("The time period of a 0.5m pendulum on Venus is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 3:
                if (linearSearch(switchArray, 3)) {
                    planetNumInt = (int) (humanWeight * 0.166);
                    System.err.println("Your weight on the Moon is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.166);
                    System.out.println("The time period of a 0.5m pendulum on Moon is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 4:
                if (linearSearch(switchArray, 4)) {
                    planetNumInt = (int) (humanWeight * 0.377);
                    System.err.println("Your weight on Mars is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.377);
                    System.out.println("The time period of a 0.5m pendulum on Mars is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 5:
                if (linearSearch(switchArray, 5)) {
                    planetNumInt = (int) (humanWeight * 2.36);
                    System.err.println("Your weight on Jupiter is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 2.36);
                    System.out.println("The time period of a 0.5m pendulum on Jupiter is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 6:
                if (linearSearch(switchArray, 6)) {
                    planetNumInt = (int) (humanWeight * 0.916);
                    System.err.println("Your weight on Saturn is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.916);
                    System.out.println("The time period of a 0.5m pendulum on Saturn is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 7:
                if (linearSearch(switchArray, 7)) {
                    planetNumInt = (int) (humanWeight * 0.889);
                    System.err.println("Your weight on Uranus is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.889);
                    System.out.println("The time period of a 0.5m pendulum on Uranus is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 8:
                if (linearSearch(switchArray, 8)) {
                    planetNumInt = (int) (humanWeight * 1.12);
                    System.err.println("Your weight on Neptune is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 1.12);
                    System.out.println("The time period of a 0.5m pendulum on Neptune is: " + df.format(timePeriod) + "s\n");
                }
                break;

            default:
                System.out.println("Wrong number.");
                break;

        }


    }




    // Makes a root calculator for a given number
    // double number is the number from which we extract the square root
    void HerosMethod()
    {
        Scanner input = new Scanner(System.in);
        final double epsilon = 1e-7; // amount of precision
        double guess;       // first guess of value
        //double root;    // current estimate of sqrt(x)
        //double lroot;   // last estimate of sqrt(x)
        double value;   // number of which we're trying to find the sqrt

        // read x
        do {
            System.out.println("Enter the number: ");
            value = input.nextDouble();


            if (value < 0) {
                System.out.println("No real results.\n");
                System.out.println("Please enter a positive number. \n");
            }
        } while (value < 0);

        System.out.println("Enter your first guess of the root: \n");
        guess = input.nextDouble();

        // Hero's Method
        int iterations = 0;

        while (Math.abs((guess * guess) - value) > epsilon) {


            guess = (guess + (value / guess)) / 2.0;
            iterations++;
        }

        System.out.printf("Square root of " + value + " is %5.2f \n", guess);

        System.out.println("This value has been iterated " + iterations + " amounts of times.");

        System.out.println("Math.sqrt(value) = " + Math.sqrt(value));


    }

    // Making intSearch() method more global and reusable
    void doSearch() {
        int searchTerm;
        System.out.println(store.length);
        searchTerm = getInteger("Please enter a number: \n");

        if (intSearch(store, searchTerm)) {
            System.out.println("Integer was found. \n");
        } else {
            System.out.println(searchTerm + " was not found in the array.\n");
        }

    }

    boolean intSearch(int [] intArray, int searchFor)
    {
        int i = 0;                  // index
        boolean found = false;      // setting boolean value to false until search item is found

        // searches for integer searchFor while boolean remains false
        // and while i is smaller than array's length

        do {
            if (intArray[i] == searchFor) {
                found = true;
            }

            i++;
            System.out.print(i + " ");
        } while (!found && i < intArray.length);

        return found;
    }

    // Making bubbleSort() method more usable
    void doSort() {
        bubbleSort(store);
    }

    // My version of Bubble Sort
    void bubbleSort(int[] intArray) {
        int i;                  // index
        int j;                  // index 2
        int numSwaps = 0;       // number of swaps
        int numCompares = 0;    // number of comparisions

        for (i = 0; i < intArray.length; i++) {
            for (j = i + 1; j < intArray.length; j++) {
                int temp = 0;   // temporary placeholder for swapping numbers
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;

                    numSwaps++;
                }

                numCompares++;
            }
        }

        System.out.print("Printing numbers in ascending order: \n");
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "\n");
        }
        System.out.print("Number of swaps: " + numSwaps + "\n");
        System.out.print("Number of comparisions: " + numCompares + "\n");
    }

    // Dr Mulvey's version of Bubble Sort
    void bubbleSort2(int[] intArray) {
        int i;                  // index
        int j;                  // index 2
        int numSwaps = 0;       // number of swaps
        int numCompares = 0;    // number of comparisions
        int length = intArray.length;
        boolean swapped = false;

        do {
            swapped = false;
            for (j = 0; j < length - 1; j++) {
                int temp = 0;   // temporary placeholder for swapping numbers
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                    swapped = true;

                    numSwaps++;
                }
                numCompares++;
            }
            length--;
        } while (swapped);

        System.out.print("Printing numbers in ascending order: \n");
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "\n");
        }
        System.out.print("Number of swaps: " + numSwaps + "\n");
        System.out.print("Number of comparisions: " + numCompares + "\n");
    }

    // When decimal entered, output's the binary equivalent of the integer
    void denaryToBinary()
    {
        System.out.println("Enter the number you want to convert to binary: \n");
        int userNumber = userInput.nextInt();

        // If the input is negative or exceeds 255 then print error
        if (userNumber > 255 || userNumber < 0)
        {
            System.out.println("Integer is either negative or too big. \n");
        }
        else {
            String binary = "";         // This is the string representation of a binary number

            // We need i < 8 because the number must be 8 digits long
            for (int i = 0; i < 8; i++) {
                // If the remainder of userNumber when divided by 2 is equal to 1, then add "1" to the binary String
                if (userNumber % 2 == 1)
                {
                    binary = '1' + binary;  // Adding a character "1" to String binary
                }

                // If remainder of userNumber when divided by 2 is 0, that implies that it is divisible by 2
                // therefore we add "0"
                if (userNumber % 2 == 0)
                {
                    binary = '0' + binary;
                }

                userNumber = userNumber / 2;

                System.out.println("Binary equivalent is: " + binary);
            }

        }
    }

    // Converts binary to decimal
    int binaryToDenary() {
        String input = getText("Please enter a binary number: \n");

        int x = 128;        // maximum value of the first bit
        int total = 0;      // will contain successive values

        for (int i = 0; i < 8; i++) {
            // If the FIRST value of the binary is a 1 then it must be 128
            if (input.charAt(i) == '1') {
                total = total + (x * 1);
            }

            x = x / 2;
        }

        System.out.println("Equivalent: " + total);
        return total;
    }

    // Prints the hexa to binary output
    void doHex() {
        String input = getText("Enter a hexadecimal number: \n").toUpperCase();
        System.out.println(hexToBinary(input) + "\n");
    }

    // Converts hexadecimal to binary
    int hexToBinary(String hex) {
        final String digits = "0123456789ABCDEF";

        int counter = hex.length() - 1;
        int sum = 0;

        for (char c : hex.toCharArray()) {
            int i = digits.indexOf(c);
            sum = (int) (sum + (Math.pow(16, counter)) * i);
            counter--;
        }

        return sum;
    }

    // Prints the decimal to hexa output
    void binaryToHex() {
        int decimalResult = binaryToDenary();
        System.out.println(denaryToHex(decimalResult));
    }

    // Prints the decimal to hexa output
    void printHex() {
        int input = getInteger("Enter a denary number you want converted to hexa: \n");
        System.out.println(denaryToHex(input));
    }

    // Changes decimal to hexadecimal
    String denaryToHex(int decimal) {
        final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hex = "";

        while (decimal != 0) {
            int remainder = decimal % 16;
            hex = hexDigits[remainder] + hex;
            decimal = decimal / 16;
        }
        return hex;
    }

    void printDenary() {
        String input = getText("Enter a hexadecimal that you want converted to denary: \n");
        System.out.println(hexToDenary(input));
    }

    // Changes hexadecimal to decimal
    int hexToDenary(String hex) {
        final String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int value = 0;
        int i = 0;
        do {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            value = 16 * value + d;

            i++;
        } while (i < hex.length());

        return value;
    }
}
