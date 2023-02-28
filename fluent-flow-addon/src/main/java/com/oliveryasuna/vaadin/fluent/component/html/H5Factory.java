package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H5;

public class H5Factory extends FluentFactory<H5, H5Factory> implements IH5Factory<H5, H5Factory> {

  public H5Factory(final H5 H5) {
    super(H5);
  }

  public H5Factory() {
    super(new H5());
  }

  public H5Factory(final Component... components) {
    super(new H5(components));
  }

  public H5Factory(final String text) {
    super(new H5(text));
  }

}
