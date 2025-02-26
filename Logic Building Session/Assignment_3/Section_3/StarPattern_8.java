/* Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1            */

class StarPattern_8
{
  public static void main(String args[])
    {
     int n = 5;
      
       for(int i=n; i>=1; i--)
      {
          int product = 1;
 	  for(int j=n; j>=i;j--)
           {
           product = product * j;   
	   if(j>1)
              {
              System.out.print(j);
	   }
            System.out.print("*");
         }
          System.out.println();
	}
       
  }
}