package String_DataStructure;

import java.util.Arrays;

public class LongestCommonPrefix_String {
	
	public static String longestPrefix(String []str) {
		
		StringBuilder result = new StringBuilder();
		Arrays.sort(str);
		
		char []first = str[0].toCharArray();
		char []last = str[str.length-1].toCharArray();
		
		for(int i = 0 ; i<str.length; i++) {
			
			if(first[i] != last[i]) {
				break;
			}
			result.append(first[i]);
		}
		return result.toString();
	}

	public static void main(String[] args) {
	
       String []str = {"geeks" , "geekforgeek" , "gee"};
       
       System.out.println(longestPrefix(str));
       
	}

}
