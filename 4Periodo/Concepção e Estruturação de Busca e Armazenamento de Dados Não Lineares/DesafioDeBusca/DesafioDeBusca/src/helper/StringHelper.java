package helper;

public class StringHelper {
    public static boolean vemAntes(String s1, String s2) {
        int result = s1.compareTo(s2);
        return (result < 0); // s1 vem antes de s2
    }

    public static boolean vemDepois(String s1, String s2) {
        int result = s1.compareTo(s2);
        return (result > 0); // s1 vem depois de s2
    }
}
