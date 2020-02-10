package serialization;

import java.io.Serializable;

public class MyDataClass implements Serializable {

    // Used for deserialization, ensures that the right class is being loaded for this object
    private static final long serialVersionUID = 1L;

    // Some dummy variables that we can use to prove Serialization is working
    String name;
    int age;
    int income;

    // Constructor sets the dummy variables
    MyDataClass(String n, int a, int i) {
        this.name = n;
        this.age = a;
        this.income = i;
    }

    // A toString function to output the variables
    public String toString() {
        return name + " is " + age + " years old and has an income of " + income + " per year";
    }
}
