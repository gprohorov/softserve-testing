package edu.pro;

public class MyUtils {

    public static boolean verifyBrackets(String text) {
        CharSequence off1 = "\\[";
        CharSequence off2 = "\\]";
        CharSequence off3 = "\\(";
        CharSequence off4 = "\\)";
        CharSequence off5 = "\\{";
        CharSequence off6 = "\\}";
        CharSequence to = "";

        String result = text
                .replace(off1, to)
                .replace(off2, to)
                .replace(off3, to)
                .replace(off4, to)
                .replace(off5, to)
                .replace(off6, to);

        CharSequence br1 = "{}";
        CharSequence br2 = "[]";
        CharSequence br3 = "()";


    for (int i = 0; i <= result.length()/2; i++) {
       result = result
               .replace(br1, to)
               .replace(br2, to)
               .replace(br3, to);
    }
        return result.isEmpty();
    }

    public static void main(String[] args) {
    System.out.println(verifyBrackets("{([])}"));
    }
}
