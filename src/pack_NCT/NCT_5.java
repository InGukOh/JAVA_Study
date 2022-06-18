package pack_NCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NCT_5 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 3, 3, 4, 4};
		
		//int[] answer = {};
		int idx = 0;
		int cnt = 0;
		//ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == arr[j]) {
					System.out.println(" " + i + " " + arr[j]);
					cnt++;
				}
			}
			if(cnt > 1) {
				list.add(cnt);
			}
			cnt = 0;
		}
		System.out.println(list);
		
	}

}
