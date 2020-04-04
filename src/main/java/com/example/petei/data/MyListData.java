package com.example.petei.data;

public class MyListData {

    private int imgId1;
    private int imgId2;

    public MyListData(int imgId1) {
        this.imgId1 = imgId1;
        this.imgId2 = -1;
    }

    public MyListData(int imgId1, int imgId2) {
        this.imgId1 = imgId1;
        this.imgId2 = imgId2;
    }

    public int getImgId1() {
        return imgId1;
    }

    public void setImgId1(int imgId1) {
        this.imgId1 = imgId1;
    }

    public int getImgId2() {
        return imgId2;
    }

    public void setImgId2(int imgId2) {
        this.imgId2 = imgId2;
    }
}
