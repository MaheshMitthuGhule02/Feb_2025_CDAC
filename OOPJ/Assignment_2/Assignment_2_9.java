import java.util.Scanner;

/*    :  Implement a Java program that checks if a number is  within a specific
		 range (20 to 50)  without using  if-else  . 
		 Hint  : Use  logical AND (  &&  ) in a print statement */

class Assignment_2_9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println(((a>=20)&&(a<=50)));
	}
}