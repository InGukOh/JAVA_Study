package pack_JavaStudy;

public class S55_Square_root {

	public static void main(String[] args) {
		long n = 1212121212;
		long answer = 0;
		
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if(Math.sqrt(n)%i==0) {
				answer = (long)((long)Math.pow((long) Math.sqrt(n)+1,2));
				break;
			} else {
				answer = -1;
			}
		}
	}
}
//https://programmers.co.kr/learn/courses/30/lessons/12934/solution_groups?language=java
