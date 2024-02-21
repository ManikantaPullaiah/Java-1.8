package com.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedMethod {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);
	
		//List<Integer> l1=marks.stream().sorted().collect(Collectors.toList());
		//System.out.println(l1);
	}	
	}


