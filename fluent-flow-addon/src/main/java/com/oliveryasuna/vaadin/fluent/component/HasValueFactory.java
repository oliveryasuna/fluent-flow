package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.HasValue.ValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.shared.Registration;

import java.util.Optional;

public interface HasValueFactory<T extends HasValue<E, V>, F extends HasValueFactory<T, F, E, V>, E extends ValueChangeEvent<V>, V>
    extends IFluentFactory<T, F> {

  default F setValue(final V value) {
    get().setValue(value);

    return uncheckedThis();
  }

  default ValueBreak<T, F, V> getValue() {
    return new ValueBreak<>(uncheckedThis(), get().getValue());
  }

  default ValueBreak<T, F, Registration> addValueChangeListener(final ValueChangeListener<? super E> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addValueChangeListener(listener));
  }

  default ValueBreak<T, F, V> getEmptyValue() {
    return new ValueBreak<>(uncheckedThis(), get().getEmptyValue());
  }

  default ValueBreak<T, F, Optional<V>> getOptionalValue() {
    return new ValueBreak<>(uncheckedThis(), get().getOptionalValue());
  }

  default BooleanValueBreak<T, F> isEmpty() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isEmpty());
  }

  default F clear() {
    get().clear();

    return uncheckedThis();
  }

  default F setReadOnly(final boolean readOnly) {
    get().setReadOnly(readOnly);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isReadOnly() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isReadOnly());
  }

  default F setRequiredIndicatorVisible(final boolean requiredIndicatorVisible) {
    get().setRequiredIndicatorVisible(requiredIndicatorVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isRequiredIndicatorVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequiredIndicatorVisible());
  }

}
