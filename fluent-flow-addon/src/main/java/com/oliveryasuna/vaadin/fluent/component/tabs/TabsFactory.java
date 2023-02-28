package com.oliveryasuna.vaadin.fluent.component.tabs;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

public class TabsFactory extends ComponentFactory<Tabs, TabsFactory> implements ITabsFactory<Tabs, TabsFactory> {

  public TabsFactory(final Tabs tabs) {
    super(tabs);
  }

  public TabsFactory() {
    super(new Tabs());
  }

  public TabsFactory(final Tab... tabs) {
    super(new Tabs(tabs));
  }

  public TabsFactory(final boolean autoselect, final Tab... tabs) {
    super(new Tabs(autoselect, tabs));
  }

}
