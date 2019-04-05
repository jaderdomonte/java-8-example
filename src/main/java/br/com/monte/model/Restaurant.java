package br.com.monte.model;

public class Restaurant {
	
	private String name;
	
	private Integer score;

	public Restaurant() {}
	
	public Restaurant(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", score=" + score + "]";
	}

	public void accept(Restaurant t) {
		System.out.println(t);
	}
}
