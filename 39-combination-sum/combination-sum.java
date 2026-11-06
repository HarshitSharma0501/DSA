
import java.util.*;

class Solution {
    public void solve(int[] candidates, int target, int index,
                      List<Integer> temp, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (index >= candidates.length || target < 0) {
            return;
        }

        // Include current element (can reuse it)
        temp.add(candidates[index]);
        solve(candidates, target - candidates[index], index, temp, ans);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Exclude current element
        solve(candidates, target, index + 1, temp, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(candidates, target, 0, temp, ans);

        return ans;
    }
}
