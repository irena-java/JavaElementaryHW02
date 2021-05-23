package com.company;

public class CountMatches implements StringWoker {
    @Override
    public int execute(String sentence, String word) {
        int currentPosition = 0;
        int indexMatches;
        int count = 0;
        while (currentPosition < sentence.length()) {
            indexMatches = sentence.indexOf(word, currentPosition);
            if (indexMatches == -1) {
                break;
            } else {
                count++;
                currentPosition = indexMatches + word.length();
            }
        }
        return count;
    }
}
