package pack_JavaStudy;

public class S29_Last_One {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
        for (long i = n; i >= 1; i--) {
			if(n%i == 1) {
				answer = (int)i;
			}
		}
		System.out.println(answer);

	}

}
