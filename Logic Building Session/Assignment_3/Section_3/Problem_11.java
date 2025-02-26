/* Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression. */

public class Problem_11{ 
    public static void main(String[] args) { 
        int n1 = 10;
       int n2 = 20;

       int result = ++n1 + n2--;

       System.out.println("Result: " + result);
       System.out.println("Updated Value of num1: " + n1);
       System.out.println("Updated Value of num2: " + n2);
    } 
}