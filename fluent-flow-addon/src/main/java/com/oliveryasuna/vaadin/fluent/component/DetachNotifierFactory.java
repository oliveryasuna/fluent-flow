package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.DetachNotifier;
import com.vaadin.flow.shared.Registration;

public interface DetachNotifierFactory<T extends DetachNotifier, F extends DetachNotifierFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addDetachListener(final ComponentEventListener<DetachEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addDetachListener(listener));
  }

}
