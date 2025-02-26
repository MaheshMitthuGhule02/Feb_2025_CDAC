/* public class Main22{    
 public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 
 What syntax error occurs? Can a method be declared inside another method?
Ans:- Compilation Error.no*/

 public class Main22{   
 	static void displayMessage() { 
            System.out.println("Message"); 
        } 
 	public static void main(String[] args) { 
        displayMessage();
    } 
} 