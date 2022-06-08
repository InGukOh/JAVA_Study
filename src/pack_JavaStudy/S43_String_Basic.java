package pack_JavaStudy;

public class S43_String_Basic {

	public static void main(String[] args) {
		
		String s = "1234";
		
		boolean answer = true;
		
		try {
			if(s.length() == 4 || s.length() ==6) {
				int checker = Integer.parseInt(s);
			} else {
				answer = false;
			}
		} catch (Exception e) {
			answer = false;
		}
		System.out.println(answer);
	}

}
