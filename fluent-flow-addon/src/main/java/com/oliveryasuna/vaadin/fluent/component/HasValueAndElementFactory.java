package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.HasValueAndElement;

public interface HasValueAndElementFactory<T extends HasValueAndElement<E, V>, F extends HasValueAndElementFactory<T, F, E, V>,
    E extends HasValue.ValueChangeEvent<V>, V> extends IFluentFactory<T, F>, HasValueFactory<T, F, E, V>, HasElementFactory<T, F>, HasEnabledFactory<T, F> {

  @Override
  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  @Override
  default BooleanValueBreak<T, F> isRequiredIndicatorVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequiredIndicatorVisible());
  }

  @Override
  default F setReadOnly(final boolean readOnly) {
    get().setReadOnly(readOnly);

    return uncheckedThis();
  }

  @Override
  default BooleanValueBreak<T, F> isReadOnly() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isReadOnly());
  }

}
