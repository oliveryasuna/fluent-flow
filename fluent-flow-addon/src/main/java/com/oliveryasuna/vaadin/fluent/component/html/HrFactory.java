package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.html.Hr;

public class HrFactory extends FluentFactory<Hr, HrFactory> implements IHrFactory<Hr, HrFactory> {

  public HrFactory(final Hr hr) {
    super(hr);
  }

  public HrFactory() {
    super(new Hr());
  }

}
