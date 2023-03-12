package project_zoll.infra.file_properties;

import project_zoll.infra.file_properties.LanguageFilePath;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

//This function will read text from a file and use it for other tests
    public static String getScannedFile(LanguageFilePath languageFilePath) throws FileNotFoundException {
        File file = new File(languageFilePath.getFilePath());
        Scanner sc = new Scanner(file);

        String text = sc.nextLine();
        System.out.println(text);

        return text;
    }
}



