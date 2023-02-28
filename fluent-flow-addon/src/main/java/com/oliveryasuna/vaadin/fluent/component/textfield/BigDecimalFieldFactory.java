package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.textfield.BigDecimalField;

import java.math.BigDecimal;

public class BigDecimalFieldFactory extends ComponentFactory<BigDecimalField, BigDecimalFieldFactory>
    implements IBigDecimalFieldFactory<BigDecimalField, BigDecimalFieldFactory> {

  public BigDecimalFieldFactory(final BigDecimalField bigDecimalField) {
    super(bigDecimalField);
  }

  public BigDecimalFieldFactory() {
    super(new BigDecimalField());
  }

  public BigDecimalFieldFactory(final String label) {
    super(new BigDecimalField(label));
  }

  public BigDecimalFieldFactory(final String label, final String placeholder) {
    super(new BigDecimalField(label, placeholder));
  }

  public BigDecimalFieldFactory(final String label, final BigDecimal initialValue, final String placeholder) {
    super(new BigDecimalField(label, initialValue, placeholder));
  }

  public BigDecimalFieldFactory(final ValueChangeListener<? super ComponentValueChangeEvent<BigDecimalField, BigDecimal>> listener) {
    super(new BigDecimalField(listener));
  }

  public BigDecimalFieldFactory(final String label, final ValueChangeListener<? super ComponentValueChangeEvent<BigDecimalField, BigDecimal>> listener) {
    super(new BigDecimalField(label, listener));
  }

  public BigDecimalFieldFactory(final String label, final BigDecimal initialValue,
      final ValueChangeListener<? super ComponentValueChangeEvent<BigDecimalField, BigDecimal>> listener) {
    super(new BigDecimalField(label, initialValue, listener));
  }

}
