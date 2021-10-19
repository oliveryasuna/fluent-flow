package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.FocusNotifier;
import com.vaadin.flow.component.FocusNotifier.FocusEvent;
import com.vaadin.flow.shared.Registration;

public interface FocusNotifierFactory<T extends FocusNotifier<C>, F extends FocusNotifierFactory<T, F, C>, C extends Component> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addFocusListener(final ComponentEventListener<FocusEvent<C>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addFocusListener(listener));
  }

}
