package lesson3.labs.prob4;

public class Admin {

	Property[] properties;

	public Admin(Property[] properties) {
		this.properties = properties;
	}

	public double computeTotalRent(){

		double totalRent = 0;

		for (Property property : properties) {

			totalRent += property.computeRent();
		}
		return totalRent;
	}
}
