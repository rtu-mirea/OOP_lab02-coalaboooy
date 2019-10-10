package com.sanya.University;

public class String1 {
    private static final String text = new String("int bin = 1011; " +
            "long oct = 75; " +
            "double dec = 4096; " +
            "int hex = 1616;");

    public static String getIdentifiers() {
        String[] A = text.split(" ");
        String result = "";
        for (int i = 0; i < A.length; i++) {
           if (A[i].equals("int") || A[i].equals("double") || A[i].equals("long"))
               result = result + A[i + 1] + " ";
        }
        return result;
    }

    public static String getEquals() {
        String[] A = text.split(" ");
        String result = "";
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals("="))
                result = result + A[i] + " ";
        }
        return result;
    }

    public static String getMax() {
        String[] A = text.split(" ");
        String result = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals("=")) {
                if (Integer.parseInt(A[i+1].substring(0, A[i+1].length()-1)) > max) {
                    max = Integer.parseInt(A[i + 1].substring(0, A[i+1].length()-1));
                    result = A[i-2];
                }
            }
        }
        return result;
    }
}