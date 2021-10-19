package com.oliveryasuna.vaadin.fluent.component.contextmenu;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.function.SerializableRunnable;

public class SubMenuFactory extends FluentFactory<SubMenu, SubMenuFactory> implements ISubMenuFactory<SubMenu, SubMenuFactory> {

  public SubMenuFactory(final SubMenu subMenu) {
    super(subMenu);
  }

  public SubMenuFactory(final MenuItem parentMenuItem, final SerializableRunnable contentReset) {
    super(new SubMenu(parentMenuItem, contentReset));
  }

}
