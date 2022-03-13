package Codewars;

public class Evaporator {
    public static int evaporator(double content,double evap_per_day,double threshold){
        int n=0;
        double thresholdContent = threshold*content/100;
        while (content>thresholdContent) {
            n++;
            content-=content*evap_per_day/100;
        }
        return n;
    }
}
