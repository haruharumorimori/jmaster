package sht.practice.chapter6;

public class Employee {
	private String name;
	private int ID;
	Employee(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	Employee(String name,int ID) {
		this.name=name;
		this.ID=ID;
	}

}
