package com.oliveryasuna.vaadin.fluent.component.applayout;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.applayout.AppLayout;

public class AppLayoutFactory extends FluentFactory<AppLayout, AppLayoutFactory> implements IAppLayoutFactory<AppLayout, AppLayoutFactory> {

  public AppLayoutFactory(final AppLayout appLayout) {
    super(appLayout);
  }

  public AppLayoutFactory() {
    super(new AppLayout());
  }

}
