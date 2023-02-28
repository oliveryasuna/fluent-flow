package com.oliveryasuna.vaadin.fluent.component.login;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasEnabledFactory;
import com.oliveryasuna.vaadin.fluent.component.IComponentFactory;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.login.AbstractLogin.ForgotPasswordEvent;
import com.vaadin.flow.component.login.AbstractLogin.LoginEvent;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.shared.Registration;

public interface IAbstractLoginFactory<T extends AbstractLogin, F extends IAbstractLoginFactory<T, F>> extends IFluentFactory<T, F>, IComponentFactory<T, F>,
    HasEnabledFactory<T, F> {

  default F setAction(final String action) {
    get().setAction(action);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getAction() {
    return new ValueBreak<>(uncheckedThis(), get().getAction());
  }

  default F setError(final boolean error) {
    get().setError(error);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isError() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isError());
  }

  default F setForgotPasswordButtonVisible(final boolean forgotPasswordButtonVisible) {
    get().setForgotPasswordButtonVisible(forgotPasswordButtonVisible);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isForgotPasswordButtonVisible() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isForgotPasswordButtonVisible());
  }

  default F setI18n(final LoginI18n i18n) {
    get().setI18n(i18n);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Registration> addLoginListener(final ComponentEventListener<LoginEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addLoginListener(listener));
  }

  default ValueBreak<T, F, Registration> addForgotPasswordListener(final ComponentEventListener<ForgotPasswordEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addForgotPasswordListener(listener));
  }

  @Override
  default F onEnabledStateChanged(final boolean enabled) {
    get().onEnabledStateChanged(enabled);

    return uncheckedThis();
  }

}
