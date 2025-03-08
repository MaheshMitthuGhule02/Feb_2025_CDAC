import java.util.Scanner;

 /*  Write a Java program to find the maximum product of two integers in a given array of integers. */

class Assignment3_17{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number of rows: ");
			int m = sc.nextInt();
			int a[]=new int[m];
			for(int i=0;i<m;i++){
				a[i]=sc.nextInt();
			}
		int max=1;
		int n1=0;
		int n2=0;
	
		System.out.println(max);
		for(int i=0;i<m;i++){
			for(int j=i+1;j<m;j++){
				int prod=a[i]*a[j];
				if(prod>max){
				max=prod;
				n1=a[i];
				n2=a[j];
				}
			}
		}
	System.out.println("max Product of consecutive elments is :"+max);
	}
}
 