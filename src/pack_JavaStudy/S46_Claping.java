package pack_JavaStudy;

public class S46_Claping {
	
	public static void main(String[] args) {
		
		int insert = 3;
		
		String answer = "";
		
		for (int i = 1; i <= insert; i++) {
			if(i%2 == 1) {
				answer += "수";
			} else {
				answer +="박";
			}
		}
		System.out.println(answer);
		
	}

}
