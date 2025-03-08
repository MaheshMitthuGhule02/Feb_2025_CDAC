import java.util.Scanner;
 /*     Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
	Display the following: 
	Number of even numbers. 
	Number of odd numbers. 
	Number of multiples of 3  */

	class Assignment3_12{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int []ar=new int[20];
			System.out.println("Enter student agregate Marks :");
			for(int i=0;i<ar.length;i++){
				ar[i]=sc.nextInt();
			}
			System.out.println("Arrays element:");
			for(int i=0;i<ar.length;i++){
				System.out.print(ar[i]+" ");	
			}
			
			int count=0;
			int count1=0;
			int count2=0;
			for(int i=0;i<ar.length;i++){
				if(ar[i]%2==0){
					count++;
				}
			}
			for(int i=0;i<ar.length;i++){
				if(ar[i]%2==1){
					count1++;
				}
			}
			for(int i=0;i<ar.length;i++){
				if(ar[i]%3==0){
					count2++;
				}
			}
			System.out.println("\nEven number count: "+count);
			System.out.println("odd number count: "+count1);
			System.out.println("Divisible of 3 number count: "+count1);
		}
	}