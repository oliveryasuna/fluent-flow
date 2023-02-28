package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;

public interface HasComponentsFactory<T extends HasComponents, F extends HasComponentsFactory<T, F>> extends IFluentFactory<T, F>, HasElementFactory<T, F>,
    HasEnabledFactory<T, F> {

  default F add(final Component... components) {
    get().add(components);

    return uncheckedThis();
  }

  default F add(final String text) {
    get().add(text);

    return uncheckedThis();
  }

  default F remove(final Component... components) {
    get().remove(components);

    return uncheckedThis();
  }

  default F removeAll() {
    get().removeAll();

    return uncheckedThis();
  }

  default F addComponentAtIndex(final int index, final Component component) {
    get().addComponentAtIndex(index, component);

    return uncheckedThis();
  }

  default F addComponentAsFirst(final Component component) {
    get().addComponentAsFirst(component);

    return uncheckedThis();
  }

}
