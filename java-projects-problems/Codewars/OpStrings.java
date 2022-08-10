package Codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OpStrings {
    public static String vertMirror (String string) {
        return Arrays.stream(string.split("\n"))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining("\n"));
    }
    public static String horMirror (String string) {
        List<String> list = Arrays.asList(string.split("\n"));
        Collections.reverse(list);
        return list.stream().collect(Collectors.joining("\n"));
    }
    public static String oper(Function<String,String> operator, String s) {
        return operator.apply(s);
    }
}
