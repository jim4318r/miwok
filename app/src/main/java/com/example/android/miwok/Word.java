package com.example.android.miwok;

/**
 * {@Link Word} represents a vocabyulary word that the user wants to learn.
 * It contains a default translationa dn a Miwok translation for that word.
 */

public class Word {

    /** Default translations for the word */
    private String mDefaultTranslation;

    /** Miwok translations for the word */
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
