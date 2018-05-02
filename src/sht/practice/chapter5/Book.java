package sht.practice.chapter5;

public class Book {
	Book(){}
	private String title;
	private int money;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	Book(String title,int money){
		this.title=title;
		this.money=money;
	}
}
