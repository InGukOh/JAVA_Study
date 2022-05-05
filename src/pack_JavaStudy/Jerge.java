package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class Jerge {

	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve= {1};

		int answer = n-lost.length;
		
		Arrays.sort(lost); //오름차순
		Arrays.sort(reserve); //오름차순
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		for(int temp : lost) { list1.add(temp); }//list1 삽입
		 
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int temp : reserve) { list2.add(temp); } //list2 삽입
		
		ArrayList<Integer> list3 = new ArrayList<>();
		System.out.println(list1);
		System.out.println(list2);
		int cnt=0;
		for (int i = 0; i < list2.size(); i++) {
			if(list1.indexOf(list2.get(i)) != -1) {
				list1.remove(list2.get(i));
				list2.remove(list2.get(i));
				System.out.println("지우기");
			} 
		}
		
		for (int i = 0; i < list2.size(); i++) {
			if(list1.indexOf(list2.get(i)-1) != -1 || list1.indexOf(list2.get(i)+1) != -1) {
				if(list2.indexOf(list2.get(i)-2) != -1 && list2.indexOf(list2.get(i)+2) != -1) {
					continue;
				} else {
					answer++;
				}
			} 
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		/*
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(list1.get(i)==list2.get(j)) {
					list1.set(i, 0);
					list2.set(j, 0);
				}
			}
		}
		
		while (list1.remove(Integer.valueOf(0))){};
		while (list2.remove(Integer.valueOf(0))){answer++;};
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list2.get(j)-1 == 0) {
					if (list2.get(j)+1 == list1.get(i)) {
						answer++;
					}
				}
				if(list2.get(j)-1 == list1.get(i)) {
					answer++;
				}else if(list2.get(j)+1 == list1.get(i)) {
					continue;
				}
			}
		}
		*/
		System.out.println(answer);
	}

}
