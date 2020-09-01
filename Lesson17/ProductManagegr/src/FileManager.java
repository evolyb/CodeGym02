import java.io.*;

public  class FileManager {
    public static void saveProduct(ProductManagement P, String path) throws IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream myWriter = new ObjectOutputStream(fileOutputStream);
        myWriter.writeObject(P);
        myWriter.close();
    }
    public static ProductManagement readProduct(String path) throws IOException, ClassNotFoundException {
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream myReader = new ObjectInputStream(fileInputStream);
        ProductManagement result = (ProductManagement) myReader.readObject();
        myReader.close();
        return result;
    }
}
