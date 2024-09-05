import java.util.Arrays;

public class SubsetPartition {

    public boolean canPartitionKSubsets(int[] arr, int k) {
        int sum = Arrays.stream(arr).sum();
        if (sum % k != 0) {
            return false;  // If total sum is not divisible by k, it's not possible to partition
        }
        int targetSum = sum / k;
        boolean[] used = new boolean[arr.length];
        return backtrack(arr, used, k, 0, 0, targetSum);
    }

    private boolean backtrack(int[] arr, boolean[] used, int k, int startIndex, int currentSum, int targetSum) {
        if (k == 1) {
            return true;  // If only one subset left, no need to check, it's guaranteed to be valid
        }
        if (currentSum == targetSum) {
            return backtrack(arr, used, k - 1, 0, 0, targetSum);  // Move to next subset
        }

        for (int i = startIndex; i < arr.length; i++) {
            if (!used[i] && currentSum + arr[i] <= targetSum) {
                used[i] = true;
                if (backtrack(arr, used, k, i + 1, currentSum + arr[i], targetSum)) {
                    return true;
                }
                used[i] = false;  // Backtrack
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SubsetPartition solution = new SubsetPartition();
        int[] arr = {1, 3, 2, 2};
        int k = 2;
        System.out.println(solution.canPartitionKSubsets(arr, k));  // Output: true
    }
}
