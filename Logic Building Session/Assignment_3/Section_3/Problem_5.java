/* Write a program to print the Fibonacci sequence up to the number 21. */

public class Problem_5{ 
    public static void main(String[] args) { 
        int first = 0;
	int second = 1;
	System.out.println(first+"\n"+second);
		for(int i=2;i<=21;i++){
		int nextone = first + second;
		System.out.println(nextone);
		first = second;
		second = nextone;
		} 
	}
    }