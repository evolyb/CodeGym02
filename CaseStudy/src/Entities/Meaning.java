package Entities;

import java.io.Serializable;
import java.util.LinkedList;

public class Meaning implements Serializable {
    private String meaning;
    private LinkedList<SentenceExample> sentenceExamples = new LinkedList<>();
    public Meaning(String meaning){
        this.meaning = meaning;
    }
    public Meaning(String meaning, LinkedList<SentenceExample> sentenceExamples){
        this.meaning = meaning;
        this.sentenceExamples = sentenceExamples;
    }
    public void add(SentenceExample sentenceExample){
        sentenceExamples.add(sentenceExample);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("  - " + meaning + "\r\n");
        for (SentenceExample sentenceExample: sentenceExamples){
            result.append(sentenceExample.toString());
        }
        return result.toString();
    }
}
