package pack_JavaStudy_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FCT_03 {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] nk = br.readLine().split(" ");
//			String sequence = br.readLine(); // 입력받아야 되니 사용하란 소리겠지만 없이 하는 게 편하다.
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			int cnt = 1;
			for (int i = k; i < n; i += (k - 1)) {
				cnt++;	
			}
			System.out.println(cnt);
		
	}

}
