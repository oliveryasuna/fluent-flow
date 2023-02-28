package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Nav;

public class NavFactory extends ComponentFactory<Nav, NavFactory> implements INavFactory<Nav, NavFactory> {

  public NavFactory(final Nav nav) {
    super(nav);
  }

  public NavFactory() {
    super(new Nav());
  }

  public NavFactory(final Component... components) {
    super(new Nav(components));
  }

}
