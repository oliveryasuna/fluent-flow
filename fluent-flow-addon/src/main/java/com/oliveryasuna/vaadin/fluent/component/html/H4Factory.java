package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H4;

public class H4Factory extends ComponentFactory<H4, H4Factory> implements IH4Factory<H4, H4Factory> {

  public H4Factory(final H4 H4) {
    super(H4);
  }

  public H4Factory() {
    super(new H4());
  }

  public H4Factory(final Component... components) {
    super(new H4(components));
  }

  public H4Factory(final String text) {
    super(new H4(text));
  }

}
