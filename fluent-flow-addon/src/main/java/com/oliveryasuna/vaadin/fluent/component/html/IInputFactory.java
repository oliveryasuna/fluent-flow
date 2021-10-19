package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.FocusableFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasStyleFactory;
import com.oliveryasuna.vaadin.fluent.component.IAbstractSinglePropertyFieldFactory;
import com.oliveryasuna.vaadin.fluent.data.value.HasValueChangeModeFactory;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.data.value.ValueChangeMode;

import java.util.Optional;

public interface IInputFactory<T extends Input, F extends IInputFactory<T, F>> extends IFluentFactory<T, F>,
    IAbstractSinglePropertyFieldFactory<T, F, Input, String>, FocusableFactory<T, F, Input>, HasSizeFactory<T, F>, HasStyleFactory<T, F>,
    HasValueChangeModeFactory<T, F> {

  default F setPlaceholder(final String placeholder) {
    get().setPlaceholder(placeholder);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Optional<String>> getPlaceholder() {
    return new ValueBreak<>(uncheckedThis(), get().getPlaceholder());
  }

  default F setType(final String type) {
    get().setType(type);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getType() {
    return new ValueBreak<>(uncheckedThis(), get().getType());
  }

  @Override
  default ValueBreak<T, F, ValueChangeMode> getValueChangeMode() {
    return new ValueBreak<>(uncheckedThis(), get().getValueChangeMode());
  }

  @Override
  default F setValueChangeMode(final ValueChangeMode valueChangeMode) {
    get().setValueChangeMode(valueChangeMode);

    return uncheckedThis();
  }

  @Override
  default F setValueChangeTimeout(final int valueChangeTimeout) {
    get().setValueChangeTimeout(valueChangeTimeout);

    return uncheckedThis();
  }

  @Override
  default IntValueBreak<T, F> getValueChangeTimeout() {
    return new IntValueBreak<>(uncheckedThis(), get().getValueChangeTimeout());
  }

}
