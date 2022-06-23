package pack_JavaStudy;

import java.util.Stack;


public class S09_Crain {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},
								{0,0,1,0,3},
								{0,2,5,0,1},
								{4,2,4,4,2},
								{3,5,1,3,1}};
		int answer = 0;
		int[] moves = {1,5,3,5,1,2,1,4};
		for (int i = 0; i < moves.length; i++) {
			moves[i] -=1;
		}
		int range = board.length;
		Stack<Integer> stc = new Stack<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < range; j++) {
				System.out.println(j + " " + moves[i]);
				if(board[j][moves[i]] != 0) {
					System.out.println("!!"+j + " " + moves[i] + " " +board[j][moves[i]]);
					if(stc.empty() == false && stc.peek() == board[j][moves[i]]) {
						stc.pop();
						answer+=2;
					} else {
						stc.push(board[j][moves[i]]);
					}
					board[j][moves[i]] = 0;

					break;
				}
			}
		}
		
		
		
		System.out.println(answer);
	}

}
