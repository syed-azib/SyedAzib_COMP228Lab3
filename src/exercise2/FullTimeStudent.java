package exercise2;

import javax.swing.JOptionPane;

public class FullTimeStudent extends Student {
	public FullTimeStudent(String type,boolean status)
	{
		this.studentType=type;		
		this.fullTimeStatus=status;		
	}

	
	public void studentInforamtion() {
		
			JOptionPane.showMessageDialog(null, String.format("You are a %s ,you have to pay flat fee of $ 2000",studentType));
		
		
	}

}
