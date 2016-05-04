import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Task theTask = new Task();

        System.out.println("Enter the number you want the square root of: ");
        Scanner input = new Scanner(System.in);

        System.out.println(theTask.HerosMethod(input.nextDouble()));

    }
}
