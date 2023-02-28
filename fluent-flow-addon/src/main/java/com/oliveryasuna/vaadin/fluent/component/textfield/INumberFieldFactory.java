package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.DoubleValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.textfield.NumberField;

public interface INumberFieldFactory<T extends NumberField, F extends INumberFieldFactory<T, F>> extends IFluentFactory<T, F>,
    IAbstractNumberFieldFactory<T, F, NumberField, Double> {

  // Protected override.
  default F setMin(final double min) {
    get().setMin(min);

    return uncheckedThis();
  }

  // Protected override.
  default DoubleValueBreak<T, F> getMin() {
    return new DoubleValueBreak<>(uncheckedThis(), get().getMin());
  }

  // Protected override.
  default F setMax(final double max) {
    get().setMax(max);

    return uncheckedThis();
  }

  // Protected override.
  default DoubleValueBreak<T, F> getMax() {
    return new DoubleValueBreak<>(uncheckedThis(), get().getMax());
  }

  // Protected override.
  default F setStep(final double step) {
    get().setStep(step);

    return uncheckedThis();
  }

  // Protected override.
  default DoubleValueBreak<T, F> getStep() {
    return new DoubleValueBreak<>(uncheckedThis(), get().getStep());
  }

  @Deprecated // Per Vaadin.
  default F setMaxLength(final int maxLength) {
    get().setMaxLength(maxLength);

    return uncheckedThis();
  }

  @Deprecated // Per Vaadin.
  default IntValueBreak<T, F> getMaxLength() {
    return new IntValueBreak<>(uncheckedThis(), get().getMaxLength());
  }

  @Deprecated // Per Vaadin.
  default F setMinLength(final int minLength) {
    get().setMinLength(minLength);

    return uncheckedThis();
  }

  @Deprecated // Per Vaadin.
  default IntValueBreak<T, F> getMinLength() {
    return new IntValueBreak<>(uncheckedThis(), get().getMinLength());
  }

  @Deprecated // Per Vaadin.
  default BooleanValueBreak<T, F> isPreventInvalidInput() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isPreventInvalidInput());
  }

  @Deprecated // Per Vaadin.
  default F setPreventInvalidInput(final boolean preventInvalidInput) {
    get().setPreventInvalidInput(preventInvalidInput);

    return uncheckedThis();
  }

  @Deprecated // Per Vaadin.
  default F setPattern(final String pattern) {
    get().setPattern(pattern);

    return uncheckedThis();
  }

  @Deprecated // Per Vaadin.
  default ValueBreak<T, F, String> getPattern() {
    return new ValueBreak<>(uncheckedThis(), get().getPattern());
  }


}
