import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int groups = sc.nextInt();
            for (int i = 0; i < groups; i++) {
                int n = sc.nextInt();
                int[] nums = new int[n];
                for (int j = 0; j < n; j++) {
                    nums[j] = sc.nextInt();
                }
                System.out.println(Main3.theLength(nums));
            }
        }
    }

    private static int theLength(int[] nums) {
        // 5 4 3 2 1 2 3 4 5
        boolean flag = true;
        int res = 0, up = 0, down = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < nums.length; i++) {
            // reset
            if ((up > 0 && nums[i - 1] > nums[i]) || nums[i - 1] == nums[i]) {
                up = 0;
            }

            if (nums[i - 1] < nums[i]) {
                while (!stack.isEmpty() && nums[stack.peek()] != nums[i] && flag) {
                    stack.pop();
                    down--;
                }
                flag = false;
                // 4
                up++;
            }

            if (nums[i - 1] > nums[i]) {
                if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                    stack.push(i);
                    // 5
                    down++;
                }
            }

            if (up > 0 && down > 0 && up + down + 1 > res) {
                res = up + down + 1;
            }

        }
        return res;
    }
}
/*
3
9
5 4 3 2 1 2 3 4 5
5
1 2 3 4 5
14
87 70 17 12 14 86 61 51 12 90 69 89 4 65
*/