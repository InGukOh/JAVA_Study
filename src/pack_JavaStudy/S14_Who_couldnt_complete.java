package pack_JavaStudy;

import java.util.HashMap;

public class S14_Who_couldnt_complete {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
										//"leo", "kiki", "eden"
										//"marina", "josipa", "nikola", "vinko", "filipa"
										//"mislav", "stanko", "mislav", "ana"
		String[] completion = {"eden", "kiki"};
										//"eden", "kiki"
										//"josipa", "filipa", "marina", "nikola"
										//"stanko", "ana", "mislav"
		
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
        for (String element : participant) {
        	hm.put(element, hm.getOrDefault(element, 0) + 1);
        }
        //System.out.println("1차 : " + hm.toString());
        
        for (String element : completion) {
        	hm.put(element, hm.get(element) - 1);
        }
        //System.out.println("걸러짐 : " + hm.toString());
        for (String key : hm.keySet()) {
        	if(hm.get(key) > 0) {
        		answer = key;
        	}
		}
        
        System.out.println("답 : " + answer);
		/*
		 * ArrayList<String> list1 = new ArrayList<>(Arrays.asList(participant));
		 * 
		 * Collections.sort(list1);
		 * 
		 *
		 * for (int i = 0; i < completion.length; i++) {
		 * if(Arrays.asList(participant).contains(completion[i])) {
		 * list1.remove(completion[i]); } } String answer = list1.get(0);
		 */
		//System.out.println(answer);
	}

}
