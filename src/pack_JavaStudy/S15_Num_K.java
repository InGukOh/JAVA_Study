package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class S15_Num_K {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int M = 0; M < commands.length; M++) {
			int i = commands[M][0] - 1;
			int j = commands[M][1] - 1;
			int k = commands[M][2] - 1;
			for (int l = i; l <= j; l++) {
				list1.add(array[l]);
			}
			Collections.sort(list1);
			int insert = 0;
			answer[M] = list1.get(k);
			list1.clear();
		}
		
		//다른사람의 답 풀이 개쩌는거 copyOfRange
		int[] answer2 = new int[commands.length];
		for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer2[i] = temp[commands[i][2]-1];
        }

		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(answer2));
	}

}
