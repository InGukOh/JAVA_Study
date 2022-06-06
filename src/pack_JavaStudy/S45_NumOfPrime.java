package pack_JavaStudy;

public class S45_NumOfPrime {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		int[] num = new int[n+1];
        for(int i=2; i<=n; i++) {
            num[i] = i;
        }
      
        for(int i=2; i<=n; i++) {
            if(num[i]==0) continue;
            
            for(int j= 2*i; j<=n; j += i) {
                num[j] = 0;
            }
        }
        
        for(int i=0; i<num.length; i++) {
            if(num[i]!=0) {
                answer++;
            }
        }
		System.out.println(answer);  
	}
}
