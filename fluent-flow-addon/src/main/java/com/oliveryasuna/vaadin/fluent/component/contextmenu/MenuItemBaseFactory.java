package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.MenuItemBase;
import com.vaadin.flow.component.contextmenu.SubMenuBase;

public abstract class MenuItemBaseFactory<C extends ContextMenuBase<C, I, S>, I extends MenuItemBase<C, I, S>, S extends SubMenuBase<C, I, S>>
    extends FluentFactory<MenuItemBase<C, I, S>, MenuItemBaseFactory<C, I, S>>
    implements IMenuItemBaseFactory<MenuItemBase<C, I, S>, MenuItemBaseFactory<C, I, S>, C, I, S> {

  public MenuItemBaseFactory(final MenuItemBase<C, I, S> menuItemBase) {
    super(menuItemBase);
  }

}
