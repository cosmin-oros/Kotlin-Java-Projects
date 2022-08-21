package Problems.CourseSchedule;

/*
Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 */

public class CourseScheduleMain {
    public static void main(String[] args){
        CourseScheduleSol sol = new CourseScheduleSol();
        int numCourses = 2;
        int[][] prereq= new int[2][2];
        prereq[0][0] = 1;
        prereq[0][1] = 0;
        prereq[1][0] = 0;
        prereq[1][1] = 1;
        System.out.println(sol.canFinish(numCourses, prereq));
    }
}
