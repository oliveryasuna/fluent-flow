package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;

public class LoginOverlayFactory extends FluentFactory<LoginOverlay, LoginOverlayFactory> implements ILoginOverlayFactory<LoginOverlay, LoginOverlayFactory> {

  public LoginOverlayFactory(final LoginOverlay loginOverlay) {
    super(loginOverlay);
  }

  public LoginOverlayFactory() {
    super(new LoginOverlay());
  }

  public LoginOverlayFactory(final LoginI18n i18n) {
    super(new LoginOverlay(i18n));
  }

}
