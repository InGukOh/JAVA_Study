package pack_JavaStudy;

import java.util.Arrays;
import java.util.Collections;

public class S42_String_DESC {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String[] sArr = s.split("");
		String answer = "";
		Arrays.sort(sArr,Collections.reverseOrder());
		for (int i = 0; i < sArr.length; i++) {
			answer +=sArr[i];
		}
		System.out.println(answer);
	}

}
