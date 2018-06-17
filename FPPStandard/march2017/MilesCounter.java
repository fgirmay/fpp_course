package march2017;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		/* implement */

		List<Vehicle> list = new ArrayList<>();

		for(Object obj : vehicleArray) {

			list.add((Vehicle) obj);
		}

		return list;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		/*implement */

		int totalMilesTraveled = 0;

		for (Vehicle vehicle : vehicleList) {
			totalMilesTraveled += vehicle.getMilesUsedToday();
		}

		return totalMilesTraveled;
	}
}
