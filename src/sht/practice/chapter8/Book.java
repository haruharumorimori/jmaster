package sht.practice.chapter8;

public class Book {
	Book(){}
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	Book(String name,int price){
		this.name=name;
		this.price=price;
	}
}
