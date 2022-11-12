package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kural {
    private int number;
    private String line1;
    private String line2;
    private String translation;
    private String mv;
    private String sp;
    private String mk;
    private String explanation;
    private String couplet;
    private String lineEnglish1;
    private String lineEnglish2;

    public Kural() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getMv() {
        return mv;
    }

    public void setMv(String mv) {
        this.mv = mv;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getCouplet() {
        return couplet;
    }

    public void setCouplet(String couplet) {
        this.couplet = couplet;
    }

    @JsonProperty("transliteration1")
    public String getLineEnglish1() {
        return lineEnglish1;
    }

    public void setLineEnglish1(String lineEnglish1) {
        this.lineEnglish1 = lineEnglish1;
    }

    @JsonProperty("transliteration2")
    public String getLineEnglish2() {
        return lineEnglish2;
    }

    public void setLineEnglish2(String lineEnglish2) {
        this.lineEnglish2 = lineEnglish2;
    }
}
