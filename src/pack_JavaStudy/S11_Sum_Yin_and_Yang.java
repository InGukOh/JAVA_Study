package pack_JavaStudy;

public class S11_Sum_Yin_and_Yang {

	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int answer = 0;
		for (int i = 0; i < signs.length; i++) {
			if(signs[i]==false) {
				absolutes[i] *=-1;
			}
			answer += absolutes[i];
		}
		System.out.println(answer);
	}

}
