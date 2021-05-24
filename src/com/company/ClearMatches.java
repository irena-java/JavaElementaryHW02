package com.company;

public class ClearMatches extends CountMatches {

    @Override
    public int execute(String sentence, String word) {
        int count = super.execute(sentence, word);
        return sentence.length() - count * word.length();
    }
}
