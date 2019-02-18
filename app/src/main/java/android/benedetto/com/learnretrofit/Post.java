package android.benedetto.com.learnretrofit;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("title")
    private String title;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }
}
