import java.util.Scanner;

/*   Given a number, find whether it is  odd or even  using the  &  bitwise operator and print 
	the result without using  if-else   */

class Assignment_2_19{
	public static void main(String[] args){
		int a = 9, b = 10;
		chk(a);
		chk(b);
	}
	
	public static void chk(int a){
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
	}
}	
}

