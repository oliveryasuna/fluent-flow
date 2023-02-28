package com.oliveryasuna.vaadin.fluent.component.checkbox;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.checkbox.Checkbox;

public class CheckboxFactory extends FluentFactory<Checkbox, CheckboxFactory> implements ICheckboxFactory<Checkbox, CheckboxFactory> {

  public CheckboxFactory(final Checkbox checkbox) {
    super(checkbox);
  }

  public CheckboxFactory() {
    super(new Checkbox());
  }

  public CheckboxFactory(final String labelText) {
    super(new Checkbox(labelText));
  }

  public CheckboxFactory(final boolean initialValue) {
    super(new Checkbox(initialValue));
  }

  public CheckboxFactory(final String labelText, final boolean initialValue) {
    super(new Checkbox(labelText, initialValue));
  }

  public CheckboxFactory(final String label, final ValueChangeListener<ComponentValueChangeEvent<Checkbox, Boolean>> listener) {
    super(new Checkbox(label, listener));
  }

}
