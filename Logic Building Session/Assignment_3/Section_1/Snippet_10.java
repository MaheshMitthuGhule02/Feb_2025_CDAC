/* public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 
Ans:- We used the asignment operator its a condition statement we do not aisgn in while loop.*/

public class Snippet_10{ 
    public static void main(String[] args) { 
        int num = 10; 
        while (num == 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 