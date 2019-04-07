package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Ownadventure {
public static void main(String[] args) {
	String Galaxy= JOptionPane.showInputDialog("You got a job application It has these 3 options 1.Target 2.Best Buy 3.CPK");
	
	if (Galaxy.equals ("Target")) {
	String MD=JOptionPane.showInputDialog("When you arive at target you get a choice for 3 jobs there, 1.Chasier,2,Starbuck barista,3.floor worker ");
	}
	else if (Galaxy.equals (" Best Buy")) {
		 String Cirrus=JOptionPane.showInputDialog("When you arive at Best Buy you get a choice for 3 jobs there, 1.Computer help guy,2,securtiy,3.Customer help");
		}
	else if (Galaxy.equals ("CPK")) {
		String Cessna=JOptionPane.showInputDialog("When you arive at CPK you get a choice for 3 jobs there, 1.Server,2,Cook,3.Cleaner");
		if (Cessna.equals ("Cook")) {
			JOptionPane.showMessageDialog(null, "welcome to your new job as a Cook");
				} else if (Cessna.equals ("Server")) {
	JOptionPane.showMessageDialog(null, "welcome to your new job as a Server");
				}
	if (Cessna.equals ("Cleaner")) {
		JOptionPane.showMessageDialog(null, "welcome to your new job as a Cleaner");
	}
		}
		}
	
	
	
	
}

