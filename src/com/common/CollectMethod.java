package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("pavan");
		a.add("Raviteja");
		a.add("Chiranjevi");
		a.add("venkatesh");
		a.add("Nagajuna");
		System.out.println(a);
		//List<String> l1=a.stream().filter(s->s.length()>=9).collect(Collectors.toList());
		//List<String> l1=a.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		List<String> l1=new ArrayList<>();
		for(String s: a) {
			String newString=s.toUpperCase();
			l1.add(newString);
		}
		System.out.println(l1);
	}

}
