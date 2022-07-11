package pack_JavaStudy_2;

import java.util.Arrays;

public class S00_Take_Ground {

	private int[][] sum = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

	int solution(int[][] land) {
		int i = 0, lth = land.length;
		sum = new int[lth][4];
		for (int j = 0; j < 4; j++)
			sum[i][j] = land[i][j];
		sum(land, 1);
		return Arrays.stream(sum[lth - 1]).max().getAsInt();
	}

	private void sum(int[][] land, int i) {
		if (i != land.length) {
			int max = Arrays.stream(sum[i - 1]).max().getAsInt();
			for (int j = 0; j < 4; j++)
				if (sum[i - 1][j] == max) {
					sum[i - 1][j] = 0;
					int iki = Arrays.stream(sum[i - 1]).max().getAsInt();
					sum[i][j] = land[i][j] + iki;
					sum[i - 1][j] = max;
				} else
					sum[i][j] = land[i][j] + max;
			sum(land, i + 1);
		}
	}

}
