package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class S22_Super_Game {

	public static void main(String[] args) {
		//실패율은 다음과 같이 정의한다.
		//스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		int N = 5; //스테이지 수
		int[] stages = {2, 1, 2, 6, 4, 1, 3, 3}; //스테이지
		//int[] stages = {4,4,4,4,4}; 
		
		ArrayList<Integer> list1 = (ArrayList<Integer>)Arrays.stream(stages).boxed().collect(Collectors.toList());
		ArrayList<Double> list2 = new ArrayList<>();
		double S = stages.length*1.0;
		for (int i = 1; i <= N; i++) {
			list2.add((Double)(Collections.frequency(list1, i)/S));
			S = S-Collections.frequency(list1, i);
		}
		int[] answer = new int[list2.size()];
		for (int i = 1; i <= answer.length; i++) {
			answer[i-1] = i;
		}
	
		for (int i = 0; i < answer.length-1; i++) {
			for (int j = 0; j < answer.length-1; j++) {
				if(list2.get(j) < list2.get(j+1) ) {
					double tempD = list2.get(j);
					int tempI = answer[j];
					list2.set(j,list2.get(j+1));
					answer[j] = answer[j+1];
					list2.set(j+1, tempD);
					answer[j+1] = tempI;
				}
			}
		}
	
		System.out.println(list2);
		System.out.println(Arrays.toString(answer));
		
	}

}
