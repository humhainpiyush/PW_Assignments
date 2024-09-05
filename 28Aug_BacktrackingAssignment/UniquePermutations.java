import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutations {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // Add a copy of the current permutation
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;  // Skip duplicates
            }
            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, current, used, result);
            current.remove(current.size() - 1);  // Backtrack
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        UniquePermutations solution = new UniquePermutations();
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = solution.permuteUnique(nums);
        
        // Print the unique permutations
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
