package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties({ "transliteration"})
public class Section {
    private String sectionName;
    private String sectionNameEnglish;
    private int sectionNumber;
    private List<ChapterGroup> chapterGroupList;

    public Section() {}

    @JsonProperty("name")
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @JsonProperty("translation")
    public String getSectionNameEnglish() {
        return sectionNameEnglish;
    }

    public void setSectionNameEnglish(String sectionNameEnglish) {
        this.sectionNameEnglish = sectionNameEnglish;
    }

    @JsonProperty("number")
    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    @JsonProperty("chapterGroup")
    public List<ChapterGroup> getChapterGroupList() {
        return chapterGroupList;
    }

    public void setChapterGroupList(List<ChapterGroup> chapterGroupList) {
        this.chapterGroupList = chapterGroupList;
    }
}
