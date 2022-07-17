package pack_JavaStudy_2;

import java.util.TreeMap;

public class S00_That_Song {

	public static void main(String[] args) {
		/* 예시
		 * m			musicinfos													answer
		 * "ABCDEFG"	["12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"]	"HELLO"
		 * "ABC"		["12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"]	"WORLD"
		 */
	}
	public String solution(String m, String[] musicinfos) {
		m = m.replaceAll("C#", "c").replaceAll("D#", "d").replaceAll("F#", "f").replaceAll("G#", "g").replaceAll("A#",
				"a");
		TreeMap<Integer, String> answer = new TreeMap<>();
		answer.put(0, "(None)");
		for (String musicinfo : musicinfos) {
			String[] temp = musicinfo.split(",");
			int time = (Integer.parseInt(temp[1].substring(0, 2)) - Integer.parseInt(temp[0].substring(0, 2))) * 60
					+ (Integer.parseInt(temp[1].substring(3)) - Integer.parseInt(temp[0].substring(3)));
			temp[3] = temp[3].replaceAll("C#", "c").replaceAll("D#", "d").replaceAll("F#", "f").replaceAll("G#", "g")
					.replaceAll("A#", "a");
			musicinfo = "";
			for (int i = 0; i < time; i++)
				musicinfo += temp[3].charAt(i % temp[3].length());
			if (musicinfo.contains(m))
				answer.putIfAbsent(time, temp[2]);
		}
		return answer.get(answer.lastKey());
	}

}
