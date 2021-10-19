package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class HorizontalLayoutFactory extends FluentFactory<HorizontalLayout, HorizontalLayoutFactory>
    implements IHorizontalLayoutFactory<HorizontalLayout, HorizontalLayoutFactory> {

  public HorizontalLayoutFactory(final HorizontalLayout horizontalLayout) {
    super(horizontalLayout);
  }

  public HorizontalLayoutFactory() {
    super(new HorizontalLayout());
  }

  public HorizontalLayoutFactory(final Component... children) {
    super(new HorizontalLayout(children));
  }

}
