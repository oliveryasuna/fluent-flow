package com.oliveryasuna.vaadin.fluent.component.applayout;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.applayout.DrawerToggle;

public class DrawerToggleFactory extends FluentFactory<DrawerToggle, DrawerToggleFactory> implements IDrawerToggleFactory<DrawerToggle, DrawerToggleFactory> {

  public DrawerToggleFactory(final DrawerToggle drawerToggle) {
    super(drawerToggle);
  }

  public DrawerToggleFactory() {
    super(new DrawerToggle());
  }

}
