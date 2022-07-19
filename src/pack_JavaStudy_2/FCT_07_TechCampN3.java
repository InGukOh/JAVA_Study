package pack_JavaStudy_2;

public class FCT_07_TechCampN3 {

	public static void main(String[] args) {
		String[] board = {"ABBBBC","AABAAC","BCDDAC","DCCDDE","DCCEDE","DDEEEB"};
		solution(board);

	}
	public static int solution(String[] board) {
		int answer = 0;
		char mark = ' '; // 제거될 블록의 기준이 될 변수
		int leng = board.length;
		char[][] array = new char[leng][leng]; // 블록이 제거된 상태를 담을 배열
		// board[x].charAt(y)
		for (int y = 0; y < leng; y++) {// 세로줄
			// array 초기화
			for (int i = 0; i < leng; i++)
				for (int j = 0; j < leng; j++)
					array[i][j] = board[i].charAt(j);
			// mark 초기화 및 array 수정
			for (int x = 0; x < leng; x++) {
				mark = board[x].charAt(y);
				array[x][y] = '0';
				if (y != 0)
					array = left(mark, array, x, y, leng); // 줄 좌로 탐색
				if (y != leng)
					array = right(mark, array, x, y, leng); // 줄 좌로 탐색
			}
			// array 속 0을 세서 최댓값 추출
			int cnt = 0; // 0의 개수를 저장할 변수
			for (char[] arr : array)
				for (char ch : arr)
					if (ch == '0')
						cnt++;
			if (cnt > answer)
				answer = cnt;
		}
		for (int x = 0; x < leng; x++) {// 가로줄
			// array 초기화
			for (int i = 0; i < leng; i++)
				for (int j = 0; j < leng; j++)
					array[i][j] = board[i].charAt(j);
			// mark 초기화 및 array 수정
			for (int y = 0; y < leng; y++) {
				mark = board[x].charAt(y);
				array[x][y] = '0';
				if (x != 0)
					array = up(mark, array, x, y, leng); // 줄 위로 탐색
				if (x != leng)
					array = down(mark, array, x, y, leng); // 줄 아래로 탐색
			}
			// array 속 0을 세서 최댓값 추출
			int cnt = 0; // 0의 개수를 저장할 변수
			for (char[] arr : array)
				for (char ch : arr)
					if (ch == '0')
						cnt++;
			if (cnt > answer)
				answer = cnt;
		}
		return answer;
	}

	private static char[][] left(char mark, char[][] array, int x, int y, int leng) {
		for (int j = y - 1; j >= 0; j--) {
			if (array[x][j] == mark) {
				array[x][j] = '0';
				for (int i = x + 1; i < leng; i++)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = left(mark, array, i, j, leng);
					} else
						break;
				for (int i = x - 1; i >= 0; i--)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = left(mark, array, i, j, leng);
					} else
						break;
			} else
				break;
		}
		return array;
	}

	private static char[][] right(char mark, char[][] array, int x, int y, int leng) {
		for (int j = y + 1; j < leng; j++) {
			if (array[x][j] == mark) {
				array[x][j] = '0';
				for (int i = x + 1; i < leng; i++)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = right(mark, array, i, j, leng);
					} else
						break;
				for (int i = x - 1; i >= 0; i--)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = right(mark, array, i, j, leng);
					} else
						break;
			} else
				break;
		}
		return array;
	}

	private static char[][] up(char mark, char[][] array, int x, int y, int leng) {
		for (int i = x - 1; i >= 0; i--)
			if (array[i][y] == mark) {
				array[i][y] = '0';
				for (int j = y + 1; j < leng; j++)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = up(mark, array, i, j, leng);
					} else
						break;
				for (int j = y - 1; j >= 0; j--)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = up(mark, array, i, j, leng);
					} else
						break;
			} else
				break;
		return array;
	}

	private static char[][] down(char mark, char[][] array, int x, int y, int leng) {
		for (int i = x + 1; i < leng; i++)
			if (array[i][y] == mark) {
				array[i][y] = '0';
				for (int j = y + 1; j < leng; j++)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = down(mark, array, i, j, leng);
					} else
						break;
				for (int j = y - 1; j >= 0; j--)
					if (array[i][j] == mark) {
						array[i][j] = '0';
						array = down(mark, array, i, j, leng);
					} else
						break;
			} else
				break;
		return array;
	}

}
