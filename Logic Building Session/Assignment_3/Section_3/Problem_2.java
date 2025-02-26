/* Write a program to compute the factorial of the number 10. */

public class Problem_2{
    public static void main(String[] args) {
        
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
		fact=fact*=i;
        }
        
        System.out.println("Factorial of number 10 :" + fact);
    }
}
