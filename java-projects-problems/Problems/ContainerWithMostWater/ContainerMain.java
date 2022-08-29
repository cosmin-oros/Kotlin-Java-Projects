package Problems.ContainerWithMostWater;

public class ContainerMain {
    public static void main(String[] args){
        ContainerSol sol = new ContainerSol();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        System.out.println(sol.maxArea(height));
    }
}
