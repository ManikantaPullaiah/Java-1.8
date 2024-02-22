package com.common;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		/*
		 * LocalDateTime time=LocalDateTime.now(); int dd=time.getDayOfMonth(); int
		 * month=time.getMonthValue(); int yyyy=time.getYear();
		 * System.out.printf("%d-%d-%d",dd,month,yyyy); int hh=time.getHour(); int
		 * mm=time.getMinute(); int ss=time.getSecond(); int nn=time.getNano();
		 * System.out.printf("\n%d:%d:%d:%d",hh,mm,ss,nn);
		 */
		LocalDateTime dt=LocalDateTime.of(1995,05,28,12,45);
		System.out.println(dt);
		System.out.println("After 6 months:"+dt.plusMonths(6));
		System.out.println("Before 6 months:"+dt.minusMonths(6));
	
	}
}
