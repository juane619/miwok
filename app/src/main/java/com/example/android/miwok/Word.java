package com.example.android.miwok;

/**
 * Created by juane on 26/09/2017.
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslaion;
    private int imageTranslation=-1;

    public Word(String miwokTranslation_p, String defaultTranslaion_p){
        miwokTranslation= miwokTranslation_p;
        defaultTranslaion= defaultTranslaion_p;
    }

    public Word(String miwokTranslation_p, String defaultTranslaion_p, int image_p){
        miwokTranslation= miwokTranslation_p;
        defaultTranslaion= defaultTranslaion_p;
        imageTranslation= image_p;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public String getDefaultTranslaion(){
        return defaultTranslaion;
    }

    public int getImageTranslation(){return imageTranslation; }
}
