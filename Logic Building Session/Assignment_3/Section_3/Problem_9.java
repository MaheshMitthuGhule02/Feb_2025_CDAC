/* Write a program to find and print the largest digit in the number 4825. */

public class Problem_9{ 
    public static void main(String[] args) { 
        int num = 4825;
     int largeDigit = 0;
     
      while(num > 0)
      {
        int digit = num%10;
       
        if(digit > largeDigit)
          {
 		largeDigit = digit;
	   }

            num = num/10;

      }
        System.out.println("The Largest digit is:"+ largeDigit);
    } 
}