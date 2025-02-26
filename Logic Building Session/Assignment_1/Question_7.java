import java.util.Scanner;

/* Write a Java program that finds and prints the largest of three predefined 
numbers using if-else statements. */

public class Question_7{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the three numbers:");
	double n1=sc.nextDouble();
	double n2=sc.nextDouble();
	double n3=sc.nextDouble();

	System.out.println("n1="+n1+", n2="+n2+", n3="+n3);

		if(n1 > n2 && n1 > n3){
        System.out.println("N1 is greater than n2 and n3.");
	}	else if(n2 > n1 && n2 > n3){
	System.out.println("N2 is greater than n1 and n3.");
	}
		else{
	System.out.println("N3 is greater than n1 and n2.");
	}
    }
}
