package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.login.AbstractLogin;

public class AbstractLoginFactory extends ComponentFactory<AbstractLogin, AbstractLoginFactory>
    implements IAbstractLoginFactory<AbstractLogin, AbstractLoginFactory> {

  public AbstractLoginFactory(final AbstractLogin abstractLogin) {
    super(abstractLogin);
  }

}
