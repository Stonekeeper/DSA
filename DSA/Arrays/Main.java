import java.util.*;
public class Main {
    
    public boolean palindrome(String word){
        /*Madam, radar, level, civic, malayalam, racecar*/
        char[] text = word.toCharArray();
        int start = 0, end = word.length()-1;
        
        while(start < end){
            if(text[start] != text[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String reverseString(String word){
        char[] text = word.toCharArray();

        Stack<Character> s1 = new Stack<>();
        for(char c : text){
            s1.push(c);
        }

        for (int i = 0; i < text.length; i++) {
            text[i] = s1.pop();
        }

        return new String(text);
        
    }

    public int[] nextGreater(int[] arr){
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {  
                if(arr[j] > arr[i]){
                    newarr[i] = arr[j];
                    break;
                } else {
                    newarr[i] = -1;
                }
            }
            
        }
        newarr[arr.length-1] = -1;
        return newarr;
    }
    public static void main(String[] args) {
        Main s1 = new Main();
        // boolean res = s1.palindrome("racecar");
        // if(res)
        //     System.out.println("The string is palindrome");
        // else
        //     System.out.println("The string is not palindrome");

        // System.out.println(s1.reverseString("Hello"));
        int [] res = s1.nextGreater(new int[] {7,9,6,5,8,1,10,15});
        for(int i = 0;i < res.length ;i++){
            System.out.print(res[i] + " ");
        }
    }   
}
