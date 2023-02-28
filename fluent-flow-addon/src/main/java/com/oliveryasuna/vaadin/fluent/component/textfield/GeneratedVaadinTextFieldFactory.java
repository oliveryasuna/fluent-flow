package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.textfield.GeneratedVaadinTextField;

public abstract class GeneratedVaadinTextFieldFactory<R extends GeneratedVaadinTextField<R, T>, T>
    extends FluentFactory<GeneratedVaadinTextField<R, T>, GeneratedVaadinTextFieldFactory<R, T>>
    implements IGeneratedVaadinTextFieldFactory<GeneratedVaadinTextField<R, T>, GeneratedVaadinTextFieldFactory<R, T>, R, T> {

  public GeneratedVaadinTextFieldFactory(final GeneratedVaadinTextField<R, T> generatedVaadinTextField) {
    super(generatedVaadinTextField);
  }

}
