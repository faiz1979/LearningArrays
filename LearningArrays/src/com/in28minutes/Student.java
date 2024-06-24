package com.in28minutes;

import java.util.Scanner;

public class Student {
	
	private int[] marks;
	private String name;
	
	Scanner scan = new Scanner(System.in);
	
	public Student(String name, int[] marks)
	{
		this.name = name;
		this.marks = marks;
	}

	public int[] getNumberOfmarks() 
	{
		//int[] marks = {10, 20, 30, 40, 50};
		
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();
		
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		this.marks = marks;
		return marks;
		
	}

	public int getTotalSumOfMarks(int[] marks) 
	{
		this.marks = marks;
		int sum = 0;
		
		for(int i =0; i<marks.length; i++)
		{
			sum = sum + marks[i];
		}
		return sum;
	}
	
	public int getMaxMarks() 
	{
		int maxMarks = 0;
		for(int j =0; j<marks.length; j++)
		{
			if(marks[j]>maxMarks)
			{
				maxMarks = marks[j];
			}
		}
		return maxMarks;
		
	}
	
	public int getMinMarks() 
	{
		int maxMarks = marks[0];
		for(int j =0; j<marks.length; j++)
		{
			if(marks[j]<maxMarks)
			{
				maxMarks = marks[j];
			}
		}
		return maxMarks;
		
	}
	
	
	
	

}
