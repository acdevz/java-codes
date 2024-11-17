package stringMatching;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
//        String text = "AABAACAADAABAABA";
//        String pattern = "AADA";
        System.out.println(Arrays.toString(lps("cacacabc")));
//        System.out.println(kmp(text, pattern));
    }

    private static int[] lps(String pattern){
        int m = pattern.length();
        int[] lps = new int[m];
        int prev = 0;
        int i = 1;
        while(i < m){
            if (pattern.charAt(i) == pattern.charAt(prev)){
                prev++;
                lps[i] = prev;
                i++;
            }else{
                if (prev == 0){
                    lps[i] = 0;
                    i++;
                }else{
                    prev = lps[prev - 1];
                }
            }
        }
        return lps;
    }

    static int kmp(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        int[] lps = lps(pattern);
        int i = 0;
        int j = 0;
        while (i < n){
            if (text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            if (j == m){
                return i - j;
            }else if (i < n && text.charAt(i) != pattern.charAt(j)){
                if (j == 0){
                    i++;
                }else{
                    j = lps[j - 1];
                }
            }
        }
        return -1;
    }
}
