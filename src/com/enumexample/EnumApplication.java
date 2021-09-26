package com.enumexample;

public class EnumApplication {

	public static void main(String[] args) {
		EnumSwitchTest monday = new EnumSwitchTest(Day.MONDAY);
		monday.selectADay();
		EnumSwitchTest tuesday = new EnumSwitchTest(Day.TUESDAY);
		tuesday.selectADay();
		EnumSwitchTest friday = new EnumSwitchTest(Day.FRIDAY);
		friday.selectADay();
	}

}
