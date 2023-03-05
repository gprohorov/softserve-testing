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

    public static  String reformatLines(String text) {
        final int  MAX_LENGTH = 60;
         StringBuilder line = new StringBuilder(MAX_LENGTH);
         StringBuilder output = new StringBuilder();
        CharSequence eol = "\n";

        var array = text.trim().split("\\s+");

    for (String word:array) {
        if (line.length() + word.length() > MAX_LENGTH) {

            output.append(line.substring(0, line.length() -1)).append(eol);
            line.setLength(0);
        }
            line.append(word).append(" ");
    }
        return  output.append(line.substring(0, line.length() - 1)).toString();
    }

    public static void main(String[] args) {
      String text =
              """
   Java    was      originally developed
   by    James   Gosling at Sun Microsystems (which
 has since been
acquired by Oracle) and released in 1995
 as a core component of Sun Microsystems' Java platform.
                      """;
      System.out.println(reformatLines(text));
    }





}


