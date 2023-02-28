package com.oliveryasuna.vaadin.fluent.component.checkbox;

import com.oliveryasuna.vaadin.fluent.component.ComponentFactory;
import com.vaadin.flow.component.checkbox.CheckboxGroup;

public class CheckboxGroupFactory<T> extends ComponentFactory<CheckboxGroup<T>, CheckboxGroupFactory<T>>
    implements ICheckboxGroupFactory<CheckboxGroup<T>, CheckboxGroupFactory<T>, T> {

  public CheckboxGroupFactory(final CheckboxGroup<T> checkboxGroup) {
    super(checkboxGroup);
  }

  public CheckboxGroupFactory() {
    super(new CheckboxGroup<>());
  }

}
