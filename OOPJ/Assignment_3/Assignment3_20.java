import java.util.Scanner;

/* Sum of Two Matrices 
  Given two matrices of the same size, compute their sum.*/

class Assignment3_20{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
	int [][]arr1=new int[m][n];
	int [][]arr2=new int[m][n];
	int [][]arr3=new int[m][n];
	
	System.out.println("Enter ele of arr1");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter ele of arr2");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix1:");
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

		System.out.println("Matrix2:");
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Sum of Matrix is:");
		 for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

	}
}