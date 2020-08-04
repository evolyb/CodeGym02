package Entities;
import java.io.Serializable;
import java.util.LinkedList;

public class WordList implements Serializable {
    private LinkedList<Word> wordList = new LinkedList<>();

    public void add(Word word){
        wordList.add(word);
    }
    public void remove(String word){
        wordList.remove(getWord(word));
    }
    public boolean isExist(String name){
        for (Word word:wordList){
            if (word.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public Word getWord(String name){
        for (Word word:wordList){
            if (word.getName().equals(name)){
                return word;
            }
        }
        return null;
    }
    public void showAll(){
        for (Word word: wordList){
            System.out.println(word.getName());
        }
    }
}
