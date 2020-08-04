package Entities;

import java.io.Serializable;
import java.util.LinkedList;

public class Word implements Serializable {
    private final String name;
    private LinkedList<Definition> definitions;
    public Word(String name){
        this.name = name;
        definitions = new LinkedList<>();
    }
    public void add(Definition definition){
        definitions.add(definition);
    }
    public String getName() {
        return name;
    }
    public Definition getDefinition(String name){
        for (Definition definition: definitions){
            if (definition.getType().equals(name)){
                return definition;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("@ " + name + "\r\n");
        for (Definition definition: definitions){
            result.append(definition.toString());
        }
        return result.toString();
    }
}
