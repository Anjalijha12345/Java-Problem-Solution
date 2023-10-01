import java.util.ArrayList;
import java.util.List;

public class NQueens {

    /**
     * Solves the N-Queens problem.
     *
     * @param n The size of the chessboard.
     * @return A list of possible solutions.
     */
    public List<List<String>> solveNQueens(int n) {
        // Initialize the board with '.' indicating empty cells
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }

    /**
     * Uses Depth-First Search to recursively place queens on the board.
     *
     * @param board     The current board state.
     * @param colIndex  The current column index.
     * @param res       The results list to store valid board states.
     */
    private void dfs(char[][] board, int colIndex, List<List<String>> res) {
        // If the end of the board is reached, add the board state to results
        if (colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        // Try placing a queen in each row of the current column
        for (int i = 0; i < board.length; i++) {
            if (validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';  // Place the queen
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';  // Revert - backtrack
            }
        }
    }

    /**
     * Validates if placing a queen on the board at the given position is safe.
     *
     * @param board The current board state.
     * @param x     The row index.
     * @param y     The column index.
     * @return True if safe, otherwise false.
     */
    private boolean validate(char[][] board, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < y; j++) {
                // Check if there's any other queen in the same row, or diagonals
                if (board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Converts the board state to a list of strings.
     *
     * @param board The current board state.
     * @return A list representing the board state.
     */
    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        int n = 4;
        List<List<String>> solutions = nQueens.solveNQueens(n);

        // Print the solutions
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
