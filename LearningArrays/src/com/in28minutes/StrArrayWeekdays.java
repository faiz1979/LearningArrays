package com.in28minutes;

import java.util.Arrays;

public class StrArrayWeekdays {
	
	String[] weekDays;
	
	public void StrArrayWeekdays()
	{
		this.weekDays = weekDays;
	}
	
	public String[] addWeekdaysToArray()
	{
		String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		this.weekDays = weekDays;
		return weekDays;
	}
	
	public void readArray(String[] weekDays)
	{
		int noOfDays = this.weekDays.length;
		System.out.println(weekDays[0]);
		System.out.println(weekDays[1]);
		System.out.println(weekDays[2]);
		System.out.println(weekDays[3]);
		System.out.println(weekDays[4]);
		System.out.println(weekDays[5]);
		System.out.println(weekDays[6]);
		System.out.println("Total number of days in the week:" +noOfDays);
		for(int i=weekDays[0].length(); i>=0; i--)
		
			System.out.println(weekDays[i]);
		}
	
	public void longestStringInArray(String[] weekDays)
	{
		String[] newArray = addWeekdaysToArray();
		System.out.println(Arrays.toString(newArray));
		int arraylen = newArray.length;
		System.out.println(arraylen);
		
		int memberlen0 = newArray[0].length();
		System.out.println(newArray[0] + " " +memberlen0);
		
		int memberlen1 = newArray[1].length();
		System.out.println(newArray[1] + " " +memberlen1);
		
		int memberlen2 = newArray[2].length();
		System.out.println(newArray[2] + " " +memberlen2);
		
		int memberlen3 = newArray[3].length();
		System.out.println(newArray[3] + " " +memberlen3);
		
		int memberlen4 = newArray[4].length();
		System.out.println(newArray[4] + " " +memberlen4);
		
		int memberlen5 = newArray[5].length();
		System.out.println(newArray[5] + " " +memberlen5);
		
		int memberlen6 = newArray[6].length();
		System.out.println(newArray[6] + " " +memberlen6);
		
		int largestString = Integer.MIN_VALUE;
		
		for(int j=0;j<newArray.length;j++)
		{
			if(newArray[j].length()>largestString)
			{
				largestString = newArray[j].length();
				
			}
		}
		System.out.println("Largest string in the array: " +largestString);
	}

}
