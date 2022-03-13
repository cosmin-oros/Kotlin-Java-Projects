package Codewars;


import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines){
        List<String> result = new ArrayList<>(lines.size());
        for (int i=0;i<lines.size();i++) {
            String line =lines.get(i);
            int lineNumber = i+1;
            String lineWithLinesNumbers = String.format("%d: %s",lineNumber,line);
            result.add(lineWithLinesNumbers);
        }
        return result;

    }
}
