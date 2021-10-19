package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasComponentsFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.GeneratedVaadinContextMenu.OpenedChangeEvent;
import com.vaadin.flow.component.contextmenu.MenuItemBase;
import com.vaadin.flow.component.contextmenu.SubMenuBase;
import com.vaadin.flow.shared.Registration;

import java.util.List;
import java.util.stream.Stream;

public interface IContextMenuBaseFactory<T extends ContextMenuBase<C, I, S>, F extends IContextMenuBaseFactory<T, F, C, I, S>,
    C extends ContextMenuBase<C, I, S>, I extends MenuItemBase<C, I, S>, S extends SubMenuBase<C, I, S>> extends IFluentFactory<T, F>,
    IGeneratedVaadinContextMenuFactory<T, F, C>, HasComponentsFactory<T, F> {

  default F setTarget(final Component target) {
    get().setTarget(target);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Component> getTarget() {
    return new ValueBreak<>(uncheckedThis(), get().getTarget());
  }

  default F setOpenOnClick(final boolean openOnClick) {
    get().setOpenOnClick(openOnClick);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isOpenOnClick() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpenOnClick());
  }

  // Protected override.
  default F close() {
    get().close();

    return uncheckedThis();
  }

  default ValueBreak<T, F, I> addItem(final String text) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(text));
  }

  default ValueBreak<T, F, I> addItem(final Component component) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(component));
  }

  @Override
  default F add(final Component... components) {
    get().add(components);

    return uncheckedThis();
  }

  @Override
  default F remove(final Component... components) {
    get().remove(components);

    return uncheckedThis();
  }

  @Override
  default F removeAll() {
    get().removeAll();

    return uncheckedThis();
  }

  @Override
  default F addComponentAtIndex(final int index, final Component component) {
    get().addComponentAtIndex(index, component);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Stream<Component>> getChildren() {
    return new ValueBreak<>(uncheckedThis(), get().getChildren());
  }

  default ValueBreak<T, F, List<I>> getItems() {
    return new ValueBreak<>(uncheckedThis(), get().getItems());
  }

  default BooleanValueBreak<T, F> isOpened() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isOpened());
  }

  // Protected override.
  default ValueBreak<T, F, Registration> addOpenedChangeListener(final ComponentEventListener<OpenedChangeEvent<C>> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addOpenedChangeListener(listener));
  }

}
