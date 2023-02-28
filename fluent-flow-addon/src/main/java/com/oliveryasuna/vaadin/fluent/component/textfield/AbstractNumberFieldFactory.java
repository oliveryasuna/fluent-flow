package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.textfield.AbstractNumberField;

public abstract class AbstractNumberFieldFactory<C extends AbstractNumberField<C, T>, T extends Number>
    extends FluentFactory<AbstractNumberField<C, T>, AbstractNumberFieldFactory<C, T>>
    implements IAbstractNumberFieldFactory<AbstractNumberField<C, T>, AbstractNumberFieldFactory<C, T>, C, T> {

  public AbstractNumberFieldFactory(final AbstractNumberField<C, T> abstractNumberField) {
    super(abstractNumberField);
  }

}
