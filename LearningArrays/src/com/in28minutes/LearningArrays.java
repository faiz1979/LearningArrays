package com.in28minutes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LearningArrays {
	private int noOfElements;
	private int[] array1 = new int[noOfElements];
	Scanner sc=new Scanner(System.in); 
	
	public LearningArrays()
	{
		int[] array1 = new int[5];
		this.array1 = array1;
	}

	public int[] getArray1() {
		
		int noOfElements;   
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		noOfElements=sc.nextInt();
		this.noOfElements = noOfElements;
		
		int[] array1 = new int[noOfElements];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<noOfElements; i++)  
		{  
		//reading array elements from the user   
		array1[i]=sc.nextInt();  
		}  

		return array1;
	}

	public int[] setArray1(int[] array1) 
	{
		this.array1 = array1;
		return array1;
	}
	
	public int maxValueFromArray(int[] array1)
	{
		int maxValue = 0;
		for(int i=0; i< array1.length; i++)
		{
			if(maxValue<array1[i])
			{
				maxValue = array1[i];
			}
		}
		return maxValue;
		
	}
	
	public int minValueFromArray(int[] array1)
	{
		int minValue = array1[0];
		for(int i=0; i< array1.length; i++)
		{
			if(minValue>array1[i])
			{
				minValue = array1[i];
			}
		}
		return minValue;
		
	}
	
	public int sumOfTheNumbersinArray(int[] array1)
	{
		int sum = 0;
		
		for(int i=0; i< array1.length; i++)
		{
			sum = sum + array1[i];
		}
		return sum;
	}
	
	public BigDecimal avgOfTheNumbersinArray(int[] array1)
	{
		int sum = sumOfTheNumbersinArray(array1);
		BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal (noOfElements), 4, RoundingMode.UP);
		return avg;
	}
	

}
