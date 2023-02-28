package com.oliveryasuna.vaadin.fluent.component.tabs;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.tabs.Tab;

public class TabFactory extends ComponentFactory<Tab, TabFactory> implements ITabFactory<Tab, TabFactory> {

  public TabFactory(final Tab tab) {
    super(tab);
  }

  public TabFactory() {
    super(new Tab());
  }

  public TabFactory(final String label) {
    super(new Tab(label));
  }

  public TabFactory(final Component... components) {
    super(new Tab(components));
  }

}
