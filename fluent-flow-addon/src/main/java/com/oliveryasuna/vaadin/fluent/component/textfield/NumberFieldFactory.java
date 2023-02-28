package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.textfield.NumberField;

public class NumberFieldFactory extends FluentFactory<NumberField, NumberFieldFactory>
    implements INumberFieldFactory<NumberField, NumberFieldFactory> {

  public NumberFieldFactory(final NumberField numberField) {
    super(numberField);
  }

  public NumberFieldFactory() {
    super(new NumberField());
  }

  public NumberFieldFactory(final String label) {
    super(new NumberField(label));
  }

  public NumberFieldFactory(final String label, final String placeholder) {
    super(new NumberField(label, placeholder));
  }

  public NumberFieldFactory(final ValueChangeListener<? super ComponentValueChangeEvent<NumberField, Double>> listener) {
    super(new NumberField(listener));
  }

  public NumberFieldFactory(final String label, final ValueChangeListener<? super ComponentValueChangeEvent<NumberField, Double>> listener) {
    super(new NumberField(label, listener));
  }

  public NumberFieldFactory(final String label, final Double initialValue,
      final ValueChangeListener<? super ComponentValueChangeEvent<NumberField, Double>> listener) {
    super(new NumberField(label, initialValue, listener));
  }

}
