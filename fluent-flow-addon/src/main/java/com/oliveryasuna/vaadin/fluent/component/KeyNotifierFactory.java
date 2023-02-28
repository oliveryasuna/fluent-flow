package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.*;
import com.vaadin.flow.shared.Registration;

public interface KeyNotifierFactory<T extends KeyNotifier, F extends KeyNotifierFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addKeyDownListener(final ComponentEventListener<KeyDownEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addKeyDownListener(listener));
  }

  default ValueBreak<T, F, Registration> addKeyPressListener(final ComponentEventListener<KeyPressEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addKeyPressListener(listener));
  }

  default ValueBreak<T, F, Registration> addKeyUpListener(final ComponentEventListener<KeyUpEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addKeyUpListener(listener));
  }

  default ValueBreak<T, F, Registration> addKeyDownListener(final Key key, final ComponentEventListener<KeyDownEvent> listener,
      final KeyModifier... modifiers) {
    return new ValueBreak<>(uncheckedThis(), get().addKeyDownListener(key, listener, modifiers));
  }

  default ValueBreak<T, F, Registration> addKeyPressListener(final Key key, final ComponentEventListener<KeyPressEvent> listener,
      final KeyModifier... modifiers) {
    return new ValueBreak<>(uncheckedThis(), get().addKeyPressListener(key, listener, modifiers));
  }

  default ValueBreak<T, F, Registration> addKeyUpListener(final Key key, final ComponentEventListener<KeyUpEvent> listener,
      final KeyModifier... modifiers) {
    return new ValueBreak<>(uncheckedThis(), get().addKeyUpListener(key, listener, modifiers));
  }

}
