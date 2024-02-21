package com.common;

import java.util.ArrayList;
import java.util.List;

public class MaxAndComparator {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(10);
		a.add(20);
		a.add(5);
		a.add(15);
		a.add(25);
		System.out.println(a);
		/*
		 * Integer min = a.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		 * System.out.println(min);
		 * 
		 * Integer min1 = a.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		 * System.out.println(min1);
		 * 
		 * Integer max = a.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		 * System.out.println(max); Integer max1 = a.stream().max((i1, i2) -> -
		 * i1.compareTo(i2)).get(); System.out.println(max1);
		 */
		for(Integer num: a)
		{
			
		}
	}
}
