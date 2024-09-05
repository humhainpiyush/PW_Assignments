public class SubsetProduct {

    public boolean isSubsetProduct(int[] arr, int target) {
        return backtrack(arr, target, 1, 0);
    }

    private boolean backtrack(int[] arr, int target, int product, int index) {
        if (product == target) {
            return true;  // If product matches the target, return true
        }
        if (product > target || index == arr.length) {
            return false;  // If product exceeds target or all elements are processed, return false
        }

        // Choose the current element
        if (backtrack(arr, target, product * arr[index], index + 1)) {
            return true;
        }

        // Skip the current element
        return backtrack(arr, target, product, index + 1);
    }

    public static void main(String[] args) {
        SubsetProduct solution = new SubsetProduct();
        int[] arr = {2, 3, 2, 5, 4};
        int target = 16;
        if (solution.isSubsetProduct(arr, target)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
