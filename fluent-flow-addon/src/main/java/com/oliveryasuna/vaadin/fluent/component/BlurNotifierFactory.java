package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.BlurNotifier.BlurEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.shared.Registration;

public interface BlurNotifierFactory<T extends BlurNotifier<C>, F extends BlurNotifierFactory<T, F, C>, C extends Component> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addBlurListener(final ComponentEventListener<BlurEvent<C>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addBlurListener(listener));
  }

}
