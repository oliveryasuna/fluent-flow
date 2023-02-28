package com.oliveryasuna.vaadin.fluent.component;

import com.vaadin.flow.component.AbstractField;

public class AbstractFieldFactory<C extends AbstractField<C, T>, T> extends ComponentFactory<AbstractField<C, T>, AbstractFieldFactory<C, T>>
    implements IAbstractFieldFactory<AbstractField<C, T>, AbstractFieldFactory<C, T>, C, T> {

  public AbstractFieldFactory(final AbstractField<C, T> abstractField) {
    super(abstractField);
  }

}
