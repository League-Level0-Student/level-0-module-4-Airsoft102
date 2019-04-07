package extra;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	
String Boeing=JOptionPane.showInputDialog("Whats your most recent test score");

Double MD=Double.parseDouble(Boeing);
	
if (MD>80) {
JOptionPane.showMessageDialog(null, " Good job, You have been studing");


}
else if (MD>65) {
	JOptionPane.showMessageDialog(null, "Maby study a little bit more");


}
else {
	JOptionPane.showMessageDialog(null," Get off your phone");
}
}
}

