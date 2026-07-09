import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = numRows;

        for (int i = 0; i < n; i++) {

            List<Integer> row = new ArrayList<>();
            int res = 1;

            row.add(res);

            for (int j = 1; j <= i; j++) {
                res = res * (i - j+1 );
                res = res / j;
                row.add(res);
            }

            ans.add(row);
        }

        return ans;
    }
}