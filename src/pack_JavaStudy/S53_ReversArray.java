package pack_JavaStudy;

import java.util.Arrays;
import java.util.Collections;

public class S53_ReversArray {

	public static void main(String[] args) {
		long n =9876543210L;
		int[] answer = {};
		String[] ss= String.valueOf(n).split("");
		answer = new int[ss.length];
		int count = ss.length-1;
		for (int i = 0; i < ss.length; i++) {
			answer[i] = Integer.parseInt(ss[count]);
			count--;
		}
		System.out.println(Arrays.toString(answer));
	}

}
//https://programmers.co.kr/learn/courses/30/lessons/12932/solution_groups?language=java