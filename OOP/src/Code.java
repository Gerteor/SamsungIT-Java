import java.awt.*;

public class Code {
    public static void main(String[] args) {

        Cat Alex = new Cat("Alex", "foo", 4, 60, Color.orange);
        Cat Felix = new Cat("Maxx", "bar", 4, 55, Color.white);

        Alex.get();
        Felix.get();

        System.out.println(catFight(Alex, Felix));
    }

    private static String catFight(Cat Alex, Cat Felix) {

        if (Alex.weight > Felix.weight)
            return Alex.name;
        else if (Felix.weight > Alex.weight)
            return Felix.name;
        else {
            if (Alex.age < Felix.age && Alex.age >= 4)
                return Alex.name;
            else return Felix.name;
        }
    }
}
