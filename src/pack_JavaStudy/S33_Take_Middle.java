package pack_JavaStudy;

public class S33_Take_Middle {

	public static void main(String[] args) {
		String s = "abcd";
		String answer = "";
		int check = s.length();
		String[] spt = s.split("");
		int lock = 0;
		if(check%2 != 0) {
			answer += spt[check/2];
		} else {
			answer = spt[check/2-1] + spt[check/2];
		}
		System.out.println(answer);
	}

}
