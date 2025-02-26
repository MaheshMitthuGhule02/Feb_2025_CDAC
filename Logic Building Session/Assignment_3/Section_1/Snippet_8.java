/* public class Snippet_8{ 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
} 
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
   numbers from 1 to 5?
Ans:- Bcoz in do-while loop used the post-decrement operator,its going to be infinite loop or printing unexpected 
      numbers.*/

 public class Snippet_8{ 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 6); 
    } 
} 