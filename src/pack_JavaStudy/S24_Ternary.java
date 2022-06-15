package pack_JavaStudy;

public class S24_Ternary {

	public static void main(String[] args) {
		int n = 45;
		String toTernary= Integer.toString(n,3);
		StringBuffer sb = new StringBuffer(toTernary);
		String reverse = sb.reverse().toString();
		int answer = Integer.valueOf(reverse,3);
		System.out.println(answer);
		
	}

}
