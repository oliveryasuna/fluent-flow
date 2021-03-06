package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Emphasis;

public class EmphasisFactory extends FluentFactory<Emphasis, EmphasisFactory> implements IEmphasisFactory<Emphasis, EmphasisFactory> {

  public EmphasisFactory(final Emphasis Emphasis) {
    super(Emphasis);
  }

  public EmphasisFactory() {
    super(new Emphasis());
  }

  public EmphasisFactory(final Component... components) {
    super(new Emphasis(components));
  }

  public EmphasisFactory(final String text) {
    super(new Emphasis(text));
  }

}
