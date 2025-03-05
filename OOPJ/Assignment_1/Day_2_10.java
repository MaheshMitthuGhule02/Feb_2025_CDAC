import java.util.Scanner;

//Write a program to check if a number is positive and even using logical operators (&&, ||, !).

class Day_2_10{
	public static void main(String args[]){
		//scanner sc = new Scanner(System.in);  error: cannot find symbol
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a & b.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if((a>b)&&(a%2==0)){
			System.out.println("This is a &&(And) Operator");
		}
		if((a>b)||(a%2==0)){
			System.out.println("This is a ||(Or) Operator");
		}
		if(!(a==b)){
			System.out.println("This is a !(Not) Operator");
		}
	}
}