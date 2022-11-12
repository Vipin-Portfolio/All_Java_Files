
public class ThirukuralPojo {
    //using json property and json alias notations.
    // this will allow us to map more than one json property onto the same java field
    //json property used for deserializing and serializing
    //json alias will know the names that are mapped to the java field
    //json alias is used for deserializing
    private String chapterName;
    private String chapterNameEnglish;
    private int chapterNumber;
    private int verseStartNumber;
    private int verseEndNumber;
}

