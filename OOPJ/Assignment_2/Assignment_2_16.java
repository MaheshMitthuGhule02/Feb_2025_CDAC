import java.util.Scanner;

/* Write a program that determines whether a given number is  positive, 
negative, or zero  using only the  ternary operator  */

class Assignment_2_16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int a=sc.nextInt();
		
		String res = (a==0)? "zero" : (a>0)? "positive" : "negative";
		System.out.println(res);
	}
	
}	


