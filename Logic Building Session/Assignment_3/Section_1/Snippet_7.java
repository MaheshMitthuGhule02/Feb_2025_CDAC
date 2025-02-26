/* public class Snippet_7{ 
    public static void main(String[] args) { 
        int count; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
//- Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
    variable properly? 
Ans:- Variable count might not have been initialized. We have to initialize the variable. */

public class Snippet_7{ 
    public static void main(String[] args) { 
        int count=0; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 