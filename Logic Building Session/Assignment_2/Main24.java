/* public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 
Ans:- Bcoz after the execution is started it will all output bcoz there is no breaking point oe the break statement.*/

public class Main24{ 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
		break;
            case 2: 
                System.out.println("Level 2"); 
		break;
            case 3: 
                System.out.println("Level 3"); 
		break;
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
} 