package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.vaadin.flow.component.HasEnabled;

public interface HasEnabledFactory<T extends HasEnabled, F extends HasEnabledFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default F setEnabled(final boolean enabled) {
    get().setEnabled(enabled);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isEnabled() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isEnabled());
  }

}
