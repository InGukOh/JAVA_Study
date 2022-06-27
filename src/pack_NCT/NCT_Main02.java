package pack_NCT;

import java.util.Scanner;

public class NCT_Main02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String star = "*";
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
