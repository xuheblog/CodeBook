package com.xuhe.codebook20;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Data {
    private String mTitle;
    private String mContent;
    private String mTime;
    public Data(String title,String content,String time){
        this.mTitle = title;
        this.mContent = content;
        this.mTime = time;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmContent() {return mContent;}

    public String getmTime() {
        return mTime;
    }
}
