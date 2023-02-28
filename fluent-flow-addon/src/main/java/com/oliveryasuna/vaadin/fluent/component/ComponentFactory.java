package com.oliveryasuna.vaadin.fluent.component;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.Component;

// TODO: This should be extended instead of ComponentFactory.
public class ComponentFactory<T extends Component, F extends ComponentFactory<T, F>> extends FluentFactory<T, F> implements IComponentFactory<T, F> {

  // Constructors
  //--------------------------------------------------

  public ComponentFactory(final T component) {
    super(component);
  }

}
