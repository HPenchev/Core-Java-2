package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            words[i] = (String) reverse(words[i]);
            newSentence.append(words[i] + " ");
        }
        
        return newSentence.toString().trim();
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}