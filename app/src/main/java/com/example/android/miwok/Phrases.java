package com.example.android.miwok;

/**
 * {@Link Phrases} represents a vocabyulary Phrases that the user wants to learn.
 * It contains a default translationa dn a Miwok translation for that Phrases.
 */

public class Phrases {

    /** Default translations for the Phrases */
    private String mDefaultTranslation;

    /** Miwok translations for the Phrases */
    private String mMiwokTranslation;

    public Phrases(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the Phrases.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the Phrases.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
