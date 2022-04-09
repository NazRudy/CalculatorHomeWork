package com.naz.calculatorhomework.storage;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

import com.naz.calculatorhomework.R;

public enum Theme {
    ONE(R.style.Theme_CalculatorHomeWork, R.string.theme_one, "THEME_ONE"),
    TWO(R.style.Theme_CalculatorHomeWorkNight, R.string.theme_two, "THEME_TWO"),
    THREE(R.style.Theme_CalculatorHomeWorkNight, R.string.theme_three, "THEME_ONE");

    private @StyleRes
    final int theme;

    private @StringRes
    final
    int title;
    private final String key;

    Theme(int theme, int title, String key) {
        this.theme = theme;
        this.title = title;
        this.key = key;
    }

    public int getTitle() {
        return title;
    }

    public String getKey() {
        return key;
    }

    public int getTheme() {
        return theme;
    }
}
