package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H3;

public class H3Factory extends FluentFactory<H3, H3Factory> implements IH3Factory<H3, H3Factory> {

  public H3Factory(final H3 h3) {
    super(h3);
  }

  public H3Factory() {
    super(new H3());
  }

  public H3Factory(final Component... components) {
    super(new H3(components));
  }

  public H3Factory(final String text) {
    super(new H3(text));
  }

}
