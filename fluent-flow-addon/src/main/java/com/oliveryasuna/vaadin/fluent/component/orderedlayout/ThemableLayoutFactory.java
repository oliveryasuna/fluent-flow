package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasElementFactory;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.dom.ThemeList;

public interface ThemableLayoutFactory<T extends ThemableLayout, F extends ThemableLayoutFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F setMargin(final boolean margin) {
    get().setMargin(margin);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isMargin() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isMargin());
  }

  default F setPadding(final boolean padding) {
    get().setPadding(padding);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isPadding() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isPadding());
  }

  default F setSpacing(final boolean spacing) {
    get().setSpacing(spacing);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isSpacing() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isSpacing());
  }

  default ValueBreak<T, F, ThemeList> getThemeList() {
    return new ValueBreak<>(uncheckedThis(), get().getThemeList());
  }

  default F setBoxSizing(final BoxSizing boxSizing) {
    get().setBoxSizing(boxSizing);

    return uncheckedThis();
  }

  default ValueBreak<T, F, BoxSizing> getBoxSizing() {
    return new ValueBreak<>(uncheckedThis(), get().getBoxSizing());
  }

}
