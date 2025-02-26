/* Write a program to calculate the sum of the first 50 natural numbers.*/

public class Problem_1{ 
    public static void main(String[] args) { 
        
	int sum=0;
	for(int i=0;i<=50;i++){
	sum=sum+=i;
	}
	System.out.println("Sum of first fifty natural numbers is : "+sum);
	}
    }