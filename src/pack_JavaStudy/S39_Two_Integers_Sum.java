package pack_JavaStudy;

public class S39_Two_Integers_Sum {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		if(a>b) {
			int reset = 0;
			reset = a;
			a = b;
			b = reset;
		}
		long answer = 0;
		for (int i = a; i <= b; i++) {
			answer +=i;
		}
		System.out.println(a + " " +b);
		System.out.println(answer);
	}

}
