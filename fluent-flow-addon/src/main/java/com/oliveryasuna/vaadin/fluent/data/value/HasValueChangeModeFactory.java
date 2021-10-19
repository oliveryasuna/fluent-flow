package com.oliveryasuna.vaadin.fluent.data.value;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.data.value.HasValueChangeMode;
import com.vaadin.flow.data.value.ValueChangeMode;

public interface HasValueChangeModeFactory<T extends HasValueChangeMode, F extends HasValueChangeModeFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, ValueChangeMode> getValueChangeMode() {
    return new ValueBreak<>(uncheckedThis(), get().getValueChangeMode());
  }

  default F setValueChangeMode(final ValueChangeMode valueChangeMode) {
    get().setValueChangeMode(valueChangeMode);

    return uncheckedThis();
  }

  default F setValueChangeTimeout(final int valueChangeTimeout) {
    get().setValueChangeTimeout(valueChangeTimeout);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> getValueChangeTimeout() {
    return new IntValueBreak<>(uncheckedThis(), get().getValueChangeTimeout());
  }

}
