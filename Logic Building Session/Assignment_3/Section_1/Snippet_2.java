/* public class Snippet_2{ 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
-Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
'while' loop? 
Ans:- While loop consist the condition but in while loop asign the the value thats why loop is execute.*/

public class Snippet_2{ 
    public static void main(String[] args) { 
        int count = 5; 
        while (count > 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 