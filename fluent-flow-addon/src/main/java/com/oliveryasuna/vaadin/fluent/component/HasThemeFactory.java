package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.dom.ThemeList;

public interface HasThemeFactory<T extends HasTheme, F extends HasThemeFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F addThemeName(final String themeName) {
    get().addThemeName(themeName);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> removeThemeName(final String themeName) {
    return new BooleanValueBreak<>(uncheckedThis(), get().removeThemeName(themeName));
  }

  default F setThemeName(final String themeName) {
    get().setThemeName(themeName);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getThemeName() {
    return new ValueBreak<>(uncheckedThis(), get().getThemeName());
  }

  default ValueBreak<T, F, ThemeList> getThemeNames() {
    return new ValueBreak<>(uncheckedThis(), get().getThemeNames());
  }

  default F setThemeName(final String themeName, final boolean set) {
    get().setThemeName(themeName, set);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> hasThemeName(final String themeName) {
    return new BooleanValueBreak<>(uncheckedThis(), get().hasThemeName(themeName));
  }

  default F addThemeNames(final String... themeNames) {
    get().addThemeNames(themeNames);

    return uncheckedThis();
  }

  default F removeThemeNames(final String... themeNames) {
    get().removeThemeNames(themeNames);

    return uncheckedThis();
  }

}
