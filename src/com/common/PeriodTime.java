package com.common;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTime {

	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(1993, 8, 15);
		LocalDate today=LocalDate.now();
		Period 	p=Period.between(birthday, today);
		System.out.printf("Age is %d years %d months %d Days",p.getYears(),p.getMonths(),p.getDays());

	}

}
