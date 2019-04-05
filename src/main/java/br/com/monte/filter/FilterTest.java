package br.com.monte.filter;

import java.util.List;

import br.com.monte.model.Restaurant;
import br.com.monte.service.RestaurantService;

public class FilterTest {

	public static void main(String[] args) {
		filterRestaurantWitRatingMajorOrEquals7();
	}

	private static void filterRestaurantWitRatingMajorOrEquals7() {
		RestaurantService service = new RestaurantService();
		List<Restaurant> restaurantList = service.listAll();
		
		restaurantList.stream()
					  .filter(r -> r.getRating() >= 7)
					  .forEach(System.out::println);
	}
}
