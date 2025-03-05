import java.util.Scanner;

	 /*Write a program to perform addition, subtraction, multiplication, division, and modulus
	   operations on two integer numbers and display the results.*/

class Day_2_8{
	public static void main(String args[]){
		//scanner sc = new Scanner(System.in);  error: cannot find symbol
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("Addition: "+(a+b));
		System.out.println("Substraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Remainder: "+(a%b));
	}
}