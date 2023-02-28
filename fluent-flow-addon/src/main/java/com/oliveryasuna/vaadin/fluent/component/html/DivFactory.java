package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

public class DivFactory extends FluentFactory<Div, DivFactory> implements IDivFactory<Div, DivFactory> {

  public DivFactory(final Div div) {
    super(div);
  }

  public DivFactory() {
    super(new Div());
  }

  public DivFactory(final Component... components) {
    super(new Div(components));
  }

}
