package pack_JavaStudy;

import java.util.Arrays;

public class S08_Press_NumPad {

	public static void main(String[] args) {
		int[] numbers= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
			
		String answer = "";
		String Llast = "*";
		String Rlast = "#";
		
		int[] LEFT = {1,4,7};
        int[] MID = {2,5,8,0};
        int[] RIGHT = {3,6,9};
        
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 1||numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				Llast = Integer.toString(numbers[i]);
			} else if(numbers[i] == 3||numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				Rlast = Integer.toString(numbers[i]);
			} else {
				if(numbers[i]==0) {
					if(Llast.equals("*") && !Rlast.equals("#")) {
						answer +="L";
						Llast = Integer.toString(numbers[i]);
						continue;
					} else if(!Llast.equals("*") && Rlast.equals("#")) {
						answer +="R";
						Rlast = Integer.toString(numbers[i]);
						continue;
					}
				} else {
					
				}
				
				
			}
		}
	
	}
	
	
}
