package pack_JavaStudy;

import java.util.ArrayList;


public class S21_Ponketmon {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
        
		for(int i=1; i<nums.length; i++) {
			if(!list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}
        System.out.println(list);
        if(list.size() < nums.length/2) {
        	answer = list.size();
        } else {
        	answer = nums.length/2;
        }
	
		System.out.println(answer);
	}
}
/*
public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		
		int answer = 0;
		
		HashSet<Integer> hs = new HashSet<>();
		comb(nums,nums.length,nums.length/2,0 ,hs);
		
		System.out.println(answer);
	}
	public static void comb(int[] nums,int n, int r, int idx,HashSet<Integer> hs) {
		if(r == 0) {
			for (int i : hs) {
				System.out.print(nums[i]+" ");
			}
			System.out.println("\n");
			return;
		}
		for (int i = idx; i < n; i++) {
			hs.add(i);
			comb(nums,n,r-1,i+1,hs);
			hs.remove(i);
		}
	}
*/