package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.login.AbstractLogin;

public abstract class AbstractLoginFactory extends FluentFactory<AbstractLogin, AbstractLoginFactory>
    implements IAbstractLoginFactory<AbstractLogin, AbstractLoginFactory> {

  public AbstractLoginFactory(final AbstractLogin abstractLogin) {
    super(abstractLogin);
  }

}
