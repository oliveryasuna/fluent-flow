package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.component.InputNotifier;
import com.vaadin.flow.shared.Registration;

public interface InputNotifierFactory<T extends InputNotifier, F extends InputNotifierFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addInputListener(final ComponentEventListener<InputEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addInputListener(listener));
  }

}
