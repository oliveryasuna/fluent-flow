package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.function.SerializableRunnable;

public class SubMenuFactory extends ComponentFactory<SubMenu, SubMenuFactory> implements ISubMenuFactory<SubMenu, SubMenuFactory> {

  public SubMenuFactory(final SubMenu subMenu) {
    super(subMenu);
  }

  public SubMenuFactory(final MenuItem parentMenuItem, final SerializableRunnable contentReset) {
    super(new SubMenu(parentMenuItem, contentReset));
  }

}
