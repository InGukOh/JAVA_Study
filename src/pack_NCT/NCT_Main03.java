package pack_NCT;

import java.util.Arrays;

public class NCT_Main03 {

	public static void main(String[] args) {
		int a = 3;
		int[] answer = new int[a];
		for (int i = 0; i < a; i++) {
			answer[i] = i+1;
		}
		System.out.println(Arrays.toString(answer));
	}

}
