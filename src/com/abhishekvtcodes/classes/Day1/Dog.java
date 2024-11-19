package com.abhishekvtcodes.classes.Day1;

public class Dog extends Animal{
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("Dog Barks ->bow bow");
	}

	
	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.sound();
		
	}
	
}
