package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class S48_String_To_Int {

	public static void main(String[] args) {
		
		String s ="-12+33+-3";
		String[] sArr = s.split("-|\\+");
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int check_m = s.indexOf("-");
		int check_p = s.indexOf("+");
		
		while (check_m != -1) {
			list1.add(check_m);
			check_m = s.indexOf("-", check_m+"-".length());
		}
		
		while (check_p != -1) {
			list2.add(check_p);
			check_p = s.indexOf("+", check_p+"+".length());
		}
		int sum = 0;
		for (int i = 0; i < sArr.length; i++) {
			if(sArr[i] !="") {
				if(list1.contains(i)) {
					sum -= Integer.parseInt(sArr[i]);
				} else if(list2.contains(i)) {
					sum += Integer.parseInt(sArr[i]);
				} 
			} else {
				continue;
		}
		System.out.println(sum);
		
		System.out.println(list1);
		System.out.println(list2);
	}
	}
}

