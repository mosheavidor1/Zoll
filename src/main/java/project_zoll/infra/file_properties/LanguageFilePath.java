package project_zoll.infra.file_properties;

public enum LanguageFilePath {

    HEBREW("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Zoll\\src\\main\\java\\files_to_translate\\Hebrew.txt"),
    JAPANESE("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Zoll\\src\\main\\java\\files_to_translate\\Japanese.txt"),
    GREEK("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Zoll\\src\\main\\java\\files_to_translate\\Greek.txt"),
    FRENCH("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Zoll\\src\\main\\java\\files_to_translate\\French.txt"),
    DUTCH("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Zoll\\src\\main\\java\\files_to_translate\\Dutch.txt");


    private String filePath;

    LanguageFilePath(String filePath) {

        this.filePath = filePath;
    }

    public String getFilePath() {


        return filePath;
    }


}






