package com.oliveryasuna.vaadin.fluent.component.progressbar;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.DoubleValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.vaadin.flow.component.progressbar.ProgressBar;

// I want a monkey. How about you?

public interface IProgressBarFactory<T extends ProgressBar, F extends IProgressBarFactory<T, F>> extends IFluentFactory<T, F>,
    IGeneratedVaadinProgressBarFactory<T, F, ProgressBar>, HasSizeFactory<T, F> {

  default F setValue(final double value) {
    get().setValue(value);

    return uncheckedThis();
  }

  default DoubleValueBreak<T, F> getValue() {
    return new DoubleValueBreak<>(uncheckedThis(), get().getValue());
  }

  default F setMax(final double max) {
    get().setMax(max);

    return uncheckedThis();
  }

  default DoubleValueBreak<T, F> getMax() {
    return new DoubleValueBreak<>(uncheckedThis(), get().getMax());
  }

  default F setMin(final double min) {
    get().setMin(min);

    return uncheckedThis();
  }

  default DoubleValueBreak<T, F> getMin() {
    return new DoubleValueBreak<>(uncheckedThis(), get().getMin());
  }

  // Protected override.
  default F setIndeterminate(final boolean indeterminate) {
    get().setIndeterminate(indeterminate);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isIndeterminate() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isIndeterminate());
  }

}
