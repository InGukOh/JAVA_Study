package pack_JavaStudy;

import java.util.Arrays;

public class S25_Budget {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		Arrays.sort(d);
		int answer = 0;
		for (int i = 0; i < d.length; i++) {
			if(budget - d[i] >=0) {
				budget = budget -d[i];
				answer++;
			}
		}
		System.out.println(answer);

	}

}
