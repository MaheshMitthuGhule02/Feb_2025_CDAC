/* 15. Write a program to print star equilateral triagle the following pattern:*/

class StarPattern_3
{
  public static void main(String args[])
   {
    int n = 5;
    int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                num++;
            }

            System.out.println();
	}
 }
}