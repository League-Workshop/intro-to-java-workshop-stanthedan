package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0;
		// 2.  Ask the user a question 
	String name =	JOptionPane.showInputDialog("what is 2x2?" );
		// 3.  Use an if statement to check if their answer is correct
		if (name.equalsIgnoreCase("4")){
			JOptionPane.showMessageDialog(null,"correct");
			score=score+1;
		}else {
			JOptionPane.showMessageDialog(null,"you fool, YOU WERE WRONG!");
			
		}
		
		String question2 =	JOptionPane.showInputDialog("what is better, mincraft or fortinte?");
		if (question2.equalsIgnoreCase("minecraft")){
			JOptionPane.showMessageDialog(null,"you are a true gamer");
			score=score+1;
		}else {JOptionPane.showMessageDialog(null,"why would you even say that!");
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"nice, here is your score");
		JOptionPane.showMessageDialog(null,score);
		
	}
	}

