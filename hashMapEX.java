// A HashMap contains values based on the key.
// It contains only unique elements.
// It may have one null key and multiple null values.
// It maintains no order.

import java.util.HashMap;

public class RestaurantForEach {
	public static void main(String[] args) {

		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

		System.out.println(restaurantMenu.size());

		for (String item: restaurantMenu.keySet()) {

			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

		}
	}
}


public class GeneralizationsD {
	public static void main(String[] args) {
	
     ArrayList<String> sports = new ArrayList<String>();
    
    	sports.add("Football");
    	sports.add("Boxing");
    
		for(String sport : sports) {
			System.out.println(sport);
		}
		
		//Major cities and the year they were founded
		HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

		majorCities.put("New York", 1624);
		majorCities.put("London", 43);
		majorCities.put("Mexico City", 1521);
		majorCities.put("Sao Paulo", 1554);
    
		for (String city: majorCities.keySet()) {

			System.out.println(city + " was founded in " + majorCities.get(city));

		}
	}
}