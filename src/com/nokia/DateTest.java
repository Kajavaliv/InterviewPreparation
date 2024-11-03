package com.nokia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateTest {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfWeek());
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		
		LocalDateTime LDT = LocalDateTime.now();
		System.out.println(LDT);
		
		LocalDate birthday = LocalDate.of(1986, 7, 1);
		LocalDate today = LocalDate.now();
		Period P = Period.between(birthday, today);
		System.out.printf("%d Years %d Months %d Days",P.getYears(),P.getMonths(),P.getDays());
		
		ZoneId Z = ZoneId.systemDefault();
		System.out.println(Z);
		
	}

}
