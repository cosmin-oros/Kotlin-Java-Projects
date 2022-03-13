package Codewars;

public class CountDig {
    public static int nbDig(int n,int d){
        int[] array = new int[n+1];
        int k=0;
        for (int i=0;i<=n;i++) {
            array[i]= (int) Math.pow(i,2);
        }
        for (int i=0;i<=n;i++) {
            while (array[i]>0) {
                if (array[i]%10==d) {
                    k++;
                }
                array[i]/=10;
            }
        }
        return k;
    }
}
