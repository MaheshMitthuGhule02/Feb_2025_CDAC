import java.util.Scanner;

/*Q3:  Implement a program that calculates the  sum of digits 
       of an integer using  modulus (  %  ) and division (  /  ) operators  .   */

class Assignment_2_3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		int sum=0;
		while(a!=0){
			sum+=a%10;
			a/=10;
		}
		System.out.println("sum :"+sum);
	}
}