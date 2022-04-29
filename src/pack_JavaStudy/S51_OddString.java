package pack_JavaStudy;

import java.util.Arrays;

public class S51_OddString {

	public static void main(String[] args) {
		String s = "try hello world";
		String[] spl = s.split(" ");
		String answer = "";
		String forTrim = "";
		for (int i = 0; i < spl.length; i++) {
			for (int j = 0; j < spl[i].length(); j++) {
				if(j % 2 == 0) {
					forTrim +=spl[i].toUpperCase().charAt(j);
				} else {
					forTrim +=spl[i].toLowerCase().charAt(j);
				}
			}
			if(i<spl.length-1) {
				forTrim +=" ";
			}
		}
		answer = forTrim.trim();
		
		System.out.println(answer);
	}

}
//https://programmers.co.kr/learn/courses/30/lessons/12930/solution_groups?language=java