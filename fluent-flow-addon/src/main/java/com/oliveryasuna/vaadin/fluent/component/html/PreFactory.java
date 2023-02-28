package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Pre;

public class PreFactory extends FluentFactory<Pre, PreFactory> implements IPreFactory<Pre, PreFactory> {

  public PreFactory(final Pre Pre) {
    super(Pre);
  }

  public PreFactory() {
    super(new Pre());
  }

  public PreFactory(final Component... components) {
    super(new Pre(components));
  }

  public PreFactory(final String text) {
    super(new Pre(text));
  }

}
