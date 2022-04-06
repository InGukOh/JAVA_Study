package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] list = new int[a][b];
		int i = 0, j = -1, n = 0 ,t = 1, f = a, g = b;
		//i = 세로위치 
		//j = 가로위치
		//n = 들어가야할 숫자
		//t = 방향전환용 값
		//f = 세로 값
		//g = 가로 값
	
		while(true) { // 배열 입력이 다 될때까지
			for (int l = 0; l < b; l++) { // 가로줄 최대 갯수는 b에 의해 결정되기 때문에 l < b로 설정
				n+=1; //들어가야 할 숫자는 0부터 시작 1씩 늘어난다.
				j+=t; //첫시작은 j = -1 t = 1 이므로 결과값 = 0이다 이후 t값에 따라 1씩 늘어난다.
				list[i][j] = n; //세로위치, 가로위치의 좌표에 n값이 들어간다.
			}
			a--; // 
			b--; //
			for (int l = 0; l < a; l++) {//0 1 2
				n++;
				i+=t;
				list[i][j] = n;
			}
			t*=-1; //여기서 방향 전환 t는 1이지만 * -1하면 -1이 되므로 방향을 전환하고 이후 다시 이 위치로 와 
						// -1을 곱하여 다시 1이되는 사이클을 반복한다
			if(a<=0||b<=0) break; //a와 b가 감소되어 (0,0)까지 입력을 다마쳤다면 while문 종료
		}
			
		for (int l = 0; l < f; l++) { //출력 : 세로
			for (int l2 = 0; l2 < g; l2++) {//출력 : 가로
				System.out.print(list[l][l2] +" ");
			}
			System.out.println();
		}
	}//main end 
}