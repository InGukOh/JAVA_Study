package pack_JavaStudy;

import java.util.Arrays;
import java.util.Iterator;

public class S08_Press_NumPad {

	public static void main(String[] args) {
		int[] numbers= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
	
		String hand = "left";
			
		String answer = "";
		String Llast = "*";
		String Rlast = "#";
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
				numbers[i]=11;
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		int[] LEFT = {1,4,7,10};
        int[] MID = {2,5,8,11};
        int[] RIGHT = {3,6,9,12};
        
        for (int i = 0; i < numbers.length; i++) {
			if(Arrays.toString(LEFT).contains(Integer.toString(numbers[i]))) {
				answer +="L";
				Llast = Integer.toString(numbers[i]);
				System.out.println(i + " " + Llast +" " + Rlast +" "+"/ answer : " +answer);
			} else if(Arrays.toString(RIGHT).contains(Integer.toString(numbers[i]))) {
				answer +="R";
				Rlast = Integer.toString(numbers[i]);
				System.out.println(i + " " + Llast +" " + Rlast +" "+"/ answer : " +answer);
			} else {
				int[] ULRD = {numbers[i]-3,numbers[i]-1,numbers[i]+1,numbers[i]+3};
				if(nu) {
					
				}
			}
        }
		
		/*
		String[][] pad = {{"1","2","3"},
								  {"4","5","6"},
								  {"7","8","9"},
								  {"*","0","#"}};

		
		String[] change = new String[numbers.length];
		for (int i = 0; i < change.length; i++) {
			
		}
		for (int i = 0; i < change.length; i++) {
			if(numbers[i] == 1||numbers[i] == 4 || numbers[i] == 7) {
				change[i] = "L";
			} else if(numbers[i] == 3||numbers[i] == 6 || numbers[i] == 9) {
				change[i] = "R";
			} else {
				change[i] = String.valueOf(numbers[i]);
			}
		}
		
		for (int i = 0; i < change.length; i++) {
			
		}
		System.out.println(Arrays.toString(change));
		/*
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
				
			}
		}
				*/
		System.out.println(answer);
	}
}
