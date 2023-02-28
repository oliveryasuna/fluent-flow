package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Main;

public class MainFactory extends ComponentFactory<Main, MainFactory> implements IMainFactory<Main, MainFactory> {

  public MainFactory(final Main Main) {
    super(Main);
  }

  public MainFactory() {
    super(new Main());
  }

  public MainFactory(final Component... components) {
    super(new Main(components));
  }

}
