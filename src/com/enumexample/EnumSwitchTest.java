package com.enumexample;

public class EnumSwitchTest {
//	
	Day day;

	public EnumSwitchTest(Day day) {
		this.day = day;
	}

	public void selectADay() {
		switch (day) {
		case MONDAY:
			System.out.println("It is Monday");
			break;
		case FRIDAY: case SATURDAY:
			System.out.println("It is Friday or Saturday");
		default:
			System.out.println("It is any other day of the week");
		}
	}

}
