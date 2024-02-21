package com.common;

import java.util.ArrayList;

public class ToArrayMethod {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(10);
		a.add(20);
		a.add(5);
		a.add(15);
		a.add(25);
		Integer[] array=a.stream().toArray(Integer[] :: new);
		for(Integer x: array)
		{
			System.out.println(x);
		}
	}

}
