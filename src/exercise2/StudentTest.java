package exercise2;

import javax.swing.JOptionPane;

public class StudentTest {

	public static void main(String... s) {

		String status = JOptionPane.showInputDialog("Enter your status, full time or part time");

		
		if (status.toLowerCase().equals("full time") || status.toLowerCase().equals("fulltime")) {
			
			FullTimeStudent student = new FullTimeStudent("Full time", true);
			student.studentInforamtion();
		}

		
		else  {
			String hours = JOptionPane.showInputDialog("Enter your credit hours");
			int creditHours = Integer.parseInt(hours);

			
			PartTimeStudent student = new PartTimeStudent("Part time", creditHours, false);
			student.studentInforamtion();
		}
	}
	}

