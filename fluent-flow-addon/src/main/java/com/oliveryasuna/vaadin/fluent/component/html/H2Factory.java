package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H2;

public class H2Factory extends ComponentFactory<H2, H2Factory> implements IH2Factory<H2, H2Factory> {

  public H2Factory(final H2 H2) {
    super(H2);
  }

  public H2Factory() {
    super(new H2());
  }

  public H2Factory(final Component... components) {
    super(new H2(components));
  }

  public H2Factory(final String text) {
    super(new H2(text));
  }

}
