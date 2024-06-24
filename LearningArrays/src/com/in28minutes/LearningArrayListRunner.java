package com.in28minutes;

import java.util.ArrayList;

public class LearningArrayListRunner {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
System.out.println(list1);

//list1.remove(1);
//list1.remove(3);
//list1.remove(1);

System.out.println(list1);

ArrayList<String> Stringlist1 = new ArrayList<String>();

Stringlist1.add(0, "Apple");
Stringlist1.add(1, "Bat");
Stringlist1.add(2, "Ball");
Stringlist1.add(3, "Cat");
Stringlist1.add(4, "Fish");

System.out.println(Stringlist1);

ArrayList<Integer> Integerelist1 = new ArrayList<Integer>();

Integerelist1.add(0, 1);
Integerelist1.add(1, 2);
Integerelist1.add(2, 3);
Integerelist1.add(3, 4);
Integerelist1.add(4, 5);

System.out.println(Integerelist1);

	}

}
