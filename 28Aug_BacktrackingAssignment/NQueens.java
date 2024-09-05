public class NQueens {

    public int totalNQueens(int n) {
        int[] count = {0};
        boolean[] cols = new boolean[n];  // Track columns
        boolean[] diag1 = new boolean[2 * n];  // Track main diagonals
        boolean[] diag2 = new boolean[2 * n];  // Track anti-diagonals
        backtrack(n, 0, cols, diag1, diag2, count);
        return count[0];
    }

    private void backtrack(int n, int row, boolean[] cols, boolean[] diag1, boolean[] diag2, int[] count) {
        if (row == n) {
            count[0]++;  // If all queens are placed, increment the solution count
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;  // Main diagonal index
            int d2 = row + col;      // Anti-diagonal index
            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;  // If placing queen here attacks another, skip
            }

            // Place the queen
            cols[col] = diag1[d1] = diag2[d2] = true;

            // Recur to place queens in the next row
            backtrack(n, row + 1, cols, diag1, diag2, count);

            // Backtrack (remove the queen)
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    public static void main(String[] args) {
        NQueens solution = new NQueens();
        int n = 4;
        System.out.println("Number of distinct solutions for " + n + "-queens: " + solution.totalNQueens(n));  // Output: 2
        
        n = 1;
        System.out.println("Number of distinct solutions for " + n + "-queens: " + solution.totalNQueens(n));  // Output: 1
    }
}
