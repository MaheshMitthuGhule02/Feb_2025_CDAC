import java.util.Scanner;

/*Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic. */

class Question_4{
    	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a Time.");
	double hour=sc.nextDouble();

	if(hour >= 5 && hour <=12 ){
	System.out.println("Good Morning.");
	}
	}
}