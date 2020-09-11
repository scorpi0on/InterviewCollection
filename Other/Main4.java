import java.util.*;

public class Main4{
    public static int minPathSum(int[][] grid){
        if (grid.length ==0){
            return 0;
        }
        int[][] dp  = new int[grid.length][grid[0].length];
        
        for( int i=0; i < dp.length; i++){
            for(int j=0; j < dp[i].length; j++){
                if(i == 0 && j != 0){
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                } else if ( j == 0 && i != 0){
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }else if( i ==0 && j== 0){
                    dp[i][j] = 0 + grid[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j]+ grid[i][j],dp[i][j-1]+ grid[i][j]);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
    public static void main(String[] args){
        // int[][] grid = {
        //     {1,3,1},
        //     {1,5,1},
        //     {4,2,1}
        // };
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[4][4];
        while(sc.hasNextInt()){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    grid[i][j] = sc.nextInt();
                }
            }
            System.out.println(minPathSum(grid));
        }
    }
}