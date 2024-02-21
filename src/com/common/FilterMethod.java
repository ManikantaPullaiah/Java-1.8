package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(5);
		a.add(10);
		a.add(20);
		a.add(15);
		System.out.println(a);
		/*
		 * List<Integer> l1=new ArrayList(); for(Integer num : a) { if(num%2==0) {
		 * l1.add(num); System.out.println("The Even numbers are:"+num); } }
		 */
List<Integer> l1=a.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println("The even numbers:"+l1);
	}
}
