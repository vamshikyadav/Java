package conditional;

import javax.swing.JOptionPane;

public class ConditionalBC {
	
	public static String Value;

	public void ForEachTest(){
		ConditionalBC CBC = new ConditionalBC();
		String Cars[]={"Scura", "Alfa Romeo", "Aston Martin"};
		
		for (String s:Cars){
			CBC.infoBox(s, "Car that is available: ");
		}
	}
	public void SwitchTest(){
		Value = null;
		Value = JOptionPane.showInputDialog("Enter the value");
		ConditionalBC CBC = new ConditionalBC();	
		int Result = Integer.parseInt(Value);
		
		switch (Result) {
		case 100:
			CBC.infoBox("First", "Congratulations");
		break;
		case 90:
			CBC.infoBox("Second", "Congratulations");
		break;
		case 80:
			CBC.infoBox("Third", "Congratulations");
		break;
		case 70:
			CBC.infoBox("Four", "Congratulations");
		break;

		default:
			CBC.infoBox("Last", "Congratulations");
			break;
		}
	}

	public static void main(String[] args) {
		// below is the object of the
		ConditionalBC CBC = new ConditionalBC();		
		Value = null;
		Value = JOptionPane.showInputDialog("Enter the value");
		
		// below is the code to convert string to integer
		int Result = Integer.parseInt(Value);
		
		if (Result > 50){
			if (Result < 100){
				CBC.infoBox("First Class", "Congratulations");
			}
		} else {
			CBC.infoBox("You Fail","Fail");
		}
		
		CBC.SwitchTest();
		CBC.ForEachTest();
		
	}
	
	//Blow is the code to pop up the message 
	public void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

}
