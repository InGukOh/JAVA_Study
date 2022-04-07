package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Vertical_Maneuvering_Equipment {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입체기동장치 갯수 : ");
			int EquipmentCount = sc.nextInt();
			ArrayList<Integer> EquipmentNum = new ArrayList<>(EquipmentCount);
			int startNum = EquipmentCount-1;
			for (int i = EquipmentCount; i > 0; i--) {
				EquipmentNum.add(0);
			}
			for (int i = EquipmentCount; i > 0; i--) {
				System.out.print(i + " ");
				EquipmentNum.set(startNum, sc.nextInt());
				startNum--;
			}
			int idx = 1;
			for(int i : EquipmentNum) {
				System.out.println(idx+ "  " + i);
				idx++;
			}
		}
}
