package com.abhishekvtcodes.classes.methodoveriding.Day1;

public class Child extends Parent {

	// Parent->Child -> Covarient

	@Override
	public Long display() {
		System.out.println("child display");
		return 0L;
	}

	public static void cookRecipe() {
		System.out.println("This is, i am changing");
	}
}
