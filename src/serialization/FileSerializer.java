package serialization;

import java.io.*;

public class FileSerializer {

    /**
     * Write file takes an object and a filepath and saves the object to said file
     * @param filePath is the location/file
     * @param object is the object to save
     */
    public static void writeFile(String filePath, Object object) {
        try {
            // Create/Open the file using the filePath
            File file = new File(filePath);
            // Create a file output stream
            FileOutputStream outputStream = new FileOutputStream(file);
            // Create an Object output stream using the underlying output stream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // Write the object
            objectOutputStream.writeObject(object);

            // Flush
            objectOutputStream.flush();

            // Close the streams
            objectOutputStream.close();
            outputStream.close();
        }
        catch (Exception e) {

        }
    }

    /**
     * Read file takes a filepath and reads the object in said file
     * @param filePath is the file to load
     * @return the object
     */
    public static Object readFile(String filePath) {
        // Create a null object
        Object myObject = null;
        try {
            // Create the file using the file path
            File file = new File(filePath);
            // Create the input stream
            FileInputStream inputStream = new FileInputStream(file);
            // Create the object input stream using the underlying input stream
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            // Read the object into the dummy variable
            myObject = objectInputStream.readObject();

            // Close the streams
            objectInputStream.close();
            inputStream.close();
        }
        catch (Exception e) {

        }
        // Return the object
        return myObject;
    }


}
