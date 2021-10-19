package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.HasText;

public interface HasTextFactory<T extends HasText, F extends HasTextFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F setText(final String text) {
    get().setText(text);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getText() {
    return new ValueBreak<>(uncheckedThis(), get().getText());
  }

}
