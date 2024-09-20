package String_DataStructure;

public class Palindrome_String {
	
	public static boolean Palindrome(String str ) {
		str = str.toLowerCase();
		
		
		int n = str.length()-1;
		int left = 0;
		int right = n;
		
		
		
		while(left < right) {
			
			while(left < right && !Character.isLetterOrDigit(str.charAt(left))) {
				left++;
			}
			while(left < right && !Character.isLetterOrDigit(str.charAt(right))) {
				right--;
			}
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println("hello");
		
		String s = "madam";
		boolean result = Palindrome(s);
		System.out.println(result);
		

		String s2 = "A man, a plan, a canal: Panama";
		System.out.println(Palindrome(s2));
		

	}

}
