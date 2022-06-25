package pack_JavaStudy;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class S04_Report {

	public static void main(String[] args) {
		long start = System.nanoTime();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		Map<String,List<String>> map= new HashMap<>();
        Map<String,Integer> mail_map = new HashMap<>();
        // 모든 유저에 대해 신고자리스트를 생성 {muzi=[], neo=[], frodo=[], apeach=[]}
        // Key: 유저, Value: 유저를 신고한 사람들 {muzi=0, neo=0, frodo=0, apeach=0}
        for(String user: id_list){
            List<String> list = new LinkedList<>();
            map.put(user,list);         
            mail_map.put(user,0);    
        }
        
        //System.out.println(map);
       // System.out.println(mail_map);
        
        // 신고자: attacker 신고당한자 : defender
        // 신고당한 건수를 처리함
        
        for(String temp : report){
            String[] arr=temp.split(" ");
            String attacker=arr[0];
            String defender=arr[1];           
            List<String> list =map.get(defender);
            //중복신고를 막음
            if(list.contains(attacker)){
                continue;
            }
            list.add(attacker);
            map.put(defender,list);        
        }         
        
        //System.out.println(map);
        //System.out.println(mail_map);
        
        // K번 신고당한 사람을 찾고, 신고한 사람들에게 Count증가
        for(String data: map.keySet()){
            List<String> list =map.get(data);          
            if(list.size()>=k){                
                for(String user: list){
                    int count =mail_map.get(user)+1;
                    mail_map.put(user,count);          
                }
            }
        }
        
        //System.out.println(map);
        //System.out.println(mail_map);
        
        int i=0;
        int[] answer = new int[id_list.length];
        for(String data: id_list){
        	answer[i]= mail_map.get(data);
        	i++;
        } 
        
		long end = System.nanoTime();
		System.out.println("수행시간: " + (end - start) + " ns");
		System.out.println(Arrays.toString(answer));
		/*
		//System.out.println(ban);
		int[] answer = new int[id_list.length];
		int chk=0;
		
		for (int i = 0; i < id_list.length; i++) {
			for (int j = 0; j < report.length; j++) {
				String[] check = report[j].split(" ");
				if(check[0].equals(id_list[i])&&ban.contains(check[1])) {
					answer[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		*/
		
		
	}

}
