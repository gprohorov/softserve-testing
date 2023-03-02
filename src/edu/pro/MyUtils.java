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
        if ( ( text.length() <= MAX_LENGTH ) ) {
            return text;
        }

        CharSequence endOfLine = System.lineSeparator();
        text = text.replace(endOfLine," ");
        var array = text.split(" +");
        text = "";
        String line = "";

    for (int i = 0; i < array.length; i++) {
        if (line.length() + array[i].length() < MAX_LENGTH) {
            line += array[i] +  " ";
        } else {
            line += endOfLine;
            text += line;
            line = array[i] + " ";
        }
    }
        return  text + line;
    }
    public static void main(String[] args) {
    System.out.println(verifyBrackets("{([])}"));
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
