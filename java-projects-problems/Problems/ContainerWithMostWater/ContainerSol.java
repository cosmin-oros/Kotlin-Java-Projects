package Problems.ContainerWithMostWater;

class ContainerSol {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        for (int i = 0; i < n; i++){
            for (int j = n-1; j >= i+1; j--){
                if (height[i] > height[j]){
                    if (height[j]*(j-i) > maxWater){
                        maxWater = height[j]*(j-i);
                    }
                }else{
                    if (height[i]*(j-i) > maxWater){
                        maxWater = height[i]*(j-i);
                    }
                }
            }
        }

        return maxWater;
    }
}
