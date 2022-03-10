package com.human.ex2;

public class Tire {
	public String name="±ÝÈ£";
	public int year=2020;
	public Tire() {}
	public Tire(String name, int year) {
		super();
		this.name = name;
		this.year = year;
		}
	@Override
	public String toString() {
		return "Tire [name=" + name + ", year=" + year + "]";
	}
	
	
}

