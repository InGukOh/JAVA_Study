package pack_JavaStudy;

import java.time.LocalDate;

public class S25_2016Y {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		LocalDate date = LocalDate.of(2016, a, b);
		String answer =date.getDayOfWeek().toString().substring(0,3);
		System.out.println(answer);
		

	}

}
