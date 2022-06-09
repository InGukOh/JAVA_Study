package pack_JavaStudy;

public class S41_Count_P_Y {

	public static void main(String[] args) {
		boolean answer = true;
		String s = "pPoooyY";
		
		int counter1 = 0;
		int counter2 = 0;
		
		String[] IS = s.split("");
		for (int i = 0; i < IS.length; i++) {
			if(IS[i].equals("p") || IS[i].equals("P") ) {
				counter1++;
			} else if(IS[i].equals("y") || IS[i].equals("Y")) {
				counter2++;
			}
		}
		if(counter1 != counter2) {
			answer = false;
		}

	}

}
