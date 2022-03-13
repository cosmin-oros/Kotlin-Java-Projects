package Codewars;

public class JadenCase {
    public static String toJadenCase(String phrase){
        if (phrase==null || phrase.equals("")) {
            return null;
        }
        char[] array = phrase.toCharArray();
        for (int i=0;i<array.length;i++) {
            if(i==0||array[i]==' '){
                array[i]=Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }
}
