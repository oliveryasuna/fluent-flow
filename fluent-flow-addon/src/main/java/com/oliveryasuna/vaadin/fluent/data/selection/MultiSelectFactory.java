package com.oliveryasuna.vaadin.fluent.data.selection;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasValueAndElementFactory;
import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.data.selection.MultiSelect;
import com.vaadin.flow.data.selection.MultiSelectionListener;
import com.vaadin.flow.shared.Registration;

import java.util.Set;

public interface MultiSelectFactory<T extends MultiSelect<C, T2>, F extends MultiSelectFactory<T, F, C, T2>, C extends Component, T2>
    extends IFluentFactory<T, F>, HasValueAndElementFactory<T, F, ComponentValueChangeEvent<C, Set<T2>>, Set<T2>> {

  default F select(final T2... items) {
    get().select(items);

    return uncheckedThis();
  }

  default F deselect(final T2... items) {
    get().deselect(items);

    return uncheckedThis();
  }

  default F select(final Iterable<T2> items) {
    get().select(items);

    return uncheckedThis();
  }

  default F deselect(final Iterable<T2> items) {
    get().deselect(items);

    return uncheckedThis();
  }

  default F updateSelection(final Set<T2> addedItems, final Set<T2> removedItems) {
    get().updateSelection(addedItems, removedItems);

    return uncheckedThis();
  }

  default ValueBreak<T, F, Set<T2>> getSelectedItems() {
    return new ValueBreak<>(uncheckedThis(), get().getSelectedItems());
  }

  default F deselectAll() {
    get().deselectAll();

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isSelected(final T2 item) {
    return new BooleanValueBreak<>(uncheckedThis(), get().isSelected(item));
  }

  default ValueBreak<T, F, Registration> addSelectionListener(final MultiSelectionListener<C, T2> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addSelectionListener(listener));
  }

  @Override
  default ValueBreak<T, F, Set<T2>> getEmptyValue() {
    return new ValueBreak<>(uncheckedThis(), get().getEmptyValue());
  }

  @Override
  default ValueBreak<T, F, Set<T2>> getValue() {
    return new ValueBreak<>(uncheckedThis(), get().getValue());
  }

  @Override
  default F setValue(final Set<T2> value) {
    get().setValue(value);

    return uncheckedThis();
  }

}
