import java.util.Scanner;

//Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.

class Day_2_11{
	public static void main(String args[]){
		//scanner sc = new Scanner(System.in);  error: cannot find symbol
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the num");
		//int num=sc.nextInt();
		int x=20;//
		System.out.println(x);
		System.out.println(x+=5);
		System.out.println(x-=8);
		System.out.println(x*=3);
		System.out.println(x/=9);
		System.out.println(x%=3);
	}
}