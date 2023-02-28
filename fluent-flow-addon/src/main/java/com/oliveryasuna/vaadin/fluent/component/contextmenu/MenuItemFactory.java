package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.function.SerializableRunnable;

public class MenuItemFactory extends ComponentFactory<MenuItem, MenuItemFactory> implements IFluentFactory<MenuItem, MenuItemFactory> {

  public MenuItemFactory(final MenuItem menuItem) {
    super(menuItem);
  }

  public MenuItemFactory(final ContextMenu contextMenu, final SerializableRunnable contentReset) {
    super(new MenuItem(contextMenu, contentReset));
  }

}
