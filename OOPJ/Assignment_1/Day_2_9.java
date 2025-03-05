import java.util.Scanner;
/*Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=)
and display the results.*/
class Day_2_9{

		void equalTO(int a,int b) {
			if(a==b)
				System.out.println("The value of a & b are equal.");
		}
		void notEqualTO(int c,int d){
			if(c!=d)
				System.out.println("The value of c & d are not equal.");
		}
		void greater(int m,int n){
			if(m>n)
				System.out.println("The value of a is greater than b.");
		}
		 void less(int j,int k){
			if(j<k)
				System.out.println("The value of j is less than k.");
		}
		void greater_Equal(int l,int t){
			if(l>=t)
				System.out.println("The value of l is greater than or equal to t.");
		}
		void less_equal(int p,int q){
			if(p<=q)
				System.out.println("The value of p is less than or equal to q.");
		}
	public static void main(String args[]){
		//scanner sc = new Scanner(System.in);  error: cannot find symbol
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a & b.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Day_2_9 obj=new Day_2_9();
		obj.equalTO( a, b);
		obj.notEqualTO( a, b);
		obj.greater( a, b);
		obj.less( a, b);
		obj.greater_Equal( a, b);
		obj.less_equal( a, b);
	}
}