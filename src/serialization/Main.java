package serialization;

public class Main {
    public static void main(String[] args) {
        MyDataClass dataEntry = new MyDataClass("Sam", 23, 0);
        System.out.println(dataEntry.toString());
        FileSerializer.writeFile("testOutputs/Sam", dataEntry);

        dataEntry = new MyDataClass("Kevin", 25, 45000);
        System.out.println(dataEntry.toString());

        dataEntry = (MyDataClass) FileSerializer.readFile("testOutputs/Sam");
        System.out.println(dataEntry.toString());
    }
}
