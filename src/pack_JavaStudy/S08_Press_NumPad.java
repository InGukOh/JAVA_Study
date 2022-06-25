package pack_JavaStudy;

import java.util.Arrays;

public class S08_Press_NumPad {

	public static void main(String[] args) {
		int[] numbers= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
	
		String hand = "left";
			
		String answer = "";
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
				numbers[i] =11;
			}
		}
        int Llast = 10;
        int Rlast = 12;
        for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%3==1) {
				answer+="L";
				Llast = numbers[i];
			} else if(numbers[i]%3==0) {
				answer+="R";
				Rlast = numbers[i];
			} else {
				int minL = (numbers[i] > Llast) ? numbers[i] - Llast : Llast- numbers[i];
				int minR = (numbers[i] > Rlast) ? numbers[i] - Rlast : Rlast- numbers[i];
				
				int RangeL = minL%3 + minL/3;
				int RangeR = minR%3 + minR/3;
				
				if(RangeL < RangeR) {
					answer+="L";
				} else if(RangeL > RangeR) {
					answer+="R";
				} else {
					if(hand.equals("right")) {
						answer +="R";
						Rlast = numbers[i];
					} else {
						answer +="L";
						Llast = numbers[i];
					}
				}
			}
		}
       
	
		System.out.println(answer);
	}
}
