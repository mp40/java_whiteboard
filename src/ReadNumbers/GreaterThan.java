package ReadNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GreaterThan {

    public static int getResult() throws FileNotFoundException {

        File file = new File("src/dataset_greater_than.txt");

        int result = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int x = scanner.nextInt();
                if (x >= 9999) {
                    result += 1;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found -_-");
        }

        return result;
    }
}
