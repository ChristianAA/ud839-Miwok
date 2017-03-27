package com.example.android.miwok;

/**
 * Created by Christian PC on 25/03/2017.
 */

public class Word {

    // Default Translation of the word
    private String mDefaultTranslation;
    // Miwok Translation of the word
    private String mMiwokTranslation;
    // Image asociated to the word
    private int mImageResourceId;

    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // Get the Miwok Translation of the word
    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    // Get the Default Translation of the word
    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    // Get the Image of the word
    public int getImageResourceId () {
        return mImageResourceId;
    }

}
