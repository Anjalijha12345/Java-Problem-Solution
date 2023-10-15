public class Rat_in_Maze {
    private static final int OPEN = 1;  // Indicates an open cell in the maze
    private static final int PATH = 2;  // Indicates a cell in the solution path
    private int[][] maze;  // The maze itself
    private int[][] solution;  // The solution path

    public Rat_in_Maze(int[][] maze) {
        this.maze = maze;  // Initialize the maze
        this.solution = new int[maze.length][maze[0].length];  // Initialize the solution grid
    }

    public boolean solve() {
        if (findPath(0, 0)) {
            printSolution();  // If a solution is found, print it
            return true;
        } else {
            System.out.println("No solution exists.");  // If no solution is found, print a message
            return false;
        }
    }

    private boolean findPath(int x, int y) {
        // Check if we've reached the destination
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            solution[x][y] = PATH;  // Mark the destination cell as part of the solution
            return true;
        }

        if (isSafe(x, y)) {
            solution[x][y] = PATH;  // Mark the current cell as part of the solution

            // Try moving forward in the X direction
            if (findPath(x + 1, y)) {
                return true;  // If this path leads to the solution, return true
            }

            // Try moving down in the Y direction
            if (findPath(x, y + 1)) {
                return true;  // If this path leads to the solution, return true
            }

            // If no direction leads to a solution, backtrack and mark the current cell as not part of the solution
            solution[x][y] = 0;
        }

        return false;  // If no path leads to the solution, return false
    }

    private boolean isSafe(int x, int y) {
        // Check if the cell is within the bounds of the maze and is an open cell (not a wall)
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == OPEN;
    }

    private void printSolution() {
        // Print the solution grid
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        Rat_in_Maze rat = new Rat_in_Maze(maze);  // Create an instance of Rat_in_Maze with the maze
        rat.solve();  // Solve the maze
    }
}
