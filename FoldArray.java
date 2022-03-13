package Codewars;

public class FoldArray {
    public static int[] foldArray(int[] array, int runs)
    {
        int size = array.length;
        int[] newArray = new int[size / 2];
        while(runs!=0) {
            for (int i = 0; i < size / 2; i++) {
                newArray[i]=array[i]+array[size-1-i];
            }
            size/=2;
            runs--;
            for (int i=0;i<size;i++) {
                array[i]=newArray[i];
            }
        }
        return newArray;

    }
}
