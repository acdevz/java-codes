package Labs.week03;

import java.io.ObjectStreamClass;
import java.util.*;

public class P004 {
    public static void main(String[] args) {
//        String paragraph = "This handout will help you understand how paragraphs are formed, how to develop stronger paragraphs, and how to completely and clearly express your ideas.";
        String paragraph = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as a group of sentences or a single sentence that forms a unit. Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the controlling idea, because it controls what happens in the rest of the paragraph.";
        String[] tokens = tokenize(paragraph.toLowerCase());
        P003.sort(tokens);
        tokens = removeAdjDuplicates(tokens);
        System.out.println(Arrays.toString(tokens));
    }

    private static String[] tokenize(String p){
        /* count words */
        int cw = 1;
        for(char i : p.toCharArray()){
            if(i == ' ') cw++;
        }
        String[] tokens = new String[cw];
        int i = 0, j, k = 0;
        while(k < cw){
            j = p.indexOf(' ', i);
            String token = j == -1 ? p.substring(i) : p.substring(i, j);
            tokens[k++] = (token.charAt(token.length() - 1) == '.' || token.charAt(token.length() - 1) == ',') ? token.substring(0, token.length() - 1) : token;
            i = j + 1;
        }
        return tokens;
    }

    private static String[] removeAdjDuplicates(String[] tokens) {
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
