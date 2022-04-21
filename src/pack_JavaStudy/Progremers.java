package pack_JavaStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Progremers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		long[] test = solution(x, n);
		System.out.println(Arrays.toString(test));
	}
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long count = 1;
        for(int i = 0; i<n; i++){
            answer[i] = x*count;
            count++;
        }
        return answer;
    }
}
