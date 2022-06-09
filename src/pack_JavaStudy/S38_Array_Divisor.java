package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S38_Array_Divisor {

	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 10;
		ArrayList<Integer> toAnswer = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%divisor == 0) {
				toAnswer.add(arr[i]);
			}
		}
		System.out.println(toAnswer.size());
		int[] answer = new int[1];
		if(toAnswer.size() == 0) {
			answer[0]=-1;
		} else {
			answer = new int[toAnswer.size()];
			for (int j = 0; j < toAnswer.size(); j++) {
				answer[j] = toAnswer.get(j).intValue();
			}
			Arrays.sort(answer);
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
