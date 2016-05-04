/**
 * Created by Atul Anand Sinha on 04 May 2016.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author NM
 */
public class Task {

    // attributes
    Scanner userInput;

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

    void HerosMethod()
    {
        Scanner input = new Scanner(System.in);
        final double epsilon = 1e-14; // amount of precision
        double x;       // square root of x
        double root;    // current estimate of sqrt(x)
        double lroot;   // last estimate of sqrt(x)

        // read x
        do {
            System.out.println("Enter the number: ");
            x = input.nextDouble();

            if (x < 0) {
                System.out.println("No real results.\n");
                System.out.println("Please enter a positive number. \n");
            }
        } while (x < 0);

        // Hero's Method
        root = 3.0; lroot = x;

        while (Math.abs(root - lroot) > epsilon) {
            lroot = root;
            root = (root + x / root) / 2.0;
        }

        System.out.println("Square root of x = " + root + "\n");
        System.out.println("Math.sqrt(x) = " + Math.sqrt(x));


    }

}
