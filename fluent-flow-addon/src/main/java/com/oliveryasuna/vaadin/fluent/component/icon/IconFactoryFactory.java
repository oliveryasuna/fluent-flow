package com.oliveryasuna.vaadin.fluent.component.icon;

// Squirrels are tasty.

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.IconFactory;

public interface IconFactoryFactory<T extends IconFactory, F extends IconFactoryFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, Icon> create() {
    return new ValueBreak<>(uncheckedThis(), get().create());
  }

}
