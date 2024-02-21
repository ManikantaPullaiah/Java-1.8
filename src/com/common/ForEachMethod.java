package com.common;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("A");
		a.add("AAA");
		a.add("BBB");
		a.add("CCCC");
		
	//a.stream().forEach(s->System.out.println(a));
		a.stream().forEach(System.out::println);
		

	}

}
