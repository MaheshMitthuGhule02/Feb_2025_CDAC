import java.util.Scanner;
 /*   Print a Matrix 
	Given an m x n matrix, print all its elements row-wise.    */

	class Assignment3_18{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
	int [][]arr1=new int[m][n];
	
	System.out.println("Enter ele of arr1");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Printing m*n Matrix");
		for(int []arr2:arr1){
			for(int arr3:arr2){
				System.out.print(arr3+" ");
			}
			System.out.println();
		}
		}
	}