package pack_JavaStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Test_0505 {

	public static void main(String[] args) {
//////////////////////////////////// 1 번문제 ////////////////////////////////////
		int[][] v = {{1, 4}, {3, 4}, {3, 10}}; 
		
		int[] answer = new int[2];

		int[] x = new int[3];
		int[] y = new int[3]; 
		for (int i = 0; i < v.length;i++) {
			x[i] = v[i][0]; 
			y[i] = v[i][1]; 
		}
		 if (x[0] == x[1]) {
	         answer[0] = x[2];
	      } else if (x[0] == x[2]) {
	         answer[0] = x[1];
	      } else {
	         answer[0] = x[0];
	      }
	      if (y[0] == y[1]) {
	         answer[1] = y[2];
	      } else if (y[0] == y[2]) {
	         answer[1] = y[1];
	      } else {
	         answer[1] = y[0];
	      }

	      System.out.println(Arrays.toString(answer));
	      
////////////////////////////////////1 번문제 ////////////////////////////////////
	      
////////////////////////////////////2 번문제 ////////////////////////////////////
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      for (int i = 0; i < a; i++) {
	    	  for (int j = 0; j <= i; j++) {
	    		  System.out.print("*");
	    	  }
	    	  if(i<=a-1) {
	    		  System.out.print(" ");
	    	  }
	      }
////////////////////////////////////2 번문제 ////////////////////////////////////
	}
}



















