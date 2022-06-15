package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Comparator;

public class S28_Pick_Two_and_Sum {

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if(!list.contains(numbers[i]+numbers[j]) && i!=j) {
					list.add(numbers[i]+numbers[j]);
				}
			}
		}
		list.sort(Comparator.naturalOrder());
		int[] answer = new int[list.size()];
		int size = 0;
		for(int temp : list) {
			answer[size++] = temp;
		}
	

	}

}
