package Assignments;

import java.util.*;

public class P09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Activity> activities = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            activities.add(new Activity("A" + (i + 1), in.nextInt(), in.nextInt()));
        }

        activitySelector selectMaxActs = new activitySelector(activities);
        System.out.println(selectMaxActs.ans);
    }
}
/* greedy algorithms */
/* N- activity selection problem */

class Activity {
    int start, finish;
    String key;

    public Activity(String key, int start, int finish) {
        this.key = key;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return String.valueOf(key);
    }
}

class ActivityComparator implements Comparator<Activity>{
    @Override
    public int compare(Activity o1, Activity o2) {
        return Integer.compare(o1.finish, o2.finish);
    }
}

class activitySelector{
    List<Activity> activities;
    List<Activity> ans = new ArrayList<>();

    activitySelector(List<Activity> activities){
        this.activities = activities;
        activities.sort(new ActivityComparator());

        ans.add(activities.get(0));
        int n = activities.size();
        int i = 0;
        for(int m = 1; m < n; m++){
            if(activities.get(m).start >= activities.get(i).finish){
                ans.add(activities.get(m));
            }
            i = m;
        }
    }
}