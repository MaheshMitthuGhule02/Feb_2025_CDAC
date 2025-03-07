import java.util.Scanner;

/*Q2:  Write a program to check whether a given number is  even or odd
       using only  bitwise operators  . 
       Hint  : Use  n & 1  to check.  */

class Assignment_2_2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		if((a & 1)==0){
		System.out.println("Even");
		}
		else{
		System.out.println("Odd");	
		}
	}
}