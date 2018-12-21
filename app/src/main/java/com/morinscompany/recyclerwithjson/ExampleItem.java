package com.morinscompany.recyclerwithjson;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;
    private int mDownloads;

    public ExampleItem(String imageUrl, String creator, int likes, int downloads) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
        mDownloads = downloads;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }

    public int getDownloadsCount() {
        return mDownloads;
    }
}