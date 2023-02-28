package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.textfield.PasswordField;

public class PasswordFieldFactory extends FluentFactory<PasswordField, PasswordFieldFactory> implements IPasswordFieldFactory<PasswordField, PasswordFieldFactory> {

  public PasswordFieldFactory(final PasswordField passwordField) {
    super(passwordField);
  }

  public PasswordFieldFactory() {
    super(new PasswordField());
  }

  public PasswordFieldFactory(final String label) {
    super(new PasswordField(label));
  }

  public PasswordFieldFactory(final String label, final String placeholder) {
    super(new PasswordField(label, placeholder));
  }

  public PasswordFieldFactory(final ValueChangeListener<? super ComponentValueChangeEvent<PasswordField, String>> listener) {
    super(new PasswordField(listener));
  }

  public PasswordFieldFactory(final String label, final ValueChangeListener<? super ComponentValueChangeEvent<PasswordField, String>> listener) {
    super(new PasswordField(label, listener));
  }

  public PasswordFieldFactory(final String label, final String initialValue,
      final ValueChangeListener<? super ComponentValueChangeEvent<PasswordField, String>> listener) {
    super(new PasswordField(label, initialValue, listener));
  }

}
