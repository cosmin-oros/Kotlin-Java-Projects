package Codewars;

import java.util.Locale;

public class CamelCase {
    public static String solution(String str){
        if (str.isEmpty()) {
            return str;
        }
        String[] aux = str.split(" ");
        for (int i=0;i<aux.length;i++) {
            try {
                aux[i]=aux[i].substring(0,1).toUpperCase()+aux[i].substring(1,aux[i].length());
            }
            catch (StringIndexOutOfBoundsException e){

            }
        }

        return String.join("",aux);
    }
}
