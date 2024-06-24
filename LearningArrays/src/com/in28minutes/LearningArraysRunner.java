package com.in28minutes;

import java.math.BigDecimal;
import java.util.Arrays;

public class LearningArraysRunner {

	public static void main(String[] args) {
		
		LearningArrays newArray = new LearningArrays();
		//newArray.getArray1();
		
		int[] arrayDetails = newArray.setArray1(newArray.getArray1());
		System.out.println(Arrays.toString(arrayDetails));
		
		int maxValue = newArray.maxValueFromArray(arrayDetails);
		System.out.println("Maximunm value in the array = " +maxValue);
		
		int minValue = newArray.minValueFromArray(arrayDetails);
		System.out.println("Minimum value in the array = " +minValue);
		
		int sumOfNuminArray = newArray.sumOfTheNumbersinArray(arrayDetails);
		System.out.println("Sum of the numbers in the array = " +sumOfNuminArray);
		
		BigDecimal avgOfNuminArray = newArray.avgOfTheNumbersinArray(arrayDetails);
		System.out.println("Average of the numbers in the array = " +avgOfNuminArray);
		

	}

}
