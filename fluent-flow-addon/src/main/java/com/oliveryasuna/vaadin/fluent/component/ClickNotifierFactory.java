package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.*;
import com.vaadin.flow.shared.Registration;

public interface ClickNotifierFactory<T extends ClickNotifier<C>, F extends ClickNotifierFactory<T, F, C>, C extends Component> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Registration> addClickListener(final ComponentEventListener<ClickEvent<C>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addClickListener(listener));
  }

  default ValueBreak<T, F, ShortcutRegistration> addClickShortcut(final Key key, final KeyModifier... keyModifiers) {
    return new ValueBreak<>(uncheckedThis(), get().addClickShortcut(key, keyModifiers));
  }

}
