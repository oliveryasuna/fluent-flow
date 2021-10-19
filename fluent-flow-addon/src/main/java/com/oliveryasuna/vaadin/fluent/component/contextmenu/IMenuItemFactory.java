package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.vaadin.fluent.component.ClickNotifierFactory;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;

public interface IMenuItemFactory<T extends MenuItem, F extends IMenuItemFactory<T, F>> extends IFluentFactory<T, F>,
    IMenuItemBaseFactory<T, F, ContextMenu, MenuItem, SubMenu>, ClickNotifierFactory<T, F, MenuItem> {

}
