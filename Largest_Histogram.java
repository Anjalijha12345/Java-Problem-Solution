import java.util.Stack;

public class Histogram {

    public int largestRectangleArea(int[] heights) {
        // If the histogram is empty, return 0
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            // While the current bar is shorter than the bar at the top of the stack
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()]; // Height of the bar
                // Width of the rectangle. If stack is empty, use current index, otherwise, difference of indices
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i); // Push current bar's index to the stack
        }

        // Calculate remaining areas for the bars in the stack
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? heights.length : heights.length - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(histogram.largestRectangleArea(heights)); // Expected output: 10
    }
}
