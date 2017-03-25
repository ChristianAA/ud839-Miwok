package com.example.android.miwok;

/**
 * Created by Christian PC on 25/03/2017.
 */

public class Word {

    // Miwok Translation of the word
    private String mMiwokTranslation;

    // Default Translation of the word
    private String mDefaultTranslation;

    public Word (String MiwokTranslation, String DefaultTranslation){
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
    }

    // Get the Miwok Translation of the word
    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    // Get the Default Translation of the word
    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }
}
