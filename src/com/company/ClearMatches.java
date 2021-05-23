package com.company;

public class ClearMatches extends CountMatches  {

    @Override
    public int execute(String sentence, String word) {
    int count= super.execute(sentence, word);
    int lengthClear=sentence.length()-count*word.length();
    return lengthClear;
    }
}
