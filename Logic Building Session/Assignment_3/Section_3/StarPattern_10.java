/* Write a program to print the following pattern:
*****
****
***
**
*
*
**
***
****
*****                 */

class StarPattern_10
{
   public static void main(String args[])
    {
	int n = 5;
   
        for(int i=n; i>=1;i--)
         {
           for(int j=i; j>=1;j--)
            {
  		System.out.print("*");
	   }
           System.out.println();
      	 }

         for(int i=1; i<=n;i++)
           {
  	       for(int j=1;j<=i;j++)
                 {
		    System.out.print("*");
		   }
            System.out.println();
	    }
     }
}