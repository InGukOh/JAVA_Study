package pack_JavaStudy;

import java.util.Scanner;

public class S57_Even_N_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		String answer = "Odd";
		if(set%2 == 0 ) {
			answer = "Even";
		}
		System.out.println(answer);

	}
}
//https://programmers.co.kr/learn/courses/30/lessons/12937/solution_groups?language=java
