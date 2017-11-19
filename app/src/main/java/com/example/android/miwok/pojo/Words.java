package com.example.android.miwok.pojo;

/**
 * Created by ayush on 18/11/17.
 */

public class Words {
  private   int imageId;
    String word1;
    String word2;
    public Words(int imageId,String word1, String word2){
        this.imageId=imageId;
        this.word1=word1;
        this.word2=word2;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public String getWord2() {
        return word2;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }
}
