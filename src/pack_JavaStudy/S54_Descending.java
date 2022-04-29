package pack_JavaStudy;

import java.util.Arrays;
import java.util.Collections;

public class S54_Descending {

	public static void main(String[] args) {
		long n = 118372;
		String s = String.valueOf(n);
		String[] ss = s.split("");
		Arrays.sort(ss,Collections.reverseOrder());
		String bAns = "";
		for (int i = 0; i < ss.length; i++) {
			bAns+=ss[i];
		}
		long answer = Long.parseLong(bAns);
		System.out.println(answer);

	
	}

}
