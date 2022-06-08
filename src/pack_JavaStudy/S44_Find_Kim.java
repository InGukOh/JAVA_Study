package pack_JavaStudy;

import java.util.Arrays;

public class S44_Find_Kim {
	
	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};
		
		String answer = "";
		
		String F = "김서방은 ";
		String B = "에 있다";
		
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = F+i+B;
			}
		}
		
		System.out.println(Arrays.toString(seoul));
		
		System.out.println(answer);
		
	}

}
