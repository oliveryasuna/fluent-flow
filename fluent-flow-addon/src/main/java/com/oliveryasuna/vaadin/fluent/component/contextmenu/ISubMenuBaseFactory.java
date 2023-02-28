package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.MenuItemBase;
import com.vaadin.flow.component.contextmenu.SubMenuBase;

import java.util.List;
import java.util.stream.Stream;

public interface ISubMenuBaseFactory<T extends SubMenuBase<C, I, S>, F extends ISubMenuBaseFactory<T, F, C, I, S>, C extends ContextMenuBase<C, I, S>,
    I extends MenuItemBase<C, I, S>, S extends SubMenuBase<C, I, S>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, I> addItem(final String text) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(text));
  }

  default ValueBreak<T, F, I> addItem(final Component component) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(component));
  }

  default F add(final Component... components) {
    get().add(components);

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

  default ValueBreak<T, F, Stream<Component>> getChildren() {
    return new ValueBreak<>(uncheckedThis(), get().getChildren());
  }

  default ValueBreak<T, F, List<I>> getItems() {
    return new ValueBreak<>(uncheckedThis(), get().getItems());
  }

  default ValueBreak<T, F, I> getParentMenuItem() {
    return new ValueBreak<>(uncheckedThis(), get().getParentMenuItem());
  }

}
