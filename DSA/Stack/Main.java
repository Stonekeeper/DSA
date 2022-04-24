import java.util.Stack;
public class Main {
    
    
    //Find next greater element
    // I/P = {1,5,8,4,9} O/P = {5,8,9,9,-1}
    public int[] nextGreater(int[] arr){
        int[] newArray = new int[arr.length];
        Stack<Integer> s1 = new Stack<>();

        for (int i =  arr.length-1 ; i >= 0 ; i--) {

            if(!s1.empty()){
                while(!s1.empty() && s1.peek() <= arr[i] ){
                    s1.pop();
                }
            }
            if(s1.isEmpty()){
                newArray[i] = -1;
            } else {
                newArray[i] = s1.peek();
            }
            s1.push(arr[i]);
        }
        return newArray;
    }

    //Valid Parenthisis
    public boolean isValidParen(String word){
        Stack<Character> s1 = new Stack<>();

        for(char c : word.toCharArray()){
            if(c == '{'  || c == '(' || c == '['){
                s1.push(c);
            } else {
                if(s1.isEmpty()){
                    return false;
                } else {
                    if( (c == ')' && s1.peek() == '(') || 
                    (c == ']' && s1.peek() == '[') || 
                    (c == '}' && s1.peek() == '{') ){
                        s1.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        Main s1 = new Main();
    //    int[] res =  s1.nextGreater(new int[] {4,7,3,4,8,1});
    //    for (int i = 0; i < res.length; i++) {
    //        System.out.print(res[i]);
    //    }

    System.out.println(s1.isValidParen("{([])}"));
    }
}
