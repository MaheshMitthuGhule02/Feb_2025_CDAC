import java.util.Scanner;

/*     Find the Maximum Element in a Matrix 
		Find the largest element in a given matrix. */

class Assignment3_22{
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
		System.out.println("Matrix1:");
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
		
		int max=arr1[0][0];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(arr1[i][j]>max){
				max=arr1[i][j];
				}
			}
		}
		System.out.println("Largest element in matrix : "+max);
	}
}