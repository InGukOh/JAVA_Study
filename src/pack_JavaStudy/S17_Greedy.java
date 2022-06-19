package pack_JavaStudy;

import java.util.Arrays;

public class S17_Greedy {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		Arrays.sort(lost);
		Arrays.sort(reserve);
		int answer = n-lost.length;
		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if(lost[j] == reserve[i]) {
					answer ++;
					lost[j] = -1;
					reserve[i] = -1;
				}
			}
		}
		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if(reserve[i] != -1 && lost[j] !=-1) {
					if(reserve[i] - lost[j] == 1 || reserve[i] - lost[j] == -1) {
						reserve[i] = -1;
                        lost[j] = -1;
                        answer += 1;
					}
				}
			}
		}
		System.out.println(answer);
		
	}
/*
 Arrays.sort(lost);
		Arrays.sort(reserve);
		ArrayList<Integer> lostArr = (ArrayList<Integer>) Arrays.stream(lost).boxed().collect(Collectors.toList());
		ArrayList<Integer> reserveArr = (ArrayList<Integer>) Arrays.stream(reserve).boxed().collect(Collectors.toList());
		
		
		
		System.out.println(lostArr + " " + lostArr.size());
		System.out.println(reserveArr + " " + reserveArr.size());
		
		int count = 0;
		for (int i = 0; i < lostArr.size(); i++) {
			if(reserveArr.contains(lostArr.get(i)-1)) {
				reserveArr.remove(Integer.valueOf(lostArr.get(i)-1));
				count++;
			} else if(reserveArr.contains(lostArr.get(i)+1)) {
				reserveArr.remove(Integer.valueOf(lostArr.get(i)+1));
				count++;
			}
		}
        for (int i = 0; i < lostArr.size(); i++) {
			if(reserveArr.contains(lostArr.get(i))) {
				int temp = lostArr.get(i);
				lostArr.remove(Integer.valueOf(temp));
				reserveArr.remove(Integer.valueOf(temp));
			}
		}
		int answer = n;
		System.out.println(answer + " " + lostArr.size() + " " + count);
		answer = n - lostArr.size() + count;
 */
}
