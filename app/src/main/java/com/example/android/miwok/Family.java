package com.example.android.miwok;

/**
 * {@Link Family} represents a vocabyulary Family that the user wants to learn.
 * It contains a default translationa dn a Miwok translation for that Family.
 */

public class Family {

    /** Default translations for the Family */
    private String mDefaultTranslation;

    /** Miwok translations for the Family */
    private String mMiwokTranslation;

    public Family(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the Family.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the Family.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
