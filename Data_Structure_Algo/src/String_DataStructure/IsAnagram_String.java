package String_DataStructure;

public class IsAnagram_String {
	
	public static boolean isAnagram(String s , String t ) {
		if(s.length() != t.length()) {
			return false;
		}
		s = s.toLowerCase();
		t = t.toLowerCase();
		
		s =s.replace(" ", "");
		t=t.replace(" ", "");
		
		int count[] = new int[26];
		
		for(int i = 0 ; i<s.length(); i++) {
			count[s.charAt(i)- 'a']++;
		}
		for(int i = 0 ; i<t.length(); i++) {
			count[t.charAt(i)- 'a']--;
		}
		
		for(int c : count) {
			if(c != 0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "silent";
		
		String s3 = "a decimal point";
		String s4 = "im a dot in place";
		
		boolean b2 = isAnagram(s3, s4);
		
		boolean b1 = isAnagram(s1, s2);
		
		System.out.println(b1);
		System.out.println(b2);

	}

}
