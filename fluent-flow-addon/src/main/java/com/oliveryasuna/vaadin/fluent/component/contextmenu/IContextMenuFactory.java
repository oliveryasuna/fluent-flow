package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.pattern.fluent.breakdown.ValueBreak;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;

public interface IContextMenuFactory<T extends ContextMenu, F extends IContextMenuFactory<T, F>> extends IFluentFactory<T, F>,
    IContextMenuBaseFactory<T, F, ContextMenu, MenuItem, SubMenu>, HasMenuItemsFactory<T, F> {

  @Override
  default ValueBreak<T, F, MenuItem> addItem(final String text, final ComponentEventListener<ClickEvent<MenuItem>> clickListener) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(text, clickListener));
  }

  @Override
  default ValueBreak<T, F, MenuItem> addItem(final Component component, final ComponentEventListener<ClickEvent<MenuItem>> clickListener) {
    return new ValueBreak<>(uncheckedThis(), get().addItem(component, clickListener));
  }

}
