package endx;

public class EndX {
    public static String endX(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == 'x') return endX(str.substring(1)) + str.charAt(0);
        return str.charAt(0) + endX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(endx.EndX.endX("xxre")); // rexx
    }
}
