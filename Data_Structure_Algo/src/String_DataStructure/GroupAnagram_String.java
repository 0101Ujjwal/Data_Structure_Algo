package String_DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram_String {
	
	

	public static List<List<String>> groupAnagrams(String[] strs){
		
		Map<String , List<String>> map = new HashMap<>();
		
		for (String str : strs) {
            // Convert the string to a char array and sort it
            char[] ch = str.toCharArray();
            
            Arrays.sort(ch);
		     
            String sorted = new String(ch);
            
            if(!map.containsKey(sorted)) {
            	map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(str);
            
		}
		return new ArrayList(map.values());
	}

	public static void main(String[] args) {
		String strs[] = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(strs));
		

	}

}
