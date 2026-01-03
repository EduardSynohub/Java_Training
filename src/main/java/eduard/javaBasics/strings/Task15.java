package eduard.javaBasics.strings;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        String str = "Some text for cheking";
        String[] words = {"for"};
        System.out.println(censor(str, words));
    }
    public static StringBuilder censor(String str, String[] words) {
        String[] split = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (split[i].equals(words[j])) {
                    split[i] = split[i].replace(split[i], "****");
                }
            }
            stringBuilder.append(split[i] + " ");
        }
        return stringBuilder;
    }
}
