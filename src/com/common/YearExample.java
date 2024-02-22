package com.common;

import java.time.Year;
import java.util.Scanner;

public class YearExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		Year y=Year.of(n);
		if(y.isLeap())
		{
			System.out.printf("%d Year of Leap Year ",n);
			
		}else
		{
			System.out.printf("%d Year of Not Leap Year ",n);
		}

	}

}
