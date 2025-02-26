import java.util.Scanner;

/* Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length. */

class Question_5{
    	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter side of a square.");
	double side=sc.nextDouble();

	double area = side * side;
	System.out.println("Area of Square having side "+side+" is "+area+".");
	
	}
}