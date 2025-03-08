import java.util.Scanner;
 /*  Count Even and Odd Numbers 
	Count the number of even and odd numbers in an array.   */

	class Assignment3_4{
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
			
			int count=0;
			int count1=0;
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
			System.out.println("\nEven number count: "+count);
			System.out.println("odd number count: "+count1);
		}
	}