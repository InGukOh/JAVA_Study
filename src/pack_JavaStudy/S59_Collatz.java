package pack_JavaStudy;

public class S59_Collatz {

	public static void main(String[] args) {
		int num= 6;
		 Long numTlong = Long.valueOf(num);
	        int answer = 1;
	        if(numTlong > 8000000 || numTlong < 1){
	            answer = -1;
	        } else {
	            while (true) {
	            	if(numTlong==1) {
	            		answer = 0;
	            	}
		            if(answer == 500) {
						answer = -1;
						break;
					}
					if(numTlong%2 == 0) {
						numTlong = Even(numTlong);
					} else if(numTlong%2 != 0){
						numTlong = Odd(numTlong);
					}
					if(numTlong==1) {
						break;
					}
					answer ++;
	            }
	        }
	        System.out.println(answer);
	}
	    public static long Even(long gets) {
			long E_res = gets/2;
			return E_res;
		}
		public static long Odd(long gets) {
			long O_res = gets*3 + 1;
			return O_res;
		}
}
