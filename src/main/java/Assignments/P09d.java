package Assignments;
import java.util.*;

public class P09d {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
            new Job('a', 2, 100),
            new Job('b', 1, 50),
            new Job('c', 2, 200),
            new Job('d', 1, 25),
            new Job('e', 3, 300)
        );
        JobSequencing j = new JobSequencing();
        j.jobSequencing(jobs);
    }
}

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

class JobSequencing {
    void jobSequencing(List<Job> jobs) {
        jobs.sort((a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        boolean[] slot = new boolean[maxDeadline];
        char[] sequence = new char[maxDeadline];
        int totalProfit = 0;

        // Iterate through jobs and assign them to slots if possible
        for (Job job : jobs) {
            for (int i = job.deadline - 1; i >= 0; i--) {
                if (!slot[i]) {
                    slot[i] = true;
                    sequence[i] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Print the sequence and total profit
        System.out.println("Sequence of jobs:");
        for (char jobId : sequence) {
            if (jobId != '\u0000') {
                System.out.print(jobId + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }
}

