package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.textfield.EmailField;

public class EmailFieldFactory extends FluentFactory<EmailField, EmailFieldFactory> implements IEmailFieldFactory<EmailField, EmailFieldFactory> {

  public EmailFieldFactory(final EmailField emailField) {
    super(emailField);
  }

  public EmailFieldFactory() {
    super(new EmailField());
  }

  public EmailFieldFactory(final String label) {
    super(new EmailField(label));
  }

  public EmailFieldFactory(final String label, final String placeholder) {
    super(new EmailField(label, placeholder));
  }

  public EmailFieldFactory(final ValueChangeListener<? super ComponentValueChangeEvent<EmailField, String>> listener) {
    super(new EmailField(listener));
  }

  public EmailFieldFactory(final String label, final ValueChangeListener<? super ComponentValueChangeEvent<EmailField, String>> listener) {
    super(new EmailField(label, listener));
  }

  public EmailFieldFactory(final String label, final String initialValue,
      final ValueChangeListener<? super ComponentValueChangeEvent<EmailField, String>> listener) {
    super(new EmailField(label, initialValue, listener));
  }

}
