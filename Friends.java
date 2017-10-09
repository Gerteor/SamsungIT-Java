package pivovarov.vasiliy;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] people = new String[n];
        for (int i = 0; i < n; i++) {
            people[i] = in.next();
        }
        int m = in.nextInt();
        int[][] link = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt(), b = in.nextInt();
            link[a - 1][b - 1] = 1;
            link[b - 1][a - 1] = 1;
        }
        printFriends(people, link);
    }
    static void printFriends(String[] people, int[][] link){
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            System.out.println(i + 1 + ") " + people[i] + " дружит с:");
            count = 0;
            for (int j = 0; j < people.length; j++) {
                if(link[i][j] == 1){
                    count++;
                    System.out.println("    " + (i + 1) + "." + count + ") " + people[j]);
                }
            }
        }
    }

}
