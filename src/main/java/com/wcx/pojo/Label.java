package com.wcx.pojo;public class Label {
    private int LabelID;
    private String labelName;
    private String detail;

    @Override
    public String toString() {
        return "Label{" +
                "LabelID=" + LabelID +
                ", labelName='" + labelName + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public int getLabelID() {
        return LabelID;
    }

    public void setLabelID(int labelID) {
        LabelID = labelID;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
