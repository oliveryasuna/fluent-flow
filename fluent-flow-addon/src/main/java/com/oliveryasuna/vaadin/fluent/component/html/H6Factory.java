package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H6;

public class H6Factory extends FluentFactory<H6, H6Factory> implements IH6Factory<H6, H6Factory> {

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
