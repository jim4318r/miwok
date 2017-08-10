package com.example.android.miwok;

/**
 * {@Link Color} represents a vocabyulary Color that the user wants to learn.
 * It contains a default translationa dn a Miwok translation for that Color.
 */

public class Color {

    /** Default translations for the Color */
    private String mDefaultTranslation;

    /** Miwok translations for the Color */
    private String mMiwokTranslation;

    public Color(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the Color.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the Color.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
