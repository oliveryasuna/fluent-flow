package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class FlexLayoutFactory extends FluentFactory<FlexLayout, FlexLayoutFactory> implements IFlexLayoutFactory<FlexLayout, FlexLayoutFactory> {

  public FlexLayoutFactory(final FlexLayout flexLayout) {
    super(flexLayout);
  }

  public FlexLayoutFactory() {
    super(new FlexLayout());
  }

  public FlexLayoutFactory(final Component... children) {
    super(new FlexLayout(children));
  }

}
