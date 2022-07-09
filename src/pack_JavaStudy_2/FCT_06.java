package pack_JavaStudy_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FCT_06 {

	public static void main(String[] args) {
		int[][] score = {{85, 90}, {65, 67}, {88, 87}, {88, 87}, {73, 81}, {65, 89},{99, 100}, {80, 94}};
		System.out.println(Arrays.toString(solution(score)));

	}
	public static int[] solution(int[][] scores) {
		int[] answer = new int[scores.length];
		int num1 = 0, num2 = 0;
		int[] sum = new int[scores.length];
		int rank = 0;
		for (int i = 0; i < scores.length; i++) {
			num1 += scores[i][0];
			num2 += scores[i][1];
			sum[i] = scores[i][0] + scores[i][1];
		}
		if (num1 == num2)
			while (rank < scores.length) {
				int max = Arrays.stream(sum).max().getAsInt();
				for (int i = 0; i < sum.length; i++)
					if (sum[i] == max) {
						answer[i] = rank + 1;
						sum[i] = 0;
						rank++;
					}
			}
		else if (num1 < num2)
			while (rank < scores.length) {
				int max = Arrays.stream(sum).max().getAsInt();
				ArrayList<Integer> list = new ArrayList<>();
				for (int i = 0; i < sum.length; i++)
					if (sum[i] == max)
						list.add(scores[i][0]);
				if (list.size() == 1) {
					for (int i = 0; i < sum.length; i++)
						if (sum[i] == max) {
							answer[i] = rank + 1;
							sum[i] = 0;
							rank++;
							break;
						}
				} else {
					Collections.sort(list);
					while (!list.isEmpty())
						for (int i = 0; i < sum.length; i++)
							if (sum[i] == max && scores[i][0] == list.get(list.size() - 1)) {
								answer[i] = rank + 1;
								sum[i] = 0;
								list.remove(list.size() - 1);
								rank++;
								break;
							}
				}
			}
		else
			while (rank < scores.length) {
				int max = Arrays.stream(sum).max().getAsInt();
				ArrayList<Integer> list = new ArrayList<>();
				for (int i = 0; i < sum.length; i++)
					if (sum[i] == max)
						list.add(scores[i][1]);
				if (list.size() == 1) {
					for (int i = 0; i < sum.length; i++)
						if (sum[i] == max) {
							answer[i] = rank + 1;
							sum[i] = 0;
							rank++;
							break;
						}
				} else {
					Collections.sort(list);
					while (!list.isEmpty())
						for (int i = 0; i < sum.length; i++)
							if (sum[i] == max && scores[i][1] == list.get(list.size() - 1)) {
								answer[i] = rank + 1;
								sum[i] = 0;
								list.remove(list.size() - 1);
								rank++;
								break;
							}
				}
			}
		return answer;
	}

}
