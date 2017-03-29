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
    // Audio asociated to the word
    private int mAudioResourceId;

    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    // Get the Audio of the word
    public int getAudioResourceId (){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
