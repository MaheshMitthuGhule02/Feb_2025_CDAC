import java.util.Scanner;

/*Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  -  . 
Hint  : Use bitwise XOR  ^  operator. */

class Assignment_2_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping a: "+a);
		System.out.println("Before swapping b: "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping a: "+a);
		System.out.println("After swapping b: "+b);
	}
}