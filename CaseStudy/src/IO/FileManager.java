package IO;
import Entities.Word;
import Entities.WordList;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    public static Scanner scanner = new Scanner(System.in);
    public static WordList readFile() throws IOException, ClassNotFoundException {
        File file = new File("myWordList.dat");
        ObjectInputStream myReader = new ObjectInputStream(new FileInputStream(file));
        return (WordList) myReader.readObject();
    }
    public static void saveFile(WordList wordList) throws IOException {
        File file = new File("myWordList.dat");
        ObjectOutputStream myWriter = new ObjectOutputStream(new FileOutputStream(file));
        myWriter.writeObject(wordList);
    }
    public static void exportWord(Word word) throws IOException {
        File file = new File("export\\"+word.getName()+".txt");
        PrintWriter myWriter = new PrintWriter(file);
        myWriter.println(word.toString());
        myWriter.close();
    }
}
