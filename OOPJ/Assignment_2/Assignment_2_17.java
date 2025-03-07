import java.util.Scanner;

/*   Given a student’s percentage, print  “Pass”  if the percentage is 40 or above; 
otherwise, print  “Fail”  , using only the ternary operator.  */

class Assignment_2_17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int a=sc.nextInt();
		
		String res =  (a>=40)? "Pass" : "Fail";
		System.out.println(res);
	}
	
}	


