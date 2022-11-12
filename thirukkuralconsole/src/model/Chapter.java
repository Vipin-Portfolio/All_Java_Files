package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties("transliteration")
public class Chapter {
    private String chapterName;
    private String chapterNameEnglish;
    private int chapterNumber;
    private int verseStartNumber;
    private int verseEndNumber;

    public Chapter() {}

    @JsonProperty("name")
    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    @JsonProperty("translation")
    public String getChapterNameEnglish() {
        return chapterNameEnglish;
    }

    public void setChapterNameEnglish(String chapterNameEnglish) {
        this.chapterNameEnglish = chapterNameEnglish;
    }

    @JsonProperty("number")
    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    @JsonProperty("start")
    public int getVerseStartNumber() {
        return verseStartNumber;
    }

    public void setVerseStartNumber(int verseStartNumber) {
        this.verseStartNumber = verseStartNumber;
    }

    @JsonProperty("end")
    public int getVerseEndNumber() {
        return verseEndNumber;
    }

    public void setVerseEndNumber(int verseEndNumber) {
        this.verseEndNumber = verseEndNumber;
    }
}
