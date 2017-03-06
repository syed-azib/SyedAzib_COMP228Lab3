package exercise1;

import javax.swing.JOptionPane;

public class Health extends Insurance {
	public Health(String insuranceType, int monthlyCost) {
		this.insuranceType = insuranceType;
		setInsuranceCost(monthlyCost);
	}

	public void displayInfo() {
		JOptionPane.showMessageDialog(null,String.format("Insurance Type : %s , Monthly Cost : $ %d", getInsuranceType(), monthlyCost));

	}
	public void setInsuranceCost(int monthlyCost) {
		this.monthlyCost = monthlyCost;

	}

}
