package Codewars;

public class IsAscenOrder {
    public static boolean isAscOrder(int[] arr){
        for (int i=1;i< arr.length;i++) {
            if (arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
