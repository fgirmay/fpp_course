package april2017;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	/**
	 * Public method for determining value of all items in the bicycle shop.
	 * To produce an output, it calls two helper methods. You must implement
	 * the helper methods. Do not modify this method
	 */
	public static int inventoryValue(List<Bicycle> bicycles, List<Accessory> accessories) {
		//DO NOT MODIFY IN ANY WAY
		return (int)computeCurrentValue(prepareList(bicycles, accessories));
	}
	
	/** 
	 * Prepares and returns a list of all products in the store, obtained by combining
	 * the list of all bicycles and the list of all accessories (the inputs to the
	 * method), to form a list having a type common to (generalized from) the two 
	 * input types.
	 */
	private static List<Product> prepareList(List<Bicycle> bicycles, List<Accessory> accessories) {
		/* implement */

		List<Product> pro = new ArrayList<>();

//		pro.addAll(bicycles);
//		pro.addAll(accessories);

		for(Bicycle b: bicycles){

			pro.add(b);
		}

		for(Accessory a: accessories){

			pro.add(a);
		}


		return pro;
	}
	
	/** Returns the sum of the prices of all items in the bicycle shop, including
	 *  bicycles and accessories
	 */
	private static double computeCurrentValue(List<Product> products) {

		double currentValue = 0.0;

		for(Product pro: products){

			currentValue += pro.getTotalValue();
		}
		return currentValue;
	}
}
