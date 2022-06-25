package pack_JavaStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S07_Int_String_and_English {

	public static void main(String[] args) {
		String s = "one4seveneight";
		int answer = 0;
		
		String[] Snums = {"zero","one","two","three","four","five","six","seven","eight","nine",};
		String[] Inums = {"0","1","2","3","4","5","6","7","8","9"};
		for (int i = 0; i < Snums.length; i++) {
			Pattern pat = Pattern.compile(Snums[i]);
			Matcher matcher = pat.matcher(s);
			s = matcher.replaceAll(Inums[i]);
		}
		System.out.println(Integer.parseInt(s));
		
	}

}
