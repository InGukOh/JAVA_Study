package pack_NCT;

public class NCT_2 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 1;

		while (count < 101) // 빈칸이 조건에 해당될 동안 반복하기
		{
		sum = sum + count;
		count++;
		}
		System.out.println(sum);

	}

}
