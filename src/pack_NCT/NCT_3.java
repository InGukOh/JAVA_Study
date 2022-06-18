package pack_NCT;

public class NCT_3 {
	

	public static void main(String[] args) {
		int h = 5;
		draw1(h);
		draw2(h);
	
		
	}

	static void draw1(int h) {
		if(h==0) {
			return;
		}
		draw1(h-1);
		for (int i = 0; i <h ; i++) {
			System.out.printf("*");
		}
		System.out.printf("\n");
	}
	
	static void draw2(int h) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
}
