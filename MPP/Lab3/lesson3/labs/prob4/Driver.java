package lesson3.labs.prob4;

public class Driver {

	public static void main(String[] args) {

		Property[] properties = { new House(9000), new Condo(2), new Trailer() };

		Admin admin = new Admin(properties);

		double totalRent = admin.computeTotalRent();
		System.out.println(totalRent);
	}
}
