package pack_JavaStudy;

import java.util.Arrays;

public class S08_Press_NumPad {

	public static void main(String[] args) {
		int[] numbers= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
	
		String hand = "left";
			
		String answer = "";
		
		int Llast = 10;
		int Rlast = 12;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
				numbers[i]=11;
			}
			int test = numbers[i]%3;
			if(test ==1) {
				answer+="L";
				Llast = numbers[i];
			} else if(test == 0) {
				answer+="R";
				Rlast = numbers[i];
			} else if(test == 2) {
				int minL = (numbers[i]>Llast) ? numbers[i] - Llast : Llast - numbers[i];
				int minR = (numbers[i]>Rlast) ? numbers[i] - Rlast : Rlast - numbers[i];
				int rangeL = (minL%3) + (minL/3);
				int rangeR = (minR%3) + (minR/3);
				if(rangeL < rangeR) {
					answer+="L";
					Llast = numbers[i];
				} else if(rangeR < rangeL) {
					answer+="R";
					Rlast = numbers[i];
				} else {
					answer+= hand.equals("right") ? "R" : "L";
					if(hand.equals("right")) {
						Rlast = numbers[i];
					} else {
						Llast = numbers[i];
					}
				}
			}
		}
	
		System.out.println(answer);
	}
	////////////////////////////////////////////////
	int[][] numpadPos = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };
	//초기 위치
		int[] leftPos = {3,0};
    	int[] rightPos = {3,2};
    	String hand="";
	    public String solution(int[] numbers, String hand) {
	        this.hand = (hand.equals("right")) ? "R" : "L";

	        String answer = "";
	        for (int num : numbers) {
	            String Umji = pushNumber(num);
	            answer += Umji;

	            if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
	            if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;}
	        }
	        return answer;
	    }

	    //num버튼을 누를 때 어디 손을 사용하는가
	    private String pushNumber(int num) {
	        if(num==1 || num==4 || num==7) return "L";
	        if(num==3 || num==6 || num==9) return "R";

	        // 2,5,8,0 일때 어디 손가락이 가까운가
	        if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";
	        if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";

	        //같으면 손잡이
	        return this.hand;
	    }

	    //해당 위치와 번호 위치의 거리
	    private int getDist(int[] pos, int num) {
	        return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1]-numpadPos[num][1]);
	    }
	    /////////////////////////////////////////////////////////////////////////////
	
}
