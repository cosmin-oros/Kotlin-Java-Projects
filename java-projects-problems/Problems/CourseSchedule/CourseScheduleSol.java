package Problems.CourseSchedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class CourseScheduleSol {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<Integer>());
        int[] indeg = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            adj.get(u).add(v);
            indeg[v]++;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                q.add(i);
                indeg[i]--;
            }
        }
        while (!q.isEmpty()) {
            int curr = q.poll();
            count++;
            for (int i = 0; i < adj.get(curr).size(); i++) {
                int node = adj.get(curr).get(i);
                indeg[node]--;
                if (indeg[node] == 0) {
                    q.add(node);
                }
            }
        }
        return count == numCourses;
    }
}
