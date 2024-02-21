package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(5);
		a.add(10);
		a.add(20);
		a.add(15);
		System.out.println(a);

		
		/*
		 * List<Integer> l1=new ArrayList<>(); for(Integer num: a) { l1.add(num*2);
		 * System.out.println("The result is:"+l1); }
		 */
		 
		
		List<Integer> l1=a.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l1);
	}

}
