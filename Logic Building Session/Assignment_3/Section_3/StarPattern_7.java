class StarPattern_7
{
  public static void main(String args[])
    {
    int n = 5;
      
       for(int i=1; i<=n; i++)
      {
          int product = 1;
 	  for(int j=1; j<=i;j++)
           {
           product = product * j;   
	   if(j>1)
              {
              System.out.print("*");
	   }
            System.out.print(j);
         }
          System.out.println();
	}
       
  }
}