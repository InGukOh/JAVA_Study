package pack_JavaStudy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class S05_Lottos {

	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		int[] answer = new int[2];
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		int minC = 0;
		int maxC = 0;
		for (int j = 0; j < lottos.length; j++) {
			int k = lottos[j];
			if(lottos[j]==0) {
				maxC++;
				continue;
			}
			if(IntStream.of(win_nums).anyMatch(x -> x == k)) {
				minC++;
				if(minC == 6) {
					answer[0] = 1;
					answer[1] = 1;
				}
			}
		}
		maxC += minC;
		System.out.println(minC + " " + maxC);
		for (int i = 0; i < answer.length; i++) {
			for (int j = 1; j <= 6; j++) {
				
			}
		}
		if(minC == 6) {
			answer[0] = 1;
		}
		if(minC == 5) {
			answer[0] = 2;
		}
		if(minC == 4) {
			answer[0] = 3;
		}
		if(minC == 3) {
			answer[0] = 4;
		}
		if(minC == 2) {
			answer[0] = 5;
		}
		if(minC < 2) {
			answer[0] = 6;
		}
		
		if(maxC == 6) {
			answer[1] = 1;
		}
		if(maxC == 5) {
			answer[1] = 2;
		}
		if(maxC == 4) {
			answer[1] = 3;
		}
		if(maxC == 3) {
			answer[1] = 4;
		}
		if(maxC == 2) {
			answer[1] = 5;
		}
		if(maxC < 2) {
			answer[1] = 6;
		}
		Arrays.sort(answer);
		
		
		System.out.println(Arrays.toString(answer));
		//1 2 3 4 5 6 
		//6 5 4 3 2 ~
		
	}

}
