package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.AttachNotifier;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.shared.Registration;

public interface AttachNotifierFactory<T extends AttachNotifier, F extends AttachNotifierFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addAttachListener(final ComponentEventListener<AttachEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addAttachListener(listener));
  }

}
