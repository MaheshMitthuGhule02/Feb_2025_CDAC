/* Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6). */

public class Problem_7{ 
    public static void main(String[] args) { 
         int number = 9876;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;//This will remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    } 
}