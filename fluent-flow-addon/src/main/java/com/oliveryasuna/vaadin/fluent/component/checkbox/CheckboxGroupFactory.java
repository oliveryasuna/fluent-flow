package com.oliveryasuna.vaadin.fluent.component.checkbox;

import com.oliveryasuna.commons.language.fluent.FluentFactory;
import com.vaadin.flow.component.checkbox.CheckboxGroup;

@Deprecated
public class CheckboxGroupFactory<T> extends FluentFactory<CheckboxGroup<T>, CheckboxGroupFactory<T>>
    implements ICheckboxGroupFactory<CheckboxGroup<T>, CheckboxGroupFactory<T>, T> {

  public CheckboxGroupFactory(final CheckboxGroup<T> checkboxGroup) {
    super(checkboxGroup);
  }

  public CheckboxGroupFactory() {
    super(new CheckboxGroup<>());
  }

}
