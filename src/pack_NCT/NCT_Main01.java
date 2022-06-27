package pack_NCT;

public class NCT_Main01 {

	public static void main(String[] args) {
		int[][] v = {{1,4},{3,4},{3,10}};
		
		
		
		int[] answer = new int[2];
		answer[0] = (v[0][0] == v[1][0]) ? v[2][0]: (v[1][0] == v[2][0]) ? v[0][0]:v[1][0] ;
		answer[1] = (v[0][1] == v[1][1]) ? v[2][1]: (v[1][1] == v[2][1]) ? v[0][1]:v[1][1] ;
		System.out.println(answer[0] + " " + answer[1]);
	}

}
