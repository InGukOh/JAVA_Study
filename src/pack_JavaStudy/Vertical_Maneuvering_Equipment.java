package pack_JavaStudy;

import java.util.Scanner;

public class Vertical_Maneuvering_Equipment {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입체기동장치 갯수 : ");
			int EquipmentCount = sc.nextInt();
			
			int[] EquipmentGas = new int[EquipmentCount];
			int Equipment_Num = EquipmentCount-1;

			for (int i = EquipmentGas.length; i > 0; i--) {
				System.out.print(i+" ");
				EquipmentGas[Equipment_Num] = sc.nextInt();
				Equipment_Num--;
			}
			int idx = 1;
			for(int i : EquipmentGas) {
				System.out.println(idx+ "  " + i);
				idx++;
			}
			
		}
}
