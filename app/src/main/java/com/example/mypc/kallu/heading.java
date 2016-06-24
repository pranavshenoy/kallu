package com.example.mypc.kallu;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by PRANAV SHENOY on 22-06-2016.
 */
public class heading implements Serializable {
    private String title;
    private String author;

    heading(String title,String author) {
        this.title=title;
        this.author=author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}


