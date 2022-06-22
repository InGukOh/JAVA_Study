package pack_JavaStudy;

import java.util.Arrays;

public class S10_Sum_No_Numbers {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		Arrays.sort(numbers);
		int answer = 45;
		for (int i = 0; i < numbers.length; i++) {
			answer -=numbers[i];
		}
		System.out.println(answer);
	}

}
