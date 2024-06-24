package com.in28minutes;

import java.util.Arrays;

public class studentRunner {

	public static void main(String[] args) {
		

		
		int[] marks = {72, 42, 56, 67, 12};
		Student student = new Student(null, marks);
		
		int[] number = student.getNumberOfmarks();
		System.out.println(Arrays.toString(number));
		int sum = student.getTotalSumOfMarks(number);
		System.out.println(sum);
		System.out.println(student.getMaxMarks());
		System.out.println(student.getMinMarks());

	}

}
