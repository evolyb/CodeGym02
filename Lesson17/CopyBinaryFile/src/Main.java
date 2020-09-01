import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.println("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            long startTime = System.currentTimeMillis();
            copyFileUsingStream(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);

            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime + " ms");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        if (!source.exists()){
            System.out.println("File source is not Exist");
            return;
        }
        if (dest.exists()){
            System.out.println("File dest is already Exist");
            return;
        }
        try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
        System.out.println("Copy completed");
    }
}
