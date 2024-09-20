package String_DataStructure;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueOccurance_String {
	
	public static int UniqueCharacter(String str) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
		
		for(int i = 0 ; i< str.length(); i++) {
			char c = str.charAt(i);
			if(charMap.get(c) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "leetcode";
		System.out.println(UniqueCharacter(str));

	}

}
