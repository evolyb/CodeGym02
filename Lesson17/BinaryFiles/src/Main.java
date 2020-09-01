import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        File file = new File("output.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        BufferedOutputStream myFile = new BufferedOutputStream(fileOutputStream);
//        String str = "Hello everybody";
//        String str2 = "My name is Haha";
//        try {
//            myFile.write(str.getBytes());
//            myFile.write(str2.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            myFile.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            File file2 = new File("output.txt");
            BufferedInputStream myReader = new BufferedInputStream(new FileInputStream(file2));
            byte[] line = new byte[8];
            while (myReader.read(line)!= -1){
                System.out.println(Arrays.toString(line));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
