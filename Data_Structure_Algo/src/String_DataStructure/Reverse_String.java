package String_DataStructure;

public class Reverse_String {
	
	public static String reverse(String str) {
		
		StringBuilder result = new StringBuilder(str);
		result.reverse();
		
		return result.toString();
	}
	
	// optimize the the above function
	public static String Reverse(String s) {
		int left = 0 ;
		int rigth = s.length()-1;
		
		
		char []ch =  s.toCharArray();
		
		while(left < rigth) {
			char temp = ch[left];
			ch[left] = ch[rigth];
			ch[rigth] = temp;
			
			left++;
			rigth--;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		System.out.println("hello");
		
		String s1 = "world";
		System.out.println(reverse(s1));
		String s = "Hello";
		System.out.println(Reverse(s));

	}

}
