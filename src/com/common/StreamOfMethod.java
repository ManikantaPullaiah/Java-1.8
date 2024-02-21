package com.common;

import java.util.stream.Stream;

public class StreamOfMethod {

	public static void main(String[] args) {
		/*
		 * Stream<Integer> s=Stream.of(9,99,9999,99999); s.forEach(System.out::println);
		 */
		
		Double[] d= {10.0,10.1,10.2,10.3,10.4};
		Stream<Double> d1=Stream.of(d);
		d1.forEach(System.out::println);

	}

}
