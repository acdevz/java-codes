package Assignments;

public class P11e {
    public static void main(String[] args) {
        // Example times for each workstation on two assembly lines
        int[][] times = {
                {7, 9, 3, 4, 8, 4},
                {8, 5, 6, 4, 5, 7}
        };

        // Transfer costs between the two assembly lines
        int[][] transfers = {
                {0, 2, 1, 3, 4, 3},
                {0, 2, 1, 3, 2, 1}
        };

        // Entry and exit times for the assembly lines
        int[] entryTimes = {2, 4}; // Entry times for Line 1 and Line 2
        int[] exitTimes = {3, 2}; // Exit times for Line 1 and Line 2

        AssemblyLineScheduling.AssemblyLineResult result = AssemblyLineScheduling.schedule(times, transfers, entryTimes, exitTimes); // Get the minimum time and optimal path
        System.out.println("Minimum time to assemble: " + result.minimumTime);
        System.out.println("Optimal path to complete assembly: " + result.optimalPath);
    }
}

class AssemblyLineScheduling {

    // Method to calculate the minimum time to assemble a product given the assembly line data
    public static AssemblyLineResult schedule(int[][] times, int[][] transfers, int[] entryTimes, int[] exitTimes) {
        int n = times[0].length; // Number of stations on each assembly line

        // Two arrays to store the minimum time to reach the end of each line
        int[] line1 = new int[n];
        int[] line2 = new int[n];

        // Initialize the first stations with the entry times and first workstations' times
        line1[0] = entryTimes[0] + times[0][0];
        line2[0] = entryTimes[1] + times[1][0];

        // Fill the arrays with the minimum times for each station
        for (int i = 1; i < n; i++) {
            // Calculate the minimum time to reach the current station in line 1 and line 2
            line1[i] = Math.min(
                    line1[i - 1] + times[0][i], // Continue on line 1
                    line2[i - 1] + transfers[1][i] + times[0][i] // Switch from line 2
            );

            line2[i] = Math.min(
                    line2[i - 1] + times[1][i], // Continue on line 2
                    line1[i - 1] + transfers[0][i] + times[1][i] // Switch from line 1
            );
        }

        // Calculate the minimum time to exit the assembly lines
        int totalLine1 = line1[n - 1] + exitTimes[0];
        int totalLine2 = line2[n - 1] + exitTimes[1];

        // Find the optimal end time and determine the final minimum time
        int minimumTime = Math.min(totalLine1, totalLine2);
        String optimalPath = minimumTime == totalLine1 ? "Line 1" : "Line 2";

        return new AssemblyLineResult(minimumTime, optimalPath); // Return the minimum time and optimal path
    }

    public static class AssemblyLineResult {
        public int minimumTime;
        public String optimalPath;

        public AssemblyLineResult(int minimumTime, String optimalPath) {
            this.minimumTime = minimumTime;
            this.optimalPath = optimalPath;
        }
    }
}
