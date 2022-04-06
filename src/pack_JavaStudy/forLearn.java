package pack_JavaStudy;

import java.util.Scanner;

public class forLearn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단위를 선택하세요 : 1.피트 2.미터");
		int choice = sc.nextInt();
		System.out.println("거리1 입력");
		double fst = sc.nextDouble();
		System.out.println("거리2 입력");
		double sec = sc.nextDouble();
		
		double calc = 0.0;
		String unit = null;
		if(choice==1) {
			calc = 3.281;
			unit = "ft";
		} else {
			calc = 1;
			unit = "m";
		}
		double res = Math.abs(fst - sec);
		System.out.printf("결과1(피트) : %.3f",res*calc);
		System.out.printf("결과2(미터) : %.3f",res*1);
		
		System.out.println("다음문제");
		
		System.out.println("길이를 입력하세요");
		int lengths=sc.nextInt();
		boolean setter = true;
		while(setter) {
			if(lengths < 3) {
				System.out.println("다시입력하세요");
				lengths = sc.nextInt();
			} else {
				setter = false;
			}
		}
		for (int i = 0; i < lengths; i++) {
			if(i==0 || i==lengths-1) {
				System.out.println("*****");
			} else {
				System.out.println("*   *");
			}
		}
		
		System.out.println("다음문제");
		
		System.out.println("구구단");
		System.out.println("시작단");
		int start = sc.nextInt();
		System.out.println("끝단");
		int end = sc.nextInt();
		int safe=0;
		if(start > end) {
			safe = end;
			end = start;
			start = safe;
		}
		int startFwhile = start;
		int endFwhile = end;
		for (int i = start; i <= end; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(start + "*"+j +"="+start*j);
			}
			start++;
		}
		System.out.println("\nfor문 종료됨\n");

		
		int stack = 0;
	
		while(startFwhile <= endFwhile) {
			stack++;
			System.out.println(startFwhile+"*"+stack+"="+startFwhile*stack);
			if(stack == 9) {
				startFwhile++;
				stack=1;
			}
		}
		
		System.out.println("while문 종료됨");
		
		System.out.println("다음문제");
		
		System.out.println("n입력");
		int n = sc.nextInt();
		System.out.println("k입력");
		int k = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1 || i==n || j==1 || j ==n) {
					System.out.print("*");
				} else if(k==1) {
					System.out.print("*");
				}else if((i+j)%k== 1){
					System.out.print("*");
	
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
