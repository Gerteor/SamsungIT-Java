import java.util.ArrayList;
import java.util.Scanner;

/**
 * Необходимо реализовать метод minDistance таким образом,
 * чтобы он возвращал значение минимального расстояния между
 * двумя пунктами.
 * Данные для тестирования приведены ниже.
 */
public class MinDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] link = new int[n][n];
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            link[a-1][b-1] = c;

        }
        printMatrix(link);

        ArrayList<Integer> list;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < link.length; i++) {
            list = new ArrayList<>();
            for (int j = 0; j < link.length; j++) {
                if (link[i][j] !=0 ){
                    list.add(link[i][j]);
                }
            }
            arr.add(list);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i+1 + ": ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

/*Данные для тестирования
5
5
1 2 8
1 3 6
2 4 9
3 5 5
3 4 9
1 5 (из 1 в 5) результат 11!
 */