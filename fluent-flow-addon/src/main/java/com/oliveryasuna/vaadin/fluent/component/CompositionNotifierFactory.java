package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.*;
import com.vaadin.flow.shared.Registration;

public interface CompositionNotifierFactory<T extends CompositionNotifier, F extends CompositionNotifierFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addCompositionStartListener(final ComponentEventListener<CompositionStartEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addCompositionStartListener(listener));
  }

  default ValueBreak<T, F, Registration> addCompositionUpdateListener(final ComponentEventListener<CompositionUpdateEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addCompositionUpdateListener(listener));
  }

  default ValueBreak<T, F, Registration> addCompositionEndListener(final ComponentEventListener<CompositionEndEvent> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addCompositionEndListener(listener));
  }

}
