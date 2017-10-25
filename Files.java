/***
 * Задача написать программу, которая выводит содержимое файла
 * Автор: Василий Пивоваров
 * Дата: 15.10.17
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите путь к файлу");
            String path = in.nextLine();

            File openFile = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(openFile));
            String lines = null;

            while ((lines = reader.readLine()) != null) {
                System.out.println(lines);
            }
            reader.close();
            openFile.deleteOnExit();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
