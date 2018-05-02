package sht.practice.chapter5;

public class Book {
	Book(){}
	private String name;
	private int much;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMuch() {
		return much;
	}
	public void setMuch(int much) {
		this.much = much;
	}
	Book(String name,int much){
		this.name=name;
		this.much=much;
	}
}
