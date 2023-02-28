package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.textfield.GeneratedVaadinPasswordField;

public abstract class GeneratedVaadinPasswordFieldFactory<R extends GeneratedVaadinPasswordField<R, T>, T>
    extends FluentFactory<GeneratedVaadinPasswordField<R, T>, GeneratedVaadinPasswordFieldFactory<R, T>>
    implements IGeneratedVaadinPasswordFieldFactory<GeneratedVaadinPasswordField<R, T>, GeneratedVaadinPasswordFieldFactory<R, T>, R, T> {

  public GeneratedVaadinPasswordFieldFactory(final GeneratedVaadinPasswordField<R, T> generatedVaadinTextField) {
    super(generatedVaadinTextField);
  }

}
