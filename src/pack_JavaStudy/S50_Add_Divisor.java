package pack_JavaStudy;

public class S50_Add_Divisor {

	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			answer += (n%i ==0) ? i : 0;
		}
		System.out.println(answer);
	}
}
//https://programmers.co.kr/learn/courses/30/lessons/12928/solution_groups?language=java