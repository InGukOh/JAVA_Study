package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class S13_Make_PrimeNum {

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int answer = 0;
		int answer2 = 0;
		Arrays.sort(nums);
		/////////////////////////////////////////////
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					list.add(nums[i] + nums[j] + nums[k]);
				}
			}
		}
		int cnt =0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 2; j <= list.get(i); j++) {
				//System.out.println(list.get(i) + " " + j);
				if(list.get(i)%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				answer++;
			}
			cnt = 0;
		}
		System.out.println(list);
		System.out.println(answer);
		/////////////////////////////////////////////////
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if(prime_check(nums[i] + nums[j] + nums[k])==true) {
						answer2++;
					}
				}
			}
		}
		System.out.println(answer2);
	}
	public static boolean prime_check(int num) {
		boolean res = false;
		
		int cnt =0;
		for (int i = 1; i <= (int)Math.sqrt(num); i++) {
			if(num % i ==0) {
				cnt++;
			}
		}
		if(cnt == 1) {
			res = true;
		}
		
		return res;
	}

}
