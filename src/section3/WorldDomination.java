package section3;

import javax.lang.model.element.Name;
import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String name=JOptionPane.showInputDialog("yall know how to write code mate");
		// 2. If they say "yes", tell them they will rule the world.
		if (name.equalsIgnoreCase("yes")){
JOptionPane.showMessageDialog(null,"hio F  R  I  E  N  D you have NOT doomed us all");
		}else {
			JOptionPane.showMessageDialog(null,"you have doomed us all you fool");	
		// 3. Otherwise, wish them good luck washing dishes.

	}
}
}
