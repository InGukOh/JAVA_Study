package pack_JavaStudy;

public class S36_Dart_Game {

	public static void main(String[] args) {
		
		String dartResult = "1S2D*3T"; //
		int answer = 0;
		int[] round = new int[3];
        char[] carr = dartResult.toCharArray(); //분해
       
        int idx = -1;
        for (int i=0; i<carr.length; i++) {
            if (carr[i] >= '0' && carr[i] <= '9') {
                idx++; 
                round[idx] += Integer.parseInt(String.valueOf(carr[i]));
      
                if (i+1!=carr.length-1 && carr[i+1] == '0'&& carr[i] == '1') {
                    round[idx] -= Integer.parseInt(String.valueOf(carr[i]));
                    round[idx] = 10;
                    i++;                    
                }                
            } else if (carr[i] == 'D') {
                round[idx] *= round[idx];
            } else if(carr[i] == 'T') { 
                round[idx] *= round[idx] * round[idx];
            } else if (carr[i] == '*') {
                if (idx > 0) round[idx-1] *=2;                
                round[idx] *= 2;
            } else if (carr[i] == '#') {            
                round[idx] *= -1;
            }
        }
        answer = round[0]+ round[1]+round[2];
        System.out.println(answer);
	}

}
