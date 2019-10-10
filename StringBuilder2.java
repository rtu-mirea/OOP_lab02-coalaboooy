package com.sanya.University;

public class StringBuilder2 {
    private static final StringBuilder text = new StringBuilder("int bin = 1011; " +
            "long oct = 75; " +
            "double dec = 4096; " +
            "int hex = 1616;");

    public static StringBuilder deletion () {
        StringBuilder txt = new StringBuilder(text);
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) != '=') {
                txt.deleteCharAt(i);
                i--;
            }
        }
        return txt;
    }

    public static StringBuilder summary () {
        StringBuilder txt = new StringBuilder(text);
        String[] txt_str = txt.toString().split(" ");
        StringBuilder var = new StringBuilder("");
        for (int i = 0; i < txt_str.length; i++) {
            if (txt_str[i].equals("=")) {
                var = new StringBuilder(txt_str[i-1]);
                break;
            }
        }
        var.append(" = ");
        for (int i = 0; i < txt_str.length; i++) {
            if (txt_str[i].equals("=")) {
                var.append(txt_str[i+1], 0, txt_str[i+1].length()-1);
                if (i + 1 != txt_str.length - 1)
                    var.append(" + ");
            }
        }
        txt.append(" ").append(var);
        return txt;
    }

    public static StringBuilder modify () {
        StringBuilder txt = new StringBuilder(text);
        String[] txt_str = txt.toString().split(" ");
        StringBuilder var = new StringBuilder("");
        int yay = 0;
        for (int i = 0; i < txt_str.length; i++) {
            if (txt_str[i].equals("=")) {
                yay = (Integer.parseInt(txt_str[i+1].substring(0, txt_str[i+1].length()-1)))*2;
                var.append(yay);
                break;
            }
        }
        txt.replace(10, 14, var.toString());
        return txt;
    }
}
