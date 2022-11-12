package view;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Chapter;
import model.ChapterGroup;
import model.Kural;
import model.Section;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainView {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    static ObjectMapper objectMapper = new ObjectMapper();
    static File thirukralJsonFile = new File("src/resources/thirukural.json");
    static File detailsJsonFile = new File("src/resources/details.json");
    static List<Kural> thirkural;
    static List<Section> thirukuralDetails;

    static {
        try {
            thirkural = objectMapper.readValue(thirukralJsonFile, new TypeReference<List<Kural>>() {
            });
            thirukuralDetails = objectMapper.readValue(detailsJsonFile, new TypeReference<List<Section>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    int tempNumber;
    int sectionNumber;
    int chapterGroupNumber;
    int chapterNumber;
    int verseNumber;
    int start;
    int end;
    String language = "tamil";
    String explanationBy = "mk";
    int menuOption = 0;




    private void startThirukuralApplication() {
        sectionNumber = selectSectionNumber(language);
        chapterGroupNumber = selectChapterGroupNumber(language);
        chapterNumber = selectChapterNumber(language);
        setStartEnd();
        if (isDisplayAllKural(language)) {
            displayAllKural(language);
        } else {
            verseNumber = selectVerseNumber();
            displayKural(verseNumber, language, explanationBy);
        }
        isBackToMenuScreen();
    }

    private void isBackToMenuScreen() {
        System.out.println("Press 1. for back to Main Menu");
        System.out.println("Press 2. for exit");
        tempNumber = scanner.nextInt();
        if (tempNumber == 1) {
            menuScreen(language);
        } else {
            exitingApplication();
        }
    }

    private int selectSectionNumber(String language) {
        for (Section section : thirukuralDetails) {
            if (language.equalsIgnoreCase("english") || language.equalsIgnoreCase("tanglish"))
                System.out.println(section.getSectionNumber() + ". " + section.getSectionNameEnglish());
            else
                System.out.println(section.getSectionNumber() + ". " + section.getSectionName());
        }
        System.out.print("Select Section from Above: ");
        return (scanner.nextInt() - 1);
    }

    private int selectChapterGroupNumber(String language) {
        tempNumber = thirukuralDetails.get(sectionNumber).getChapterGroupList().get(0).getChapterGroupNumber();
        for (ChapterGroup chapterGroup : thirukuralDetails.get(sectionNumber).getChapterGroupList()) {
            if (language.equalsIgnoreCase("english") || language.equalsIgnoreCase("tanglish"))
                System.out.println((chapterGroup.getChapterGroupNumber() - tempNumber + 1) + ". " + chapterGroup.getChapterGroupNameEnglish());
            else
                System.out.println((chapterGroup.getChapterGroupNumber() - tempNumber + 1) + ". " + chapterGroup.getChapterGroupName());
        }
        System.out.print("Select ChapterGroup from Above: ");
        return (scanner.nextInt() - 1);
    }

    private int selectChapterNumber(String language) {
        tempNumber = thirukuralDetails.get(sectionNumber).getChapterGroupList().get(chapterGroupNumber).getChapterList().get(0).getChapterNumber();
        for (Chapter chapter : thirukuralDetails.get(sectionNumber).getChapterGroupList().get(chapterGroupNumber).getChapterList()) {
            if (language.equalsIgnoreCase("english") || language.equalsIgnoreCase("tanglish"))
                System.out.println((chapter.getChapterNumber() - tempNumber + 1) + ". " + chapter.getChapterNameEnglish());
            else
                System.out.println((chapter.getChapterNumber() - tempNumber + 1) + ". " + chapter.getChapterName());
        }
        System.out.print("Select Chapter From Above: ");
        return (scanner.nextInt() - 1);
    }

    private void setStartEnd() {
        start = thirukuralDetails.get(sectionNumber).getChapterGroupList().get(chapterGroupNumber).getChapterList().get(chapterNumber).getVerseStartNumber() - 1;
        end = thirukuralDetails.get(sectionNumber).getChapterGroupList().get(chapterGroupNumber).getChapterList().get(chapterNumber).getVerseEndNumber();

    }

    private int selectVerseNumber() {
        System.out.print("Select verse from 1 to 10: ");
        return (scanner.nextInt() - 1);
    }

    private void displayAllKural(String language) {
        for (int i = start; i < end; i++) {
            switch (language.toLowerCase()) {
                case "english" -> displayEnglishKural(i);
                case "tanglish" -> displayTanglishKural(i);
                default -> displayTamilKural(i);
            }
        }
    }

    private void displayKural(int indexNumber, String language, String _whoseExplanantion) {
        switch (language.toLowerCase()) {
            case "english":
                displayEnglishKural(indexNumber);
                displayEnglishKuralMeaning(indexNumber);
                break;
            case "tanglish":
                displayTanglishKural(indexNumber);
                displayEnglishKuralMeaning(indexNumber);
                break;
            default:
                displayTamilKural(indexNumber);
                displayTamilKuralMeaning(indexNumber, _whoseExplanantion);
        }
    }

    private boolean isDisplayAllKural(String language) {
        if ("english".equalsIgnoreCase(language)) {
            System.out.println("Press 1. For Displaying All Verse");
            System.out.println("Press 2. For Displaying a Specific Verse");
        } else {
            System.out.println("அனைத்து குறளையும் காட்ட 1. ஐ அழுத்தவும்");
            System.out.println("குறிப்பிட்ட குறளை காட்ட 2. ஐ அழுத்தவும்");
        }
        return (scanner.nextInt() == 1);
    }

    private void displayTamilKural(int indexNumber) {
        System.out.println(thirkural.get(indexNumber).getNumber() + ". " + thirkural.get(indexNumber).getLine1());
        System.out.println("   " + thirkural.get(indexNumber).getLine2());
        System.out.println();
    }

    private void displayTanglishKural(int indexNumber) {
        System.out.println(thirkural.get(indexNumber).getNumber() + ". " + thirkural.get(indexNumber).getLineEnglish1());
        System.out.println("    " + thirkural.get(indexNumber).getLineEnglish2());
        System.out.println();
    }

    private void displayEnglishKural(int indexNumber) {
        System.out.println(thirkural.get(indexNumber).getNumber() + ". " + thirkural.get(indexNumber).getTranslation());
        System.out.println();
    }

    private void displayEnglishKuralMeaning(int indexNumber) {
        System.out.println("Explanation: " + thirkural.get(indexNumber).getExplanation());
        System.out.println();
    }

    private void displayTamilKuralMeaning(int indexNumber, String whoseExplanation) {
        switch (whoseExplanation.toLowerCase()) {
            case "mv" -> System.out.println("விளக்கம்: " + thirkural.get(indexNumber).getMv());
            case "sp" -> System.out.println("விளக்கம்: " + thirkural.get(indexNumber).getSp());
            default -> System.out.println("விளக்கம்: " + thirkural.get(indexNumber).getMk());
        }
    }

    private void menuScreen(String language) {
        if ("english".equalsIgnoreCase(language)) {
            System.out.println("Welecome to Thirukrual Application by Davidson");
            System.out.println();
            System.out.println("Daily Kural");

        } else {
            System.out.println();
            System.out.println("தினம் ஒரு திருக்குறள்");

        }
        displayRandomVerse();
        System.out.println();
        System.out.println("Press 1. For Selecting Section");
        System.out.println("Press 2. For Getting RandomVerse");
        System.out.println("Press 3. For Selecting Language");
        System.out.println("Press 4. For Selecting Whose Explanation(Tamil)");
        System.out.println("press 5. For Exit");
        System.out.print("Your Selection: ");
        menuOption = selectMenuOption();
        switch (menuOption) {
            case 1 -> startThirukuralApplication();
            case 2 -> {
                displayRandomVerse();
                menuScreen(language);
            }
            case 3 -> {
                selectLanguage();
                menuScreen(language);
            }
            case 4 -> selectWhoseExplanation();
            default -> {
                exitingApplication();
            }
        }
    }

    private void exitingApplication() {
        System.out.println("Thank you for using me...");
        System.out.println("Exiting Application.....");
        System.exit(1);
    }

    private void selectLanguage() {
        int num;
        System.out.println("Press 1. For English");
        System.out.println("Press 2. For Tanglish");
        System.out.println("Press 3. For Tamil");
        System.out.print("Select Language from Above: ");
        num = scanner.nextInt();
        switch (num) {
            case 1 -> language = "english";
            case 2 -> language = "tanglish";
            default -> language = "tamil";
        }
    }

    private void selectWhoseExplanation() {
        int num;
        System.out.println("Press 1. For டாக்டர் மு.வரதராசனார்");
        System.out.println("Press 2. For சாலமன் பாப்பையா");
        System.out.println("Press 3. For மு. கருணாநிதி");
        System.out.print("Select Explanation By from Above: ");
        num = scanner.nextInt();
        switch (num) {
            case 1 -> explanationBy = "mv";
            case 2 -> explanationBy = "sp";
            default -> explanationBy = "mk";
        }
        menuScreen(language);
    }

    private int selectMenuOption() {
        return scanner.nextInt();
    }

    private void displayRandomVerse() {
        int num = random.nextInt(1, 1330);
        displayKural(num, language, explanationBy);
    }


    private static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static void main(String[] args) throws IOException {
        MainView mainView = new MainView();
        mainView.menuScreen(mainView.language);
    }

}
