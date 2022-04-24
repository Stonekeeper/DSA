import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problems {
    
    public int longestSubString(String str){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0, maxLength = 0;

        for(int end = 0; end < str.length();end++){
            char rightChar = str.charAt(end);
            if(map.containsKey(rightChar)){
                start = Math.max(start, end-start+1);
            }
            map.put(rightChar,end);
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }

    public String removeVowels(String str){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        StringBuilder sb = new StringBuilder();
        char[] letters = str.toCharArray();
        for(char c : letters){
            if(!vowels.contains(c)){
                sb = sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problems p = new Problems();
        System.out.println("The longest Sub String without repetion is " + p.longestSubString("Hello"));
        System.out.println("String after removing vowels " + p.removeVowels("Hello"));

    }
}
