package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.IntValueBreak;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasOrderedComponents;

import java.util.function.Consumer;

/**
 * Technically, {@link HasOrderedComponents} does have a parameterized type, however it is never used.
 */
@SuppressWarnings("rawtypes")
public interface HasOrderedComponentsFactory<T extends HasOrderedComponents, F extends HasOrderedComponentsFactory<T, F>>
    extends IFluentFactory<T, F>, HasComponentsFactory<T, F> {

  // Not a native method.
  @SuppressWarnings("unchecked")
  default F forEach(final Consumer<Component> action) {
    if(action == null) return uncheckedThis();

    get().getChildren().forEach(action);

    return uncheckedThis();
  }

  // Not a native method.
  @SuppressWarnings("unchecked")
  default F forEachOrdered(final Consumer<Component> action) {
    if(action == null) return uncheckedThis();

    get().getChildren().forEachOrdered(action);

    return uncheckedThis();
  }

  default F replace(final Component oldComponent, final Component newComponent) {
    get().replace(oldComponent, newComponent);

    return uncheckedThis();
  }

  default IntValueBreak<T, F> indexOf(final Component component) {
    return new IntValueBreak<>(uncheckedThis(), get().indexOf(component));
  }

  default IntValueBreak<T, F> getComponentCount() {
    return new IntValueBreak<>(uncheckedThis(), get().getComponentCount());
  }

  default ValueBreak<T, F, Component> getComponentAt(final int index) {
    return new ValueBreak<>(uncheckedThis(), get().getComponentAt(index));
  }

}
