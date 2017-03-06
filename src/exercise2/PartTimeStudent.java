package exercise2;

import javax.swing.JOptionPane;

public class PartTimeStudent extends Student{
	
	int hours; 
	
	public PartTimeStudent(String type,int hours,boolean status)
	{
		this.studentType=type;
		this.hours=hours;
		this.fullTimeStatus=status;
	}
	
	
	public void studentInforamtion() {
			int hour = hours * 100;
			JOptionPane.showMessageDialog(null, String.format("You are a %s ,you have to pay flat fee of $ %d",studentType,hour));
		
		
	}

}
