import java.util.Scanner;

public class Main5 {

    public static String employeeRename(String[] name){
        int len = name.length;
        String result = "unkown name";
        for (String string : name) {
            for(char ch : string.toCharArray()){
                if(!Character.isLowerCase(ch) || !Character.isUpperCase(ch)){
                    return result;
                }else{
                    continue;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++){
            char str = name[i].charAt(0);
            sb.append(str);
        }
        result = sb.toString().toLowerCase();

        return result;
    }

    public static void main(String[] args) {
        //zhou Jie LUN
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] name = sc.nextLine().split(" ");
            System.out.println(employeeRename(name));
        }
    }
    
}
