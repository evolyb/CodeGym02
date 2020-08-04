package Method;
import Entities.*;
import IO.FileManager;
import java.io.IOException;

public class Method {
    private static final String[] LISTDEFINITION = {"noun","verb","adjective"};
    private static boolean isInList(String name){
        for (String str : LISTDEFINITION){
            if (str.equals(name)) return true;
        }
        return false;
    }
    public static void add(WordList myWordList){
        System.out.println("Input your word you want to ADD");
        String word = FileManager.scanner.nextLine();
        if(!myWordList.isExist(word)){
            myWordList.add(new Word(word));
        }
        Word myWord = myWordList.getWord(word);
        Definition newDefinition = creatNewDefinition(myWord);
        newDefinition.add(creatNewMeaning());
    }
    public static void showAllWordList(WordList myWordList){
        myWordList.showAll();
    }

    public static void show(WordList myWordList){
        System.out.println("Input your word you want to SHOW");
        String word = FileManager.scanner.nextLine();
        if (myWordList.isExist(word)){
            System.out.println(myWordList.getWord(word).toString());
        } else {
            System.out.println("Word is not found");
        }
    }
    public static void removeWord(WordList myWordList){
        System.out.println("Input the word you want to delete");
        String word = FileManager.scanner.nextLine();
        if (myWordList.isExist(word)){
            myWordList.remove(word);
            System.out.println(word+" is removed");
        } else {
            System.out.println("Word is not found");
        }
    }
    public static void exportWord(WordList myWordList) throws IOException {
        System.out.println("Input the word you want to export");
        String word = FileManager.scanner.nextLine();
        if (myWordList.isExist(word)){
            FileManager.exportWord(myWordList.getWord(word));
            System.out.println(word+" is exported");
        } else {
            System.out.println("Word is not found");
        }
    }
    public static void save(WordList myWordList) throws IOException {
        FileManager.saveFile(myWordList);
    }

    private static Definition creatNewDefinition(Word word) {
        Definition newDefinition;
        String definition;
        do {
            System.out.println("Input definition you want to add");
            System.out.println("noun,verb,adjective");
            definition = FileManager.scanner.nextLine();
        } while (!isInList(definition));
        if (word.getDefinition(definition) == null) {
            newDefinition = new Definition(definition);
            word.add(newDefinition);
        }
        return word.getDefinition(definition);
    }
    private static Meaning creatNewMeaning() {
        System.out.println("Input your meaning");
        Meaning newMeaning =  new Meaning(FileManager.scanner.nextLine());
        while (true){
            System.out.println("Do you want to add more Example: y/n");
            if (!(FileManager.scanner.nextLine().equals("y"))){
                break;
            }
            System.out.println("Input you example sentence: ");
            String sentence = FileManager.scanner.nextLine();
            System.out.println("What is the meaning of it");
            String meaning = FileManager.scanner.nextLine();
            newMeaning.add(new SentenceExample(sentence,meaning));
        }
        return newMeaning;
    }
}
