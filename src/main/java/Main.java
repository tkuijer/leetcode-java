import com.leetcode.problem_1672.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();
        int[][] example = new int[][]{
                {1, 5},
                {7,3},
                {3,5}
        };

        System.out.print(solver.maximumWealth(example));
    }
}