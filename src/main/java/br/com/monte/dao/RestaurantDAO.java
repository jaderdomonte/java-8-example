package br.com.monte.dao;

import java.util.Arrays;
import java.util.List;

import br.com.monte.model.Restaurant;

public class RestaurantDAO {

	public List<Restaurant> listAll(){
		return Arrays.asList(new Restaurant("D.O.M", 10), new Restaurant("Arturito", 7), new Restaurant("Sal Gastronomia", 5));
	}
}
