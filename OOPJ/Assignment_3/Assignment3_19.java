import java.util.Scanner;
 /*     Transpose of a Matrix 
○  Given a matrix, return its transpose (swap rows and columns)    */

	class Assignment3_19{
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
		
		int l=arr1.length;
		int k=arr1[0].length;
		int [][]tran=new int[l][k];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				tran[j][i]=arr1[i][j];
			}
		}
		System.out.println("Printing m*n Matrix");
		for(int []arr4:tran){
			for(int arr5:arr4){
				System.out.print(arr5+" ");
			}
			System.out.println();
		}
		}
	}