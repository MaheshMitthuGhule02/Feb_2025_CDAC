import java.util.Scanner;

/* Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width. */


class Question_6{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Length of rectangle");
	double length=sc.nextDouble();

	System.out.println("Enter the breadth of rectangle");
	double breadth=sc.nextDouble();

	double area = length * breadth;

        System.out.println("The area of the rectangle with length "+ length + " and breadth " + breadth + " is : "+ area);
    }
}