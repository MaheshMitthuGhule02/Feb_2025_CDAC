import java.util.Scanner;

/* Q4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. */

public class DiscountCalculation
     {
       public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
               System.out.println("Enter the purchaseAmount ");
              double purchaseAmount=sc.nextDouble();

		System.out.println("Enter the discount ");
		double discount = sc.nextDouble();
 
              if(purchaseAmount >= 1500){
                  discount = 20;
              }
              else if(purchaseAmount >= 500){
                  discount = 10;
              }
              else{
                  discount = 5;
              }
  
              double discountAmount = (discount / 100) * purchaseAmount;
              double finalAmount = purchaseAmount - discountAmount;

              System.out.println("Applicable Discount: " + discount + "%");
              System.out.println("Discount Amount: Rs. " + discountAmount);
              System.out.println("Final Amount to Pay: Rs. " + finalAmount);
       }
}