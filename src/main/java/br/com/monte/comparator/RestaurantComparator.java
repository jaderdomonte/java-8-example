package br.com.monte.comparator;

import java.util.Comparator;

import br.com.monte.model.Restaurant;

public class RestaurantComparator implements Comparator<Restaurant> {

	public int compare(Restaurant restaurant1, Restaurant restaurant2) {
		if(restaurant1.getRating() > restaurant2.getRating()) {
			return 1;
		}
		
		if(restaurant2.getRating() > restaurant1.getRating()) {
			return -1;
		}
		
		return 0;
	}
}
