package exercise1;

import javax.swing.JOptionPane;

public class Life extends Insurance {
	
	// Creating a Constructor 
	public Life(String insuranceType, int monthlyCost) {
		this.insuranceType=insuranceType;
		setInsuranceCost(monthlyCost);
	}

	// Override the displayInfo method of Insurance class and displaying the information
	@Override
	public void displayInfo() {
		JOptionPane.showMessageDialog(null,String.format("Insurance Type : %s , Monthly Cost : $ %d", getInsuranceType(),monthlyCost));
		
	}

	// Override the setInsuranceCost method of Insurance class and setting the monthly cost value
	@Override
	public void setInsuranceCost(int monthlyCost) {
		this.monthlyCost=monthlyCost ;
		
	}
}
