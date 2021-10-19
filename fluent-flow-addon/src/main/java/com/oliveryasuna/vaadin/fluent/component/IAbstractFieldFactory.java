package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.shared.Registration;

public interface IAbstractFieldFactory<T extends AbstractField<C, T2>, F extends IAbstractFieldFactory<T, F, C, T2>, C extends AbstractField<C, T2>, T2>
    extends IFluentFactory<T, F>, IComponentFactory<T, F>, HasValueAndElementFactory<T, F, ComponentValueChangeEvent<C, T2>, T2> {

  @Override
  default ValueBreak<T, F, Registration> addValueChangeListener(final HasValue.ValueChangeListener<? super ComponentValueChangeEvent<C, T2>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addValueChangeListener(listener));
  }

  @Override
  default F setValue(final T2 value) {
    get().setValue(value);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isEmpty() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isEmpty());
  }

  @Override
  default ValueBreak<T, F, T2> getValue() {
    return new ValueBreak<>(uncheckedThis(), get().getValue());
  }

  @Override
  default ValueBreak<T, F, T2> getEmptyValue() {
    return new ValueBreak<>(uncheckedThis(), get().getEmptyValue());
  }

}
