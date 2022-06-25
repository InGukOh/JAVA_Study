package pack_JavaStudy;

public class S06_New_ID_Recommend {

	public static void main(String[] args) {
		String new_id = "=.=";
		String answer = "";
		String temp = new_id.toLowerCase();
		//System.out.println("1단계 : " + temp);
        temp = temp.replaceAll("[^-_.a-z0-9]","");
        //System.out.println("2단계 : " + temp);
        temp = temp.replaceAll("[.]+",".");
        //System.out.println("3단계 : " + temp);
        temp = temp.replaceAll("^[.]|[.]$","");//앞뒤만 확인해서 지우기
        //System.out.println("4단계 : " + temp);
	     
        if(temp.equals("")) {
            temp+="a";
            //System.out.println("5단계 : " + temp);
        }
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");//앞뒤만 확인해서 지우기 다시한번!
            System.out.println("6단계 : " + temp);
	    }
	    if(temp.length()<=2) {
	    	while(temp.length()<3) {
	    		temp+=temp.charAt(temp.length()-1);
	    	}
	    	//System.out.println("7단계 : " + temp);
	    }
	    answer=temp;
	     System.out.println("Answer : " +answer);
	}
	/*
	public static String Process(String new_id) {
		String stp1 = new_id.toLowerCase();
		System.out.println("1단계끝 : "+ stp1);
		
		String stp2 = "";
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(stp1.split("")));
		String pattern = "[a-z0-9._-]";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).matches(pattern)) {
				stp2+=list.get(i);
			}
		}
		System.out.println("2단계끝 : "+ stp2);
		
		String stp3 = stp2.replaceAll("[.]+",".");
		System.out.println("3단계끝 : "+stp3);
		
		if(stp3.length()==0) {
			stp3 = "a";
		}
		if(stp3.charAt(0)=='.') {
			stp3 = stp3.substring(1,stp3.length());
		}
		if(stp3.length() != 0) {
			if(stp3.charAt(stp3.length()-1)=='.') {
				stp3 = stp3.substring(0,stp3.length()-1);
			}
		}
		
		System.out.println("4단계끝 : "+stp3);
		System.out.println("5단계끝 : " + stp3);
		
		System.out.println("길이 : " + stp3.length());
		if(stp3.length()>=16) {
			stp3 = stp3.substring(0, 15);
		}
		System.out.println("6단계끝 : " + stp3);
		
		if(stp3.length()<=2) {
			while (stp3.length()<=2) {
				stp3 += stp3.charAt(stp3.length()-1);
			}
		}
		if(stp3.charAt(0)=='.') {
			stp3 = stp3.substring(1,stp3.length());
		}
		if(stp3.length() != 0) {
			if(stp3.charAt(stp3.length()-1)=='.') {
				stp3 = stp3.substring(0,stp3.length()-1);
			}
		}
		
		System.out.println("4단계끝 : "+stp3);
		System.out.println(stp3);
		return stp3;
	}
	*/
}
