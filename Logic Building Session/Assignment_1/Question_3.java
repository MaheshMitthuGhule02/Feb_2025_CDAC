import java.util.Scanner;

/* Write a Java program that checks if a predefined number is odd or even. Use 
an if-else statement and the modulus operator (%) to determine whether the number is 
divisible by 2 or not. */

public class Question_3{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number.");
	int num=sc.nextInt();

	if(num%2==0){
	System.out.println("The number is even number.");
	}  else{
	System.out.println("The number is odd number.");
	}
	
    }
}
