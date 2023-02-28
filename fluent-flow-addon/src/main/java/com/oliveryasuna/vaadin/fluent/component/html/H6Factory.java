package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H6;

public class H6Factory extends ComponentFactory<H6, H6Factory> implements IH6Factory<H6, H6Factory> {

  public H6Factory(final H6 H6) {
    super(H6);
  }

  public H6Factory() {
    super(new H6());
  }

  public H6Factory(final Component... components) {
    super(new H6(components));
  }

  public H6Factory(final String text) {
    super(new H6(text));
  }

}
