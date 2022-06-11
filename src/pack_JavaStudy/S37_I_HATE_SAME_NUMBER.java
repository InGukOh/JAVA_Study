package pack_JavaStudy;

import java.util.ArrayList;

public class S37_I_HATE_SAME_NUMBER {

	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		ArrayList<Integer> toAnswer = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			try {
				if(arr[i] == arr[i+1]) {
					continue;
				} else if(arr[i] != arr[i+1]) {
					toAnswer.add(arr[i]);
				}
			} catch (Exception e) {
				toAnswer.add(arr[i]);
				break;
			}
			
		}
		int[] answer = new int[toAnswer.size()];
		for (int i = 0; i < toAnswer.size(); i++) {
			answer[i] = toAnswer.get(i).intValue();
		}
		//System.out.println(Arrays.toString(answer));

	}

}
