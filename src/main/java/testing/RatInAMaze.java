package testing;
import java.util.*;

public class RatInAMaze {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        solve(mat, ans, new StringBuilder(), 0, 0);
        return ans;
    }

    private void solve(int[][] mat, ArrayList<String> ans, StringBuilder path, int row, int col){
        int n = mat.length;
        if(row == n - 1 && col == n - 1 && mat[row][col] == 1){
            ans.add(path.toString());
            return;
        }

        if(row < 0 || row == n || col < 0 || col == n || mat[row][col] == 0)
            return;

        mat[row][col] = 0;
        path.append("R");
        solve(mat, ans, path, row, col + 1);
        path.setLength(path.length() - 1);

        path.append("D");
        solve(mat, ans, path, row + 1, col);
        path.setLength(path.length() - 1);

        path.append("L");
        solve(mat, ans, path, row, col - 1);
        path.setLength(path.length() - 1);

        path.append("U");
        solve(mat, ans, path, row - 1, col);
        path.setLength(path.length() - 1);
        mat[row][col] = 1;
    }

    public static void main(String[] args) {
        RatInAMaze rat = new RatInAMaze();
        int[][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        for(String s: rat.findPath(mat))
            System.out.println(s);
    }
}
