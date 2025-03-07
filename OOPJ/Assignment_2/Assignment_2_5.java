import java.util.Scanner;

/*Write a Java program to  swap two numbers  using the  +=  and  -=  operators only.  */

class Assignment_2_5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping a: "+a);
		System.out.println("Before swapping b: "+b);
		a+=b;
		b+=a;
		a+=b;
		System.out.println("Before swapping a: "+a);
		System.out.println("Before swapping b: "+b);
	}
}