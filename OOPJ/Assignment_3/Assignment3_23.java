import java.util.Scanner;

 /* Matrix Multiplication 
    Multiply two matrices and return the resultant matrix. */

class Assignment3_23{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
	int[][] a=new int[m][n];
	int[][] b=new int[m][n];
	int[][] c=new int[m][n];
	
	System.out.println("Eter a ele");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		a[i][j]=sc.nextInt();	
		}
	}
	
System.out.println("Eter b ele");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		b[i][j]=sc.nextInt();	
		}
	}
	
	
	System.out.println("Matrix is a:");
	
	for(int []d:a){
		for(int e:d){
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	System.out.println("Matrix is b:");
	
	for(int []f:b){
		for(int g:f){
			System.out.print(g+" ");
		}
		System.out.println();
	}
	
	
	//"Matrix logic"
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		c[i][j]=a[i][j]*b[i][j];	
		}
	}
	System.out.println("Multiplication of Matrix :");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}

	}
}
 