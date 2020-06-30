package ReadNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Largest {

    public static int getResult() throws FileNotFoundException {

        File file = new File("src/dataset_largest.txt");

        int result = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int x = scanner.nextInt();
                if (x > result) {
                    result = x;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found -_-");
        }

        return result;
    }
}
