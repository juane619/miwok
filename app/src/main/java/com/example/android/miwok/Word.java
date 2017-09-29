package com.example.android.miwok;

/**
 * Created by juane on 26/09/2017.
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslaion;

    public Word(String miwokTranslation_p, String defaultTranslaion_p){
        miwokTranslation= miwokTranslation_p;
        defaultTranslaion= defaultTranslaion_p;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public String getDefaultTranslaion(){
        return defaultTranslaion;
    }
}
