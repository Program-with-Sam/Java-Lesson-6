package serialization;

import java.io.Serializable;

public class MyDataClass implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    int age;
    int income;

    MyDataClass(String n, int a, int i) {
        this.name = n;
        this.age = a;
        this.income = i;
    }

    public String toString() {
        return name + " is " + age + " years old and has an income of " + income + " per year";
    }
}
