package pack_JavaStudy;

import java.util.Arrays;

public class S56_DeleteMinimum {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1,9,8,6,5,11,22,33,44,55,66};
		int[] answer = new int[1];
		if(arr.length == 1) {
			answer[0] = -1;
		} else {
			answer = new int[arr.length-1];
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			int l = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=min) {
					answer[l]=arr[i];
					l++;
				}
			}
			System.out.println(Arrays.toString(answer));
		}
	}
}
//https://programmers.co.kr/learn/courses/30/lessons/12935/solution_groups?language=java
