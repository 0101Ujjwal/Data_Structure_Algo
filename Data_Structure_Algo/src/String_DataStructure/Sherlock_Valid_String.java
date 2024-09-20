package String_DataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sherlock_Valid_String {
	public static String isValid(String s) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
		
		int arr[] = new int[charMap.size()];
		int idx = 0;
		for(Map.Entry<Character, Integer> freqEntry : charMap.entrySet()) {
			arr[idx++] = freqEntry.getValue();
					
		}
		Arrays.sort(arr);
		
		if(charMap.size() == 1) {
			return "Yes";
		}
		
		int first = arr[0];
		int secound = arr[1];
		int secoundLast = arr[arr.length-2];
		int last = arr[arr.length-1];
		
		if(first == last) {
			return "yes";
		}
		if(first == 1 && secound == last) {
			return "yes";	
		}
		
		if(first ==secound && secound ==secoundLast && secoundLast == (last-1)) {
			return"yes";
		}else {
			return "no";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "abc";
         System.out.println(isValid(str));
	}

}
