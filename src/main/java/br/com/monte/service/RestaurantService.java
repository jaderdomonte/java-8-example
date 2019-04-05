package br.com.monte.service;

import java.util.List;

import br.com.monte.dao.RestaurantDAO;
import br.com.monte.model.Restaurant;

public class RestaurantService {
	
	private RestaurantDAO dao;

	public RestaurantService() {
		this.dao = new RestaurantDAO();
	}
	
	public List<Restaurant> listAll() {
		return this.dao.listAll();
	}
	
	public List<Restaurant> listAllSortingByRestaurantScore(){
		return this.dao.listAllSortingByRestaurantScore();
	}
}
