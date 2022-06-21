package pack_JavaStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class S16_Test {
	
	static int[] p1 = {1, 2, 3, 4, 5};
	static int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
	static int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		                       //1,3,2,4,2
		ArrayList<Integer> list = new ArrayList<Integer>();
        
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = {0,0,0};
        
        for(int i = 0; i < answers.length; i++){
            if(first[i % 5] == answers[i]){ 
            	scores[0]++;
            }
            if(second[i % 8] == answers[i]){ 
            	scores[1]++;
            }
            if(third[i % 10] == answers[i]){ 
            	scores[2]++;
            }
        }
        
        int[] arr = new int[scores.length];
        
        for(int i = 0; i < scores.length; i++){
            arr[i] = scores[i];
        }
        Arrays.sort(arr);
        
        //System.out.println("오름차순 : " + Arrays.toString(arr));
        
        for(int i = 0; i < arr.length; i++){
        	//System.out.println("score : " + scores[i]);
            if(scores[i] == arr[2]){
                list.add(i+1);
            }
        }
        
        //System.out.println(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        //System.out.println(Arrays.toString(answer));

	}
}
