import java.util.*;
public class Main1{
    public static int vaildNum(char[] s){
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (char c: s){
            System.out.print(c);
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty()|| stack.pop()!=c){
                count++;
            }
        }
        if (!stack.isEmpty()){
            System.out.println(stack.size());
            count += stack.size();
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char[] str = sc.nextLine().toCharArray();
            int ans = Main1.vaildNum(str);
            System.out.println(ans);
        }
    }
}