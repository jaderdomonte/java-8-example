package br.com.monte.lambda;

import java.util.List;

import br.com.monte.comparator.RestaurantComparator;
import br.com.monte.model.Restaurant;
import br.com.monte.service.RestaurantService;

public class LambdaTest {

	public static void main(String[] args) {
		RestaurantService service = new RestaurantService();
		
		
		System.out.println("---------- Original List ----------");
		List<Restaurant> restaurantList = service.listAll();
		for (Restaurant restaurant : restaurantList) {
			System.out.println(restaurant);
		}
		
		
		System.out.println("\n---------- Sorting List ----------");
		restaurantList = service.listAllSortingByRestaurantScore();
		for (Restaurant restaurant : restaurantList) {
			System.out.println(restaurant);
		}
		
		System.out.println("\n---------- Original List with Default Method and Lambda ----------");
		restaurantList = service.listAll();
		restaurantList.forEach(i -> System.out.println(i));
		
		System.out.println("\n---------- Sorting List with Default Method and Lambda ----------");
		restaurantList = service.listAll();
		restaurantList.sort(new RestaurantComparator());
		restaurantList.forEach(i -> System.out.println(i));
	}
}
