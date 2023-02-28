package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerticalLayoutFactory extends FluentFactory<VerticalLayout, VerticalLayoutFactory>
    implements IVerticalLayoutFactory<VerticalLayout, VerticalLayoutFactory> {

  public VerticalLayoutFactory(final VerticalLayout verticalLayout) {
    super(verticalLayout);
  }

  public VerticalLayoutFactory() {
    super(new VerticalLayout());
  }

  public VerticalLayoutFactory(final Component... children) {
    super(new VerticalLayout(children));
  }

}
