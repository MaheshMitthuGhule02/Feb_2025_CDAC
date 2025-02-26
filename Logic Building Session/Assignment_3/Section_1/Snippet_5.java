/* public class Snippet_5{ 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
// initialization and update statements in the `for` loop?
Ans:- In this program  we used increment operator thats why condition never goes on false and it
      will be printing numbers infinite. */

public class Snippet_5{ 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) { 
            System.out.println(i); 
        } 
    } 
} 