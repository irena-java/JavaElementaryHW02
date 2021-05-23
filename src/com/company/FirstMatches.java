package com.company;

public class FirstMatches implements StringWoker {
    @Override
    public int execute(String sentence, String word) {
        int shiftSymbol=1;
        int index=sentence.indexOf(word);
        return index+shiftSymbol;
    }
}
