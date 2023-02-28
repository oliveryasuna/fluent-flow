package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField;

public abstract class AbstractFieldFactory<C extends AbstractField<C, T>, T> extends FluentFactory<AbstractField<C, T>, AbstractFieldFactory<C, T>>
    implements IAbstractFieldFactory<AbstractField<C, T>, AbstractFieldFactory<C, T>, C, T> {

  public AbstractFieldFactory(final AbstractField<C, T> abstractField) {
    super(abstractField);
  }

}
