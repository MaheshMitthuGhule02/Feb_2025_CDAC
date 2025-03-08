import java.util.Scanner;
 /* Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class 
	students in a single Dimensional Array. Find and display the following: 
	Number of students securing 75% and above in aggregate. 
	Number of students securing 40% and below in aggregate.  */

	class Assignment3_13{
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
			
			for(int i=0;i<ar.length;i++){
				if(ar[i]>=40){
					count++;
					if(ar[i]>=75){
						count1++;
					}
				}
			}
			System.out.println("\nNumber of students securing 75% :"+count);
			System.out.println("Number of students securing 45% : "+count1);
		}
	}