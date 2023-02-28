package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;

public class LoginFormFactory extends ComponentFactory<LoginForm, LoginFormFactory> implements ILoginFormFactory<LoginForm, LoginFormFactory> {

  public LoginFormFactory(final LoginForm loginForm) {
    super(loginForm);
  }

  public LoginFormFactory() {
    super(new LoginForm());
  }

  public LoginFormFactory(final LoginI18n i18n) {
    super(new LoginForm(i18n));
  }

}
