package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H1;

public class H1Factory extends FluentFactory<H1, H1Factory> implements IH1Factory<H1, H1Factory> {

  public H1Factory(final H1 h1) {
    super(h1);
  }

  public H1Factory() {
    super(new H1());
  }

  public H1Factory(final Component... components) {
    super(new H1(components));
  }

  public H1Factory(final String text) {
    super(new H1(text));
  }

}
