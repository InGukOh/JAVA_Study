package pack_JavaStudy;

import java.util.Arrays;

public class S28_Min_Square {

	public static void main(String[] args) {
		int answer = 0;
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		for (int i = 0; i < sizes.length; i++) {
			if(sizes[i][1] > sizes[i][0]) {
				int temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
		}		
		int max = 0;
		int min = 0;
		for (int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] > max) {
				max = sizes[i][0];
			}
			if(sizes[i][1] > min) {
				min = sizes[i][1];
			}
		}
		answer = max * min ;
		System.out.println(max + " " + min);
		System.out.println(answer);
	}

}
