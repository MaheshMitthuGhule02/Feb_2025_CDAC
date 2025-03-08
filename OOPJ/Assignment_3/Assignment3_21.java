import java.util.Scanner;

/*   Row-wise and Column-wise Sum 
	 Find the sum of each row and each column of a given matrix.*/

class Assignment3_21{
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
		System.out.println("Row-wise sum:");
		for(int i=0;i<m;i++){
			int sum=0;
			for(int j=0;j<n;j++){
				sum+=arr1[i][j];
			}
			System.out.println("Row "+(i+1)+" sum:"+sum);
		}
		System.out.println("Clm-wise sum:");
		 for (int j = 0; j < n; j++) {
			 int sum=0;
            for (int i = 0; i < m; i++) {
                sum+=arr1[i][j];
            }
            System.out.println("Clm "+(j+1)+" sum:"+sum);
        }

	}
}