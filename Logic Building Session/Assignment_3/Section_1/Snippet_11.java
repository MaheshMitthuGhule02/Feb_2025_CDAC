/* public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2; // Error: This may cause unexpected results in output 
        } 
    } 
} 
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
   desired result? 
Ans:- 0,2,4 be the output of this program. The value of i incremented by 2. 
      If we want desired output then incrment i by 1.*/

public class Snippet_11{ 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 1; // Error: This may cause unexpected results in output 
        } 
    } 
} 