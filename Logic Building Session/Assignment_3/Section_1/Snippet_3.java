/* public class Snippet_3{ 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
    } 
} 
//- Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do
while` loop?
Ans:-The do while execte at least one time whether the condition is true or the false.It is going to infinte times.thas why 
     it executes once. */

public class Snippet_3{ 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <=10); 
    } 
} 