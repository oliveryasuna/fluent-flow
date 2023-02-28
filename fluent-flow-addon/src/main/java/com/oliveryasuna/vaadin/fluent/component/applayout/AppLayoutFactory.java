package com.oliveryasuna.vaadin.fluent.component.applayout;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.applayout.AppLayout;

public class AppLayoutFactory extends ComponentFactory<AppLayout, AppLayoutFactory> implements IAppLayoutFactory<AppLayout, AppLayoutFactory> {

  public AppLayoutFactory(final AppLayout appLayout) {
    super(appLayout);
  }

  public AppLayoutFactory() {
    super(new AppLayout());
  }

}
