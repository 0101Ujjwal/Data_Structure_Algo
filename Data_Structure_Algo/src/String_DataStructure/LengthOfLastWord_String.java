package String_DataStructure;

public class LengthOfLastWord_String {
    
    public static int lengthOfTheLastWord(String s) {
        // Trim whitespace from both ends
        s = s.trim();
        
        int length = 0;
        int i = s.length() - 1;

        // Loop backwards until a space is found
        while (i >= 0 && (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))) {
            length++;
            i--;
        }
        
        return length;             
    }

    public static void main(String[] args) {
        String str = "hello_world"; 
        
        String s = "     a s                 ";
        int length = lengthOfTheLastWord(str);
        System.out.println(length); 
        
        int length1 = lengthOfTheLastWord(s);
        System.out.println(length1);
    }
}
