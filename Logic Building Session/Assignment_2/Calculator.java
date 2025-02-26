/* Q3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message. */

class Calculator
    {
      public static void main(String args[])
       {
          double num1 = 50.0;
          double num2 = 0.0;
          double result = 0;

          char operation = '/';
                   

          switch(operation)
            {
 		case '+':  result = num1 + num2;
                System.out.println("Addition of Two Numbers: " + result);
                break;         

 		case '-': result = num1 - num2;
                System.out.println("Substraction of Two Numbers: " + result);
                break;         

 		case '*': result = num1 * num2;
	        System.out.println("Multiplication of Two Numbers: " + (num1 * num2));
                break;         

 		case '/': 
                if(num2 == 0) {
                                   System.out.println("Division By Zero Not allowed");                 
                                }
                
        	break;
          
                case '%': result = num1 % num2;
                System.out.println("Module Of Two Numbers is:" + result);
                break;

                default: System.out.println("Invalid Operation");
                break;        
		
	      }
          
	}
}