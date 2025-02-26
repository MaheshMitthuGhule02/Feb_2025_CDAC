/* Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
*********          */

class StarPattern_4
{
  public static void main(String args[])
   {
	int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) System.out.print("*");
            }

            System.out.println();
        }
	}
}