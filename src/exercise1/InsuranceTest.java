package exercise1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InsuranceTest {

	public static void main(String[] args) {

		
		String size = JOptionPane.showInputDialog("How many insurance you want to make ??");
		int insuranceSize = Integer.parseInt(size);

		Insurance[] insuranceArray = new Insurance[insuranceSize];

		for (int i = 0; i < insuranceSize; i++) {
			String insuranceType = JOptionPane.showInputDialog("Enter the insurance type :");
			int monthlyCost = Integer.parseInt(JOptionPane.showInputDialog("Enter the monthly fees for %s insurance"));

			if (insuranceType.toLowerCase().equals("health")) {
				Health health = new Health("Health Insurance", monthlyCost);
				health.displayInfo();
			}

			else  {
				Life life = new Life("Life Insurance", monthlyCost);
				life.displayInfo();
			}

			
		}
	}

}
