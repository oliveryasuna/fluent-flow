package com.oliveryasuna.vaadin.fluent.component.details;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.details.Details;

public class DetailsFactory extends FluentFactory<Details, DetailsFactory> implements IDetailsFactory<Details, DetailsFactory> {

  public DetailsFactory(final Details details) {
    super(details);
  }

  public DetailsFactory() {
    super(new Details());
  }

  public DetailsFactory(final String summary, final Component content) {
    super(new Details(summary, content));
  }

  public DetailsFactory(final Component summary, final Component content) {
    super(new Details(summary, content));
  }

}
