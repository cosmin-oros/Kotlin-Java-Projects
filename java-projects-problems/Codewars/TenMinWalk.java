package Codewars;

public class TenMinWalk {
    public static boolean isValid(char[] walk){
        if (walk.length!=10) {
            return false;
        }
        int x=0,y=0;
        for (int i=0;i<10;i++) {
            switch (walk[i]) {
                case 'n':
                    y++;
                    break;
                case 'e':
                    x++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x--;
                    break;
            }
        }
        return x==0 && y==0;
    }
}
