package com.oliveryasuna.vaadin.fluent.component.orderedlayout;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class FlexLayoutFactory extends ComponentFactory<FlexLayout, FlexLayoutFactory> implements IFlexLayoutFactory<FlexLayout, FlexLayoutFactory> {

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
