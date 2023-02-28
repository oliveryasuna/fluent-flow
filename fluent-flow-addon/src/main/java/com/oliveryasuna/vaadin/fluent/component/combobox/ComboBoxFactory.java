package com.oliveryasuna.vaadin.fluent.component.combobox;

import com.oliveryasuna.commons.language.pattern.fluent.FluentFactory;
import com.vaadin.flow.component.combobox.ComboBox;

import java.util.Collection;

public class ComboBoxFactory<T> extends FluentFactory<ComboBox<T>, ComboBoxFactory<T>> implements IComboBoxFactory<ComboBox<T>, ComboBoxFactory<T>, T> {

  public ComboBoxFactory(final ComboBox<T> comboBox) {
    super(comboBox);
  }

  public ComboBoxFactory(final int pageSize) {
    super(new ComboBox<>(pageSize));
  }

  public ComboBoxFactory() {
    super(new ComboBox<>());
  }

  public ComboBoxFactory(final String label) {
    super(new ComboBox<>(label));
  }

  public ComboBoxFactory(final String label, final Collection<T> items) {
    super(new ComboBox<>(label, items));
  }

  @SafeVarargs
  public ComboBoxFactory(final String label, final T... items) {
    super(new ComboBox<>(label, items));
  }

}
