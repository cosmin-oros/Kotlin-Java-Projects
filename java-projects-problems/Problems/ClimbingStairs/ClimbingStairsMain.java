package Problems.ClimbingStairs;

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class ClimbingStairsMain {
    public static void main(String args[]){
        ClimbingStairsSol stairs = new ClimbingStairsSol();
        System.out.println(stairs.climbStairs(4));
    }
}
