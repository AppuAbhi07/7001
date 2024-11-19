package com.abhishekvtcodes.Day2;

public class ChildWithFinal extends ParentWithFinal{
	
	public void display() {//compile time error
        System.out.println("Child's display method");
    }

}
