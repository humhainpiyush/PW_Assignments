import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        backtrack(arr, new ArrayList<>(), used, result);
        return result;
    }

    private void backtrack(int[] arr, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));  // Add a copy of the current permutation
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(arr[i]);
                backtrack(arr, current, used, result);
                current.remove(current.size() - 1);  // Backtrack
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Permutations solution = new Permutations();
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = solution.permute(arr);
        
        // Print the permutations
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
