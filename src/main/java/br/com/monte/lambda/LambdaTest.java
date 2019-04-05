package br.com.monte.lambda;

import java.util.Collections;
import java.util.List;

import br.com.monte.comparator.RestaurantComparator;
import br.com.monte.model.Restaurant;
import br.com.monte.service.RestaurantService;

public class LambdaTest {

	public static void main(String[] args) {
		RestaurantService service = new RestaurantService();
		
		printOriginalList(service);
		printSortingList(service);
		printOriginalListWithDefaultMethodAndLambda(service);
		printSortingListWithDefaultMethodAndLambda(service);
	}
	
	private static void printOriginalList(RestaurantService service) {
		System.out.println("---------- Original List ----------");
		List<Restaurant> restaurantList = service.listAll();
		for (Restaurant restaurant : restaurantList) {
			System.out.println(restaurant);
		}
	}
	
	private static void printSortingList(RestaurantService service) {
		System.out.println("\n---------- Sorting List ----------");
		List<Restaurant> restaurantList = service.listAll();
		Collections.sort(restaurantList, new RestaurantComparator());
		for (Restaurant restaurant : restaurantList) {
			System.out.println(restaurant);
		}
	}

	private static void printOriginalListWithDefaultMethodAndLambda(RestaurantService service) {
		System.out.println("\n---------- Original List with Default Method and Lambda ----------");
		List<Restaurant> restaurantList = service.listAll(); 
		restaurantList.forEach(i -> System.out.println(i));
	}
	
	private static void printSortingListWithDefaultMethodAndLambda(RestaurantService service) {
		System.out.println("\n---------- Sorting List with Default Method and Lambda ----------");
		List<Restaurant> restaurantList = service.listAll();
		restaurantList.sort(new RestaurantComparator());
		restaurantList.forEach(i -> System.out.println(i));
	}
}
