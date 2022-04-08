package pack_JavaStudy;

import java.util.Scanner;

public class Vertical_Maneuvering_Equipment_JT_ask {
		// 첫째 줄에 입체기동장치의 개수 n이 입력된다. (1 <= n <= 100)
		// 둘째 줄부터 n+1번째 줄까지 각 줄에 입체기동장치의 식별번호 a와 가스 보유량 b가 주어진다.
		// a는 중복될 수 없지만 b는 중복될 수 있다. (1 <= a <= 100), (0 <= b <= 10000)
		// 식별번호가 한 번 정해지면 그 입체기동장치의 가스 보유량은 정렬되더라도 변하지 않아야 한다.
		// 첫째 줄부터 n번째 줄까지 각 줄에 식별번호를 오름차순으로 정렬해 가스 보유량과 같이 출력한다.

		// field
		int a, b; // 식별번호, 가스보유량
		
		static Vertical_Maneuvering_Equipment_JT_ask[] mack(int n) {
			
			Vertical_Maneuvering_Equipment_JT_ask[] machines = new Vertical_Maneuvering_Equipment_JT_ask[n]; // 입체기동장치 배열

			// 각 입체기동장치에 식별번호 및 가스보유량 부여
			for (int i = 0; i < n; i++) {
				Vertical_Maneuvering_Equipment_JT_ask machine = new Vertical_Maneuvering_Equipment_JT_ask(); // 배열의 행에 들어갈 각 입체기동장치
				machine.a = (int) (Math.random() * 99) + 2; // 1 <= a <= 100
				machine.b = (int) (Math.random() * 10000) + 1; // 0 <= b <= 10000
				machines[i] = machine; // 행마다 입체기동장치 하나씩 저장
				for (int j = 0; j < i; j++) { // 식별번호 중복 검사
					if (machines[j].a == machines[i].a) {
						i--;
						break;
					}
				}
			}
			return machines;
		}
				
	public static void main(String[] args) {
		// 입체기동장치 개수 입력
				Scanner sc = new Scanner(System.in);
				System.out.println("입체기동장치의 개수 n을 입력하시오.");
				int n = sc.nextInt();
				Vertical_Maneuvering_Equipment_JT_ask[] c;
				c = mack(n);
				System.out.println("식별번호\t:\t가스보유량");
				for(Vertical_Maneuvering_Equipment_JT_ask i : c) {
					System.out.println(i.a + "  " + i.b);
				}
				sc.close();
	}
}
