import java.util.Scanner;

/*    Write a Java program that checks whether a character is  uppercase, lowercase, or 
	not a letter  using only the ternary operator.  */

class Assignment_2_18{
	public static void main(String args[]){
		chk('a');
		chk('A');
		chk('1');
	}
	
	public static void chk(char A){
		int a = (int) A;
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
		System.out.println(result);
	}
}

