package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.textfield.GeneratedVaadinNumberField;

public abstract class GeneratedVaadinNumberFieldFactory<R extends GeneratedVaadinNumberField<R, T>, T>
    extends FluentFactory<GeneratedVaadinNumberField<R, T>, GeneratedVaadinNumberFieldFactory<R, T>>
    implements IGeneratedVaadinNumberFieldFactory<GeneratedVaadinNumberField<R, T>, GeneratedVaadinNumberFieldFactory<R, T>, R, T> {

  public GeneratedVaadinNumberFieldFactory(final GeneratedVaadinNumberField<R, T> generatedVaadinNumberField) {
    super(generatedVaadinNumberField);
  }

}
