package exercise1;

public abstract class Insurance {

	String insuranceType;
	int monthlyCost;

	public String getInsuranceType() {
		return insuranceType;
	}
	public double getMonthlyCost() {
		return monthlyCost;
	}

	public abstract void setInsuranceCost(int monthlyCost);

	public abstract void displayInfo();

}
