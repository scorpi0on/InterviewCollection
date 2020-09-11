import java.util.*;
public class Main2{
    public static double function(double A, double B, double x){
        return A*x*x + x + B;
    }
    public static double calArea(double[] params){
        double area = 0;
        double A = params[0], B = params[1], C = 0, D = 0;
        if( params[2] < params[3]){
             C = params[2];
             D = params[3];
        }else{
             C = params[3];
             D = params[2];
        }
        
        double step = 0.000000001;
        for (double i = 0; C + step * i < D; i++) {
            area += step* function(A, B, C+step*i);
        }
        return area;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int num = Integer.parseInt(sc.nextLine());

            String[] str = sc.nextLine().split(" ");
            double[] params= new double[str.length];
            for(int i = 0; i < num; i++){
                params[i] = Double.parseDouble(str[i]);
            }

            double ans = Main2.calArea(params);
            System.out.print(ans);

    }

}