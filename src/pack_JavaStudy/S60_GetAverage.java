package pack_JavaStudy;

public class S60_GetAverage {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		for (int i = 1; i < arr.length; i++) {
			arr[0] += arr[i];
			System.out.println(arr[0]);
		}
		double res = arr[0]/Double.valueOf(arr.length);
		System.out.printf("%f",res);
	}

}
