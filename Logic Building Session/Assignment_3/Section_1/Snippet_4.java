/* public class Snippet_4{ 
    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
//- Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the 
expected output?
Ans:- In for loop we used the greater than equal to sign, thats why issue with the
      boundaries.*/

public class Snippet_4{ 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 