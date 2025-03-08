import java.util.Scanner;
 /*   Find Sum and Average 
	Compute the sum and average of all elements in the array.    */

	class Assignment3_5{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int []ar=new int[5];
			System.out.println("ENter element:");
			for(int i=0;i<ar.length;i++){
				ar[i]=sc.nextInt();
			}
			System.out.println("Arrays element:");
			for(int i=0;i<ar.length;i++){
				System.out.print(ar[i]+" ");	
			}
			int sum=0;
			double avg;
			for(int i=0;i<ar.length;i++){
				sum=sum+ar[i];
			}
			avg=sum/ar.length;
			System.out.println("Sum :"+sum);
			System.out.println("Sum :"+avg);
		}
	}