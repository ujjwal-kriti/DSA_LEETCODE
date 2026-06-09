class Solution {
    void backtrack(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result)
 {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            current.add(candidates[i]);
            // same i because we can reuse the number
            backtrack(i+1, candidates, target - candidates[i],
            current, result);
            current.remove(current.size() - 1);
        }
 }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, candidates, target, current, result);
        return result;
    }
}