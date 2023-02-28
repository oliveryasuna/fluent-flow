package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.textfield.TextArea;

public class TextAreaFactory extends FluentFactory<TextArea, TextAreaFactory> implements ITextAreaFactory<TextArea, TextAreaFactory> {

  public TextAreaFactory(final TextArea textArea) {
    super(textArea);
  }

  public TextAreaFactory() {
    super(new TextArea());
  }

  public TextAreaFactory(final String label) {
    super(new TextArea(label));
  }

  public TextAreaFactory(final String label, final String placeholder) {
    super(new TextArea(label, placeholder));
  }

  public TextAreaFactory(final String label, final String initialValue, final String placeholder) {
    super(new TextArea(label, initialValue, placeholder));
  }

  public TextAreaFactory(final ValueChangeListener<? super ComponentValueChangeEvent<TextArea, String>> listener) {
    super(new TextArea(listener));
  }

  public TextAreaFactory(final String label, final ValueChangeListener<? super ComponentValueChangeEvent<TextArea, String>> listener) {
    super(new TextArea(label, listener));
  }

  public TextAreaFactory(final String label, final String initialValue,
      final ValueChangeListener<? super ComponentValueChangeEvent<TextArea, String>> listener) {
    super(new TextArea(label, initialValue, listener));
  }

}
