package sht.practice.chapter9;

public class BMIBeans {
	private double tall;
	private double heavy;
	private double BMI;
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public double getHeavy() {
		return heavy;
	}
	public void setHeavy(double heavy) {
		this.heavy = heavy;
	}
	public double getBMI() {
		return BMI;
	}
	public void setBMI(double BMI) {
		this.BMI = BMI;
	}
	BMIBeans(){}
	BMIBeans(double tall,double heavy,double BMI){
		this.tall=tall;
		this.heavy=heavy;
		this.BMI=BMI;
	}

}
