import java.awt.*;

public class Cat {

    String name, kind;
    int age, weight;
    Color color;

    Cat(String name, String kind, int age, int weight, Color color){
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void get (){
        System.out.println("Name: " + name);
        System.out.println("Kind: " + kind);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println(String.format("Color: " + color));
    }



}
