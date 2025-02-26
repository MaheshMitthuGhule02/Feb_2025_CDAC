import java.util.Scanner;

/* Write a Java program that checks if a predefined number is negative using an 
if-else statement and displays the result. */

public class Question_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a= scanner.nextInt();

        if (a < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero or not Negative.");
        }
    }
}