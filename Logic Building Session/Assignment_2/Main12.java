/* public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
} 
 What happens when you run this code? How can you avoid infinite loops?
Ans:- We are in infifnite loop.We have to break the while loop. */

public class Main12 { 
    public static void main(String[] args) { 
	int cond=0;
        while (true) { 
            System.out.println("Infinite Loop"); 
		cond++;
		if(cond==3)
		break;
        } 
    } 
} 