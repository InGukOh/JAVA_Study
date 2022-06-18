package pack_NCT;

import java.util.Scanner;

public class NCT_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean bounded = false;
		String jump = "jump";
		if(input ==1) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(jump + " " + i);
			}
			if(bounded==true) {
				bounded = false;
				for (int i = 0; i < 10; i++) {
					System.out.println(jump + " " + i*-1);
				}
			} else {
				System.out.println("실행");
				bounded = true;
			}
		}
		System.out.println(bounded);
		//?7xx6x?
		//735624 172563 736629 731659
		//?56x?
		//xx2?
		//?2xx8
	}
	/*
	 * 
	 	깃발을 눌러서 코드를 시작하면 공이 바로 움직인다. x
	    깃발을 누른 후 처음 스페이스 키를 누를 때 bounded 변수는 false 값을 가진다. x
		stop 코드가 실행되고 동작이 멈출 때 bouned 값은 false 값을 가진다. o
		bounded 변수 초깃값을 true로 바꾸면, 농구공이 되돌아 오지 않고 계속 이동한다.
		if와 짝을 이루는 else 블록 아래 코드(set bounded to true)는 스페이스 키를 누를 때마다 한 번씩만 실행된다.x
	 */
	 
}
