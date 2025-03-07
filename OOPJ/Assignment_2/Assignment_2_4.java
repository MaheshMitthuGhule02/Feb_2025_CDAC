import java.util.Scanner;

/*Q3:  Implement a program that calculates the  sum of digits 
       of an integer using  modulus (  %  ) and division (  /  ) operators  .   */

class Assignment_2_4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		if(a<0){
			a=-a;
		}
		while(a>3){
			a=(a & 3) + (a>>2);
		}
		if(a==0 || a==3){
			System.out.println("It is divisible.");
		}
		else{
			System.out.println("It is not divisible.");
		}
	}
}