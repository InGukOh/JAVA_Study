package pack_JavaStudy;

import java.util.Arrays;

public class S32_Trasure_Map {

	public static void main(String[] args) {
		int n;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] Sarr1 = new String[arr1.length];
		String[] Sarr2 = new String[arr2.length];
		for (int i = 0; i < Sarr1.length; i++) {
			Sarr1[i] = String.format("%0"+Sarr1.length+"d",  Long.parseLong(Integer.toBinaryString(arr1[i])));
		}
		for (int i = 0; i < Sarr2.length; i++) {
			Sarr2[i] = String.format("%0"+Sarr2.length+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
		}
		
		String[] answer = new String[arr1.length];
		Arrays.fill(answer, "");
		String sum = "";
		for (int i = 0; i < Sarr1.length; i++) {
			for (int j = 0; j < Sarr2.length; j++) {
				sum = "";
				System.out.println(Sarr1[i].charAt(j) + "  " + Sarr2[i].charAt(j));
				if((Sarr1[i].charAt(j) =='0' && Sarr2[i].charAt(j) == '1') ||
				   (Sarr1[i].charAt(j) =='1' && Sarr2[i].charAt(j) == '0') ||
				   (Sarr1[i].charAt(j) =='1' && Sarr2[i].charAt(j) == '1') ) {
					sum +="#";
				} else {
					sum +=" ";
				}
				answer[i] +=sum;
			}	
		}
		System.out.println(Arrays.toString(answer));
		/*
		 * System.out.println(Arrays.toString(BA));
		 * System.out.println(Arrays.toString(Sarr1));
		 * System.out.println(Arrays.toString(Sarr2));
		 */
		
	}

}
