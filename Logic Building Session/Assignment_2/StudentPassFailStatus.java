import java.util.Scanner;

/* Q5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. */

public class StudentPassFailStatus{
       public static void main(String args[])
         {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subects marks :");
           int subject1 = sc.nextInt();
	   int subject2 = sc.nextInt();
	   int subject3 = sc.nextInt();

           int failcount = 0;

           if(subject1 < 40){
               failcount++;
           }
           if(subject2 < 40){
               failcount++;
           }
           if(subject3 < 40){
               failcount++;
           }
           
           if(failcount == 0){
                System.out.println("Congratulations! You have passes all subjects.");
           }
           else{
                System.out.println("You have failed in " + failcount + " subjects.");

           }
       }
}