package in.ashokit;

import java.time.LocalDate;
import java.time.Period;

public class Demo5 {

	public static void main(String[] args) {
		Period period = Period.ofDays(5);
		System.out.println(period.getDays());

		period = Period.ofMonths(3);
		System.out.println(period.getMonths());

		period = Period.ofYears(2);
		System.out.println(period.getYears());

		// Find Difference between 2 dates
		Period p = Period.between(LocalDate.parse("2020-05-18"), LocalDate.parse("2017-04-17"));
		System.out.println(p);
	}

}
