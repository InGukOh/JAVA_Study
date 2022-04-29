package pack_JavaStudy;

public class S61_HarshadNumber {

	public static void main(String[] args) {
		int x = 13;
		boolean answer = true;
		
		String[] Arr  = Integer.toString(x).split("");
		int sum = 0;
		for (int i = 0; i < Arr.length; i++) {
			sum += Integer.parseInt(Arr[i]);
		}
		if(x%sum !=0) {
			answer = false;
		}
		
		System.out.println(sum);
		System.out.println(answer);
	}
//  https://programmers.co.kr/learn/courses/30/lessons/12947/solution_groups?language=java&type=all
}
