package br.com.monte.model;

public class Restaurant implements Comparable<Restaurant> {
	
	private String name;
	
	private Integer rating;

	public Restaurant() {}
	
	public Restaurant(String name, Integer rating) {
		super();
		this.name = name;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", rating=" + rating + "]";
	}

	public void accept(Restaurant t) {
		System.out.println(t);
	}

	@Override
	public int compareTo(Restaurant restaurant) {
		if(this.rating > restaurant.getRating()) {
			return 1;
		}
		
		if(restaurant.getRating() > this.rating) {
			return -1;
		}
		return 0;
	}
}
