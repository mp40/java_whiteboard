package CountNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Numbers {

    public static int getResult() throws FileNotFoundException {
        System.out.println("jjj");
        File file = new File("src/dataset.txt");

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
