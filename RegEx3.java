package com.sanya.University;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    private static final String text = "hello my friend be happy please";
    public static final String test_word_false = "banana";
    public static final String test_word_true = "apple";

    public static boolean isTwo (String txt) {
        boolean flag = false;
        Pattern twos = Pattern.compile("([a-z])\1");
        Matcher mat = twos.matcher(txt);
        while (mat.find()) {
            flag = true;
        }
        return flag;
    }

    public static StringBuilder deletion () {
        StringBuilder txt = new StringBuilder("");
        String[] A = text.split(" ");
        for (int i = 0; i < A.length; i++) {
            if (isTwo(A[i]))
                txt.append(A[i]).append(" ");
        }
        return txt;
    }
}
