package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.contextmenu.HasMenuItems;
import com.vaadin.flow.component.contextmenu.MenuItem;

public interface HasMenuItemsFactory<T extends HasMenuItems, F extends HasMenuItemsFactory<T, F>> extends IFluentFactory<T, F> {

  default ValueBreak<T, F, MenuItem> addItem(final String text, final ComponentEventListener<ClickEvent<MenuItem>> clickListener) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(text, clickListener));
  }

  default ValueBreak<T, F, MenuItem> addItem(final Component component, final ComponentEventListener<ClickEvent<MenuItem>> clickListener) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(component, clickListener));
  }

}
