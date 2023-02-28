package com.oliveryasuna.vaadin.fluent.component.html;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.html.Hr;

public class HrFactory extends ComponentFactory<Hr, HrFactory> implements IHrFactory<Hr, HrFactory> {

  public HrFactory(final Hr hr) {
    super(hr);
  }

  public HrFactory() {
    super(new Hr());
  }

}
