package com.oliveryasuna.vaadin.fluent.component.textfield;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasElementFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.textfield.HasPrefixAndSuffix;

public interface HasPrefixAndSuffixFactory<T extends HasPrefixAndSuffix, F extends HasPrefixAndSuffixFactory<T, F>> extends IFluentFactory<T, F>,
    HasElementFactory<T, F> {

  default F setPrefixComponent(final Component component) {
    get().setPrefixComponent(component);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getPrefixComponent() {
    return new ValueBreak<>(uncheckedThis(), get().getPrefixComponent());
  }

  default F setSuffixComponent(final Component component) {
    get().setSuffixComponent(component);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getSuffixComponent() {
    return new ValueBreak<>(uncheckedThis(), get().getSuffixComponent());
  }

}
