//万万没想到之聪明的编辑

//三个字母 AAA -> AA helllo -> hello
//两对一样的字母 AABB -> AAB : helloo -> hello
//字符串从右往左 AABBCC->AABCC
//自动校对器
import java.util.*;
 public class DuplicatedWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //doSomething
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
               String str = sc.next();
               String ans = duplicatedWord(str);
               System.out.println(ans);
            }
        }
    }
    
    public static String duplicatedWord(String s){
           StringBuffer sb=new StringBuffer();
           for(int j=0;j<s.length();j++){
               if(sb.length()<2){
                   sb.append(s.charAt(j));
                   continue;
               }
               if(sb.length()>=2){
                   //aaa
                   if(s.charAt(j)==sb.charAt(sb.length()-1) &&s.charAt(j)==sb.charAt(sb.length()-2))
                       continue;
                    
               }
               if(sb.length()>=3){
                   //aabb
                   if(s.charAt(j)==sb.charAt(sb.length()-1) &&sb.charAt(sb.length()-3)==sb.charAt(sb.length()-2))
                         continue;
               }
               sb.append(s.charAt(j));
           }
        return sb.toString();
    }
}