package pack_JavaStudy;

public class S46_Claping {
	
	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		for(int i=2; i<=n; i++) {
			if(i%2 ==0 && i !=2) {
				continue;
			}
			int count =0;
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
	                answer++;
			}
		}
		System.out.println(answer);  
	}
}
