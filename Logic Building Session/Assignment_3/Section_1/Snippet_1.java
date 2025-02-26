/* public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 
-Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? 
Ans:- This program is going in infinite loop bcoz we intialize i as 0 and used decrement operator bcoz this our
        condition will be forever.it will be in control when we false condition. */

public class Snippet_1{ 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 