import Entities.WordList;
import IO.FileManager;
import Method.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        WordList myWordList = new WordList();
        int caseSelect = -1;
        try {
            WordList myWordList = FileManager.readFile();
            outerLoop:
            while (true){
                System.out.println("1. Add definition of a word");
                System.out.println("2. Show all possible word");
                System.out.println("3. Show a word");
                System.out.println("4. Remove a word");
                System.out.println("5. Export a word");
                System.out.println("0. Exit");
                try{
                    caseSelect = Integer.parseInt(scanner.nextLine());
                }
                catch (Exception e){
                    System.out.println("Not a number");
                }
                switch (caseSelect) {
                    case 1 -> Method.add(myWordList);
                    case 2 -> Method.showAllWordList(myWordList);
                    case 3 -> Method.show(myWordList);
                    case 4 -> Method.removeWord(myWordList);
                    case 5 -> Method.exportWord(myWordList);
                    case 0 -> {Method.save(myWordList); break outerLoop;}
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
