package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
		String input = JOptionPane.showInputDialog("What is 3 x 8?");
				// 3.  Use an if statement to check if their answer is correct
				
		if(input.equals("24")||input.equals("twenty-four")) { 
		
		JOptionPane.showMessageDialog(null, "Your answer is correct! Your score has increased by 1!");	
		
				// 4.  if the user's answer was correct, add one to their score 
		
		score++;
		
		}
		
		else {
		
		JOptionPane.showMessageDialog(null, "Your answer is wrong! Your score has decreased by 1!");
			
		score--;
		
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		String inputone = JOptionPane.showInputDialog("How many states are part of the United States of America?");
		
		if(inputone.equals("50")||inputone.equals("fifty")) {
			
		JOptionPane.showMessageDialog(null, "Your answer is correct! Your score has increased by 1!");	
		
		score++;
		
		}
		
		else {
		
			JOptionPane.showMessageDialog(null, "Your answer is wrong! Your score has decreased by 1!");
			
		score--;
		
		}
		
		String inputtwo = JOptionPane.showInputDialog("Who is the current president of the United States of America?");
				
		if(inputtwo.equals("Donald Trump"))	{
			
		JOptionPane.showMessageDialog(null, "Your answer is correct! Your score has increased by 1!");
		
		score++;
		
		}
		
		else {
			
		JOptionPane.showMessageDialog(null, "Your answer is wrong! Your score has decreased by 1!");
		
		score--;
		
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Your final score is " + score +"!" +" Thanks for playing the Quiz Game!");
	}
}
