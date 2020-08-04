package Entities;

import java.io.Serializable;
import java.util.LinkedList;

public class Definition implements Serializable {
    private final String type;
    private LinkedList<Meaning> meanings = new LinkedList<>();
    public Definition(String type){
        this.type = type;
    }
    public void add(Meaning meaning){
        meanings.add(meaning);
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("* " + type + "\r\n");
        for (Meaning meaning: meanings){
            result.append(meaning.toString());
        }
        return result.toString();
    }
}
