package pack_JavaStudy;

public class S49_Caesar_Cipher {

	public static void main(String[] args) {
		
		String s = "a Z z";
		int n = 1;
		String answer = "";
		
		for (int i = 0; i < s.split("").length; i++) {
			if(Character.isUpperCase((char)(s.charAt(i)))) {
				answer += (s.charAt(i)+n > 90) ? (char)(s.charAt(i)-Math.abs(n-26)):(char)(s.charAt(i)+n);
			} else if (Character.isLowerCase((char)(s.charAt(i)))) {
				answer += (s.charAt(i)+n > 122) ? (char)(s.charAt(i)-Math.abs(n-26)):(char)(s.charAt(i)+n);
			} else { 
				answer += " "; 
			}
		}
		
		System.out.println(answer);
	
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer += (char) (s.charAt(i));
			} else if (s.charAt(i) > 96 && s.charAt(i) < 123) {
				answer += (s.charAt(i) + n > 122) ? (char) (s.charAt(i) + n - 26) : (char) (s.charAt(i) + n);
			} else {
				answer += (s.charAt(i) + n > 90) ? (char) (s.charAt(i) + n - 26) : (char) (s.charAt(i) + n);
			}
		}
		System.out.println(answer);
	}
	
	//https://programmers.co.kr/learn/courses/30/lessons/12926/solution_groups?language=java
}
