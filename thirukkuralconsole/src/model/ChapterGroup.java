package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties("transliteration")
public class ChapterGroup {
    private String chapterGroupName;
    private String chapterGroupNameEnglish;
    private int chapterGroupNumber;
    private List<Chapter> chapterList;

    public ChapterGroup(){}

    @JsonProperty("name")
    public String getChapterGroupName() {
        return chapterGroupName;
    }

    public void setChapterGroupName(String chapterGroupName) {
        this.chapterGroupName = chapterGroupName;
    }

    @JsonProperty("translation")
    public String getChapterGroupNameEnglish() {
        return chapterGroupNameEnglish;
    }

    public void setChapterGroupNameEnglish(String chapterGroupNameEnglish) {
        this.chapterGroupNameEnglish = chapterGroupNameEnglish;
    }

    @JsonProperty("number")
    public int getChapterGroupNumber() {
        return chapterGroupNumber;
    }

    public void setChapterGroupNumber(int chapterGroupNumber) {
        this.chapterGroupNumber = chapterGroupNumber;
    }

    @JsonProperty("chapters")
    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }
}
