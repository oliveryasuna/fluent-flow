package com.oliveryasuna.vaadin.fluent.component.tabs;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

public class TabsFactory extends FluentFactory<Tabs, TabsFactory> implements ITabsFactory<Tabs, TabsFactory> {

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
