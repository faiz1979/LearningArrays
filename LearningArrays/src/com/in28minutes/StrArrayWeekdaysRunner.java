package com.in28minutes;

import java.util.Arrays;

public class StrArrayWeekdaysRunner {

	public static void main(String[] args) {
		
		StrArrayWeekdays array1 = new StrArrayWeekdays();
		String[] abc = array1.addWeekdaysToArray();
		System.out.println(Arrays.toString(abc));
		array1.readArray(abc);
		array1.longestStringInArray(abc);

	}

}
