package br.com.monte.comparator;

import java.util.Comparator;

import br.com.monte.model.Restaurant;

public class RestaurantComparator implements Comparator<Restaurant> {

	public int compare(Restaurant restaurant1, Restaurant restaurant2) {
		if(restaurant1.getScore() > restaurant2.getScore()) {
			return 1;
		}
		
		if(restaurant2.getScore() > restaurant1.getScore()) {
			return -1;
		}
		
		return 0;
	}
}
