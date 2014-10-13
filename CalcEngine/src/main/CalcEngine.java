package main;

public class CalcEngine {
	
	public CalcEngine(){
	}
	
	public double Calculate(double investment, int year, double IR){
		return Math.pow(1+IR/100, year)*investment;
	}
}
