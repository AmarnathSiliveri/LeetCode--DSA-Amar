import java.util.Scanner;

class Solution {

    public static String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        for (int l = Math.min(len1, len2); l > 0; l--) {
            if (isDivisor(str1, str2, len1, len2, l)) {
                return str1.substring(0, l);
            }
        }
        return "";
    }

  
    public static boolean isDivisor(String str1, String str2, int len1, int len2, int l) {
        if (len1 % l != 0 || len2 % l != 0) {
            return false;
        }

        String candidate = str1.substring(0, l);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < len1 / l; i++) {
            sb1.append(candidate);
        }
        for (int i = 0; i < len2 / l; i++) {
            sb2.append(candidate);
        }

        return sb1.toString().equals(str1) && sb2.toString().equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2 = sc.nextLine();
        System.out.println(gcdOfStrings(str1, str2));
        sc.close();
    }
}
