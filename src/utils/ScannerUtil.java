package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerUtil {

    public static Scanner getScannerForFile(final String fileLocation) {

        Scanner scanner = null;
        try {
            File file = new File(fileLocation);
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return scanner;
    }
}
