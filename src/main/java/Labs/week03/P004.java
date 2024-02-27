package Labs.week03;

import java.io.ObjectStreamClass;
import java.util.*;

public class P004 {
    public static void main(String[] args) {
//        String paragraph = "This handout will help you understand how paragraphs are formed, how to develop stronger paragraphs, and how to completely and clearly express your ideas.";
        String paragraph = "Paragraphs are the building blocks of papers. It controls what happens in the rest of the paragraph.";
        String[] tokens = tokenize(paragraph.toLowerCase(), ' ');
        P003.sort(tokens);
        tokens = removeAdjDuplicates(tokens);
        System.out.println(Arrays.toString(tokens));
    }

    static String[] tokenize(String p, char delimiter){
        /* count words */
        int cw = 1;
        for(char i : p.toCharArray()){
            if(i == delimiter) cw++;
        }
        String[] tokens = new String[cw];
        int i = 0, j, k = 0;
        while(k < cw){
            j = p.indexOf(delimiter, i);
            String token = j == -1 ? p.substring(i) : p.substring(i, j);
            tokens[k++] = (token.charAt(token.length() - 1) == '.' || token.charAt(token.length() - 1) == ',') ? token.substring(0, token.length() - 1) : token;
            i = j + 1;
        }
        return tokens;
    }

    static String[] removeAdjDuplicates(String[] tokens) {
        /* count uniques */
        int c = 1;
        for(int i = 1; i < tokens.length; i++){
            if(Objects.equals(tokens[i], tokens[i - 1])){
                continue;
            }
            c++;
        }
        String[] uniqueTokens = new String[c];
        int k = 0;
        uniqueTokens[k++] = tokens[0];
        for(int i = 1; i < tokens.length; i++){
            if(Objects.equals(tokens[i], tokens[i - 1])){
                continue;
            }
            uniqueTokens[k++] = tokens[i];
        }
        return uniqueTokens;
    }
}
