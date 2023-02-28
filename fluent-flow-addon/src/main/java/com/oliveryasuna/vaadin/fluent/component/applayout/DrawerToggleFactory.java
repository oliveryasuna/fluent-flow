package com.oliveryasuna.vaadin.fluent.component.applayout;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.applayout.DrawerToggle;

public class DrawerToggleFactory extends ComponentFactory<DrawerToggle, DrawerToggleFactory> implements IDrawerToggleFactory<DrawerToggle, DrawerToggleFactory> {

  public DrawerToggleFactory(final DrawerToggle drawerToggle) {
    super(drawerToggle);
  }

  public DrawerToggleFactory() {
    super(new DrawerToggle());
  }

}
