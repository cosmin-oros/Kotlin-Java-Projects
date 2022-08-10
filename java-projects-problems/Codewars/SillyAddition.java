package Codewars;

public class SillyAddition {
    public static int add(int num1,int num2){
        int finalNr=0;
        int interm;
        int c=0;
        while (num1!=0 && num2!=0) {
            interm=num1%10+num2%10;
            while (interm!=0){
                finalNr+=(interm%10)*(Math.pow(10,c));
                c++;
                interm/=10;
            }
            num1=num1/10;
            num2=num2/10;
        }
        return finalNr;
    }
}
