/**
 * CS 145 Lab 5. This program will play a quiz game with users.
 * Name:
 */

 import java.util.Scanner;

 public class Main {
     /**
      * @param args
      */
     public static void main(String[] args) {
 
     
     
         //Introduction
 {

   System.out.println(" O          |\\ ");
   System.out.println("/|\\     o   | \\ ");
   System.out.println("/ \\         |__\\ ");



 
     int Score = 0;
         System.out.println();
         System.out.println("Welcome to the Lab 5 Quiz Game!");
         System.out.println("You will be answering questions about soccer!");
         System.out.println();
 
         Scanner console = new Scanner(System.in);
 
     
 
 
     
         //Ask at least 5 questions and prompt for answers.
     
 
     System.out.print("Question 1: Who won the World Cup in 2022?");
     String answer1 = console.nextLine();
     if (answer1.equalsIgnoreCase("argentina")) {
     System.out.println("Correct!"); 
     Score++;
     } else {
     System.out.println("Incorrect, try again.");
     String answer2 = console.nextLine();
     if (answer2.equalsIgnoreCase("argentina")) {
        System.out.println("Correct!");
        Score++;
     } else {
        System.out.println("Incorrect, lets continue.");
     }
 }
 
 System.out.print("Question 2: What country does Bundesliga belong to?");
 String answer3 = console.nextLine();
 if (answer3.equalsIgnoreCase("germany")) {
 System.out.println("Correct!"); 
 Score++;
 } else {
 System.out.println("Incorrect, try again.");
 String answer4 = console.nextLine();
 if (answer4.equalsIgnoreCase("germany")) {
    System.out.println("Correct!");
    Score++;
 } else {
    System.out.println("Incorrect, lets continue.");
 }
}

System.out.print("Question 3: What is the professional soccer league called in the United States?");
 String answer5 = console.nextLine();
 if (answer5.equalsIgnoreCase("mls")) {
 System.out.println("Correct!"); 
 Score++;
 } else {
 System.out.println("Incorrect, try again.");
 String answer6 = console.nextLine();
 if (answer6.equalsIgnoreCase("mls")) {
    System.out.println("Correct!");
    Score++;
 } else {
    System.out.println("Incorrect, lets continue.");
 }
}

System.out.print("Question 4: Which team has won the UEFA Champions League the most times?");
 String answer7 = console.nextLine();
 if (answer7.equalsIgnoreCase("real madrid")) {
 System.out.println("Correct!"); 
 Score++;
 } else {
 System.out.println("Incorrect, try again.");
 String answer8 = console.nextLine();
 if (answer8.equalsIgnoreCase("real madrid")) {
    System.out.println("Correct!");
    Score++;
 } else {
    System.out.println("Incorrect, lets continue.");
 }
}


System.out.print("Last Question: Who is the best player of all time? (first and last name)");
 String answer9 = console.nextLine();
 if (answer9.equalsIgnoreCase("lionel messi")) {
 System.out.println("Correct!"); 
 Score++;
 } else {
 System.out.println("Incorrect, try again.");
 String answer10 = console.nextLine();
 if (answer10.equalsIgnoreCase("lionel messi")) {
    System.out.println("Correct!");
    Score++;
 } else {
    System.out.println("Incorrect, lets continue.");
 }
}
System.out.println();
System.out.println("Your score is: " + Score + "/5!");
System.out.println();
}

     }
    }   
 
     
    
     

 
     
  
 
     
         //Closing message with how many answers were correct
 
     
 
     //Write any additional methods you need here.
 
 
 