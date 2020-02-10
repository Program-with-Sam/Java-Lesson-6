package serialization;

public class Main {
    public static void main(String[] args) {
        // Create an Object
        MyDataClass dataEntry = new MyDataClass("Sam", 23, 0);
        // Output the Object's data to console
        System.out.println(dataEntry.toString());
        // Save the Object
        FileSerializer.writeFile("testOutputs/Sam", dataEntry);

        // Overwrite the old object with new object
        dataEntry = new MyDataClass("Kevin", 25, 45000);
        // Output to prove it has been overwritten
        System.out.println(dataEntry.toString());

        // Overwrite the object by loading in the saved file
        dataEntry = (MyDataClass) FileSerializer.readFile("testOutputs/Sam");
        // Output to prove it is loaded
        System.out.println(dataEntry.toString());
    }
}
