import java.util.Scanner;

/* Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message. */

public class Question_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a= scanner.nextInt();

        if (a > 0) {
            System.out.println("The number is Positive.");
        } else {
            System.out.println("The number is Zero or not Positive.");
        }
    }
}