package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountMatches implements StringWoker {
    @Override
    public int execute(String sentence, String word) {
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(sentence);
        int countMatches = 0;
        while (matcher.find()) {
            countMatches++;
        }
        return countMatches;
    }
}
