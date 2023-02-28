package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.textfield.TextField;

public class TextFieldFactory extends FluentFactory<TextField, TextFieldFactory> implements ITextFieldFactory<TextField, TextFieldFactory> {

  public TextFieldFactory(final TextField textField) {
    super(textField);
  }

  public TextFieldFactory() {
    super(new TextField());
  }

  public TextFieldFactory(final String label) {
    super(new TextField(label));
  }

  public TextFieldFactory(final String label, final String placeholder) {
    super(new TextField(label, placeholder));
  }

  public TextFieldFactory(final String label, final String initialValue, final String placeholder) {
    super(new TextField(label, initialValue, placeholder));
  }

  public TextFieldFactory(final ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
    super(new TextField(listener));
  }

  public TextFieldFactory(final String label, final ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
    super(new TextField(label, listener));
  }

  public TextFieldFactory(final String label, final String initialValue,
      final ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
    super(new TextField(label, initialValue, listener));
  }

}
