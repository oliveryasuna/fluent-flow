package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasHelper;

public interface HasHelperFactory<T extends HasHelper, F extends HasHelperFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F> {

  default ValueBreak<T, F, String> getHelperText() {
    return new ValueBreak<>(uncheckedThis(), get().getHelperText());
  }

  default F setHelperText(final String helperText) {
    get().setHelperText(helperText);

    return uncheckedThis();
  }

  default F setHelperComponent(final Component component) {
    get().setHelperComponent(component);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getHelperComponent() {
    return new ValueBreak<>(uncheckedThis(), get().getHelperComponent());
  }

}
