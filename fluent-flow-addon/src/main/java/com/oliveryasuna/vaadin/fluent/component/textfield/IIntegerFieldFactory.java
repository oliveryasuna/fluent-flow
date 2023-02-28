package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.vaadin.flow.component.textfield.IntegerField;

public interface IIntegerFieldFactory<T extends IntegerField, F extends IIntegerFieldFactory<T, F>> extends IFluentFactory<T, F>,
    IAbstractNumberFieldFactory<T, F, IntegerField, Integer> {

  // Protected override.
  default F setMin(final int min) {
    get().setMin(min);

    return uncheckedThis();
  }

  // Protected override.
  default IntValueBreak<T, F> getMin() {
    return new IntValueBreak<>(uncheckedThis(), get().getMin());
  }

  // Protected override.
  default F setMax(final int max) {
    get().setMax(max);

    return uncheckedThis();
  }

  // Protected override.
  default IntValueBreak<T, F> getMax() {
    return new IntValueBreak<>(uncheckedThis(), get().getMax());
  }

  // Protected override.
  default F setStep(final int step) {
    get().setStep(step);

    return uncheckedThis();
  }

  // Protected override.
  default IntValueBreak<T, F> getStep() {
    return new IntValueBreak<>(uncheckedThis(), get().getStep());
  }

}
