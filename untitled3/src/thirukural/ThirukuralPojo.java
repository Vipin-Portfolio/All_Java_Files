package thirukural;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties("transliteration")
public class ThirukuralPojo {
    private String chapterName;
    private String chapterNameEnglish;
    private int chapterNumber;
    private int start;
    private int end;
    public ThirukuralPojo(){

    }
    @JsonProperty("name")
    public String getChapterName(){
        return chapterName;
    }
    public void setChapterName(String chapterName){
        this.chapterName=chapterName;
    }
    @JsonProperty("translation")
    public String getChapterNameEnglish(){
        return chapterNameEnglish;
    }
    public void setChapterNameEnglish(String chapterNameEnglish){
        this.chapterNameEnglish=chapterNameEnglish;
    }
    @JsonProperty("number")
    public int getChapterNumber(){
        return chapterNumber;
    }
    public void setChapterNumber(int chapterNumber){
        this.chapterNumber=chapterNumber;
    }
    @JsonProperty("start")
    public int getStart(){
        return start;
    }
    public void setStart(int start){
        this.start=start;
    }
    @JsonProperty("end")
    public int getEnd(){
        return end;
    }
    public void setEnd(int end){
        this.end = end;
    }


}
