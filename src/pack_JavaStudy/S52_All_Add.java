package pack_JavaStudy;

public class S52_All_Add {

	public static void main(String[] args) {
		int n = 123;
		
		String[]arr = String.valueOf(n).split("");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
//https://programmers.co.kr/learn/courses/30/lessons/12931/solution_groups?language=java