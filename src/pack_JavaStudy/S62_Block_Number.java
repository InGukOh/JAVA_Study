package pack_JavaStudy;

public class S62_Block_Number {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		String answer = "";
		
		String[] PNArr = phone_number.split("");
        int count = phone_number.length();
		int replaceCount = 0;        
        for(String change : PNArr) {
			if(replaceCount < count-4) {
				change = "*";
			}
			answer +=change;
			replaceCount++;
		}
        System.out.println(answer + "1");
		
		answer = "";
		for (int i = 0; i < phone_number.length() - 4; i++) {
	         answer += "*";
	    }
		System.out.println(answer + phone_number.substring(phone_number.length() - 4) + "2");
		
		System.out.println(phone_number.replaceAll(".(?=.{4})", "*") + "3");
	}
}
