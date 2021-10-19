package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;

public class LoginFormFactory extends FluentFactory<LoginForm, LoginFormFactory> implements ILoginFormFactory<LoginForm, LoginFormFactory> {

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
