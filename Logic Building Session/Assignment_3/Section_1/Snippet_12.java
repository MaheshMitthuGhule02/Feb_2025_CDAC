/* public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope?
Ans:- We cant Declare the variable inside the loop. we have to initialize it outside the block or
      the looping statement.*/

public class Snippet_12{ 
    public static void main(String[] args) {
	int x=0; 
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} 