package pack_JavaStudy;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class S58_Max_N_Min {

	public static void main(String[] args) {
		int n =3;
		int m = 12;
		int[] answer = yaksu(n,m);
		System.out.println(answer);
	}
	public static int[] yaksu(int gets_n, int gets_m) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int bigger = gets_n;
		int smaller = gets_m;
		if(gets_m > gets_n) {
			bigger = gets_m;
			smaller = gets_n;
		}
		System.out.println(bigger);
		System.out.println(smaller);
		int max = 0;
		int min = 0;
		boolean checker= true;
		for(int i = 1; i<=bigger; i++) {
			if(gets_n%i ==0 && gets_m%i==0) {
				max = i;
			}
			if(bigger*i%smaller == 0&&checker == true) {
				min = bigger*i;
				checker = false;
			}
		}
		list.add(max);
		list.add(min);
		int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
		return arr;
	}
}
//https://programmers.co.kr/learn/courses/30/lessons/12940/solution_groups?language=java
