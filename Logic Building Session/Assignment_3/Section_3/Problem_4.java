/* Write a program to reverse the digits of the number 1234. The output should be 4321. */

public class Problem_4{ 
    public static void main(String[] args) { 
        int number= 1234; 
	int rev = 0;
        while(number>0) { 
 		int num = number % 10;
		rev = rev * 10 + num;
		number = number / 10;
        } 
        System.out.println(rev); 
	}
    }