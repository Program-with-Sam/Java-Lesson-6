package serialization;

import java.io.*;

public class FileSerializer {

    public static void writeFile(String filePath, Object object) {
        try {
            File file = new File(filePath);
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(object);

            objectOutputStream.flush();

            objectOutputStream.close();
            outputStream.close();
        }
        catch (Exception e) {

        }
    }

    public static Object readFile(String filePath) {
        Object myObject = null;
        try {
            File file = new File(filePath);
            FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            myObject = objectInputStream.readObject();

            objectInputStream.close();
            inputStream.close();
        }
        catch (Exception e) {

        }
        return myObject;
    }


}
