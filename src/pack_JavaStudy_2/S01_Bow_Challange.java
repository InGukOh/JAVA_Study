package pack_JavaStudy_2;

import java.util.Arrays;

public class S01_Bow_Challange {

	public static void main(String[] args) {
		int n = 5;
		int[] info = {2,1,1,1,0,0,0,0,0,0,0};
		int[] answer = new int[11];
		int[] Ryan = new int[11];
		int arrow = n;
		for (int i = 0; i < 11; i++) {
			for (int j = 1; j < n; j++) {
				if(info[i] >= j) {
					arrow-=1;
				} else {
					arrow-=1;
					Ryan[i]=j;
					break;
				}
			}
		}
		boolean[] visited = new boolean[11];
		for (int i = 1; i <= n; i++) {
			System.out.println(Arrays.toString(comb(info,Ryan,visited,0,i,n)));
		}
		//System.out.println(Arrays.toString(Ryan));
		//System.out.println(ApP);
		System.out.println(Arrays.toString(answer));
		System.out.println("종료1");
	}
	
	public static int[] comb(int[] info, int[] Ryan, boolean[] visited, int index, int r, int n) {
		int[] answer = new int[11];
		if(r == 0 ) {
			int sum = n;
			int[] Ryan_get = new int[11];
			for (int i = 0; i < Ryan.length; i++) {
				if(visited[i] == true) {
					sum += Ryan[i];
					//System.out.println(sum);
					Ryan_get[i] = Ryan[i];
					//System.out.println(Ryan[i]+" & i = " + i + " / " );
					if(sum ==5) {
						//System.out.println(Arrays.toString(Ryan_get));
						int stack = 0;
						int res = comp(info,Ryan_get);
						if(res > stack) {
							stack = res;
							answer = Ryan_get;
							System.out.println(Arrays.toString(answer));
						}
					}
				}
			}
			return answer;
		}	
		
		if(index == Ryan.length) {
			return answer;
		} else {
			visited[index] = true;
			comb(info,Ryan,visited,index+1,r-1,0);
			
			visited[index] = false;
			comb(info,Ryan,visited,index+1,r,0);
		}
		return answer;
	}
	public static int comp(int[] info, int[] Ryan_get) {
		int[] toAnswer = new int[11];
		int point = 10;
		int RP = 0;
		int IP = 0;
		for (int i = 0; i < 11; i++) {
			if(info[i] < Ryan_get[i]) {
				RP+=point;
			} else if(info[i] > Ryan_get[i]){
				IP +=point;
			}
			point --;
		}
		
		return RP - IP;
	}

}
