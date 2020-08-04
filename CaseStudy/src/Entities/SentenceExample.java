package Entities;

import java.io.Serializable;

public class SentenceExample implements Serializable {
    private final String sentence;
    private final String sentenceMeaning;

    public SentenceExample(String sentence, String meaning) {
        this.sentence = sentence;
        this.sentenceMeaning = meaning;
    }

    @Override
    public String toString() {
        return "    = "+sentence+" + "+ sentenceMeaning + "\r\n";
    }
}
