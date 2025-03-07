import java.util.Scanner;

/*    Write a program that  takes three boolean inputs  and prints  
      true  if at least two of them are  true  . 
      Hint  : Use logical operators (  &&  ,  ||  ). */

class Assignment_2_8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter boolean");
		boolean a=sc.nextBoolean();
		boolean b=sc.nextBoolean();
		boolean c=sc.nextBoolean();
		if((a&&b)||(b&&c)||(c&&a))
		System.out.println("There are At least two inputs true");
		else 
		System.out.println("Not be");
	}
}