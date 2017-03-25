package com.example.android.miwok;

/**
 * Created by Christian PC on 25/03/2017.
 */

public class Word {

    // Default Translation of the word
    private String mDefaultTranslation;
    // Miwok Translation of the word
    private String mMiwokTranslation;

    public Word (String DefaultTranslation, String MiwokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
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
