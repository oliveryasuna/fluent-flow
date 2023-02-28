package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.textfield.AbstractNumberField;

public class AbstractNumberFieldFactory<C extends AbstractNumberField<C, T>, T extends Number>
    extends ComponentFactory<AbstractNumberField<C, T>, AbstractNumberFieldFactory<C, T>>
    implements IAbstractNumberFieldFactory<AbstractNumberField<C, T>, AbstractNumberFieldFactory<C, T>, C, T> {

  public AbstractNumberFieldFactory(final AbstractNumberField<C, T> abstractNumberField) {
    super(abstractNumberField);
  }

}
