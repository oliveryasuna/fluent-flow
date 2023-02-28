package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Main;

public class MainFactory extends FluentFactory<Main, MainFactory> implements IMainFactory<Main, MainFactory> {

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
