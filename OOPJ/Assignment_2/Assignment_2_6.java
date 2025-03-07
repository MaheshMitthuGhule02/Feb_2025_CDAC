import java.util.Scanner;

/*   Write a program to find the  largest of three numbers  using only the  
     ternary operator (  ? :  ) . */

class Assignment_2_6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Largest is : "+result);
	}
}