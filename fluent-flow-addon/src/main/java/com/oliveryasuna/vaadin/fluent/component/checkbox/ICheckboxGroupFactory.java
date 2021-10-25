package com.oliveryasuna.vaadin.fluent.component.checkbox;

import com.oliveryasuna.commons.language.fluent.IFluentFactory;
import com.oliveryasuna.commons.language.fluent.breakdown.BooleanValueBreak;
import com.oliveryasuna.commons.language.fluent.breakdown.ValueBreak;
import com.oliveryasuna.vaadin.fluent.component.HasHelperFactory;
import com.oliveryasuna.vaadin.fluent.component.HasSizeFactory;
import com.oliveryasuna.vaadin.fluent.component.HasValidationFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasDataProviderFactory;
import com.oliveryasuna.vaadin.fluent.data.binder.HasItemsAndComponentsFactory;
import com.oliveryasuna.vaadin.fluent.data.selection.MultiSelectFactory;
import com.vaadin.flow.component.ItemLabelGenerator;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.selection.MultiSelectionListener;
import com.vaadin.flow.function.SerializablePredicate;
import com.vaadin.flow.shared.Registration;

import java.util.Set;

// TODO: Review.

public interface ICheckboxGroupFactory<T extends CheckboxGroup<T2>, F extends ICheckboxGroupFactory<T, F, T2>, T2> extends IFluentFactory<T, F>,
    IGeneratedVaadinCheckboxGroupFactory<T, F, CheckboxGroup<T2>, Set<T2>>, HasItemsAndComponentsFactory<T, F, T2>, HasSizeFactory<T, F>,
    HasValidationFactory<T, F>, MultiSelectFactory<T, F, CheckboxGroup<T2>, T2>, HasDataProviderFactory<T, F, T2>, HasHelperFactory<T, F> {

  @Override
  default ValueBreak<T, F, Set<T2>> getEmptyValue() {
    return IGeneratedVaadinCheckboxGroupFactory.super.getEmptyValue();
  }

  @Override
  default ValueBreak<T, F, Set<T2>> getValue() {
    return IGeneratedVaadinCheckboxGroupFactory.super.getValue();
  }

  @Override
  default F setDataProvider(final DataProvider<T2, ?> dataProvider) {
    get().setDataProvider(dataProvider);

    return uncheckedThis();
  }

  @Override
  default F updateSelection(final Set<T2> addedItems, final Set<T2> removedItems) {
    get().updateSelection(addedItems, removedItems);

    return uncheckedThis();
  }

  @Override
  default F setValue(final Set<T2> value) {
    get().setValue(value);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, Set<T2>> getSelectedItems() {
    return new ValueBreak<>(uncheckedThis(), get().getSelectedItems());
  }

  @Override
  default ValueBreak<T, F, Registration> addSelectionListener(final MultiSelectionListener<CheckboxGroup<T2>, T2> listener) {
    return new ValueBreak<>(uncheckedThis(), get().addSelectionListener(listener));
  }

  default F onEnabledStateChanged(final boolean enabled) {
    get().onEnabledStateChanged(enabled);

    return uncheckedThis();
  }

  default F setReadOnly(final boolean readOnly) {
    get().setReadOnly(readOnly);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isReadOnly() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isReadOnly());
  }

  default ValueBreak<T, F, SerializablePredicate<T2>> getItemEnabledProvider() {
    return new ValueBreak<>(uncheckedThis(), get().getItemEnabledProvider());
  }

  default F setItemEnabledProvider(final SerializablePredicate<T2> itemEnabledProvider) {
    get().setItemEnabledProvider(itemEnabledProvider);

    return uncheckedThis();
  }

  default F setItemLabelGenerator(final ItemLabelGenerator<T2> itemLabelGenerator) {
    get().setItemLabelGenerator(itemLabelGenerator);

    return uncheckedThis();
  }

  default ValueBreak<T, F, ItemLabelGenerator<T2>> getItemLabelGenerator() {
    return new ValueBreak<>(uncheckedThis(), get().getItemLabelGenerator());
  }

  // Protected override.
  default F setLabel(final String label) {
    get().setLabel(label);

    return uncheckedThis();
  }

  default ValueBreak<T, F, String> getLabel() {
    return new ValueBreak<>(uncheckedThis(), get().getLabel());
  }

  @Override
  default F setErrorMessage(final String errorMessage) {
    get().setErrorMessage(errorMessage);

    return uncheckedThis();
  }

  @Override
  default ValueBreak<T, F, String> getErrorMessage() {
    return new ValueBreak<>(uncheckedThis(), get().getErrorMessage());
  }

  // Protected override.
  default F setRequired(final boolean required) {
    get().setRequired(required);

    return uncheckedThis();
  }

  default BooleanValueBreak<T, F> isRequired() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isRequired());
  }

  @Override
  default BooleanValueBreak<T, F> isInvalid() {
    return new BooleanValueBreak<>(uncheckedThis(), get().isInvalid());
  }

  @Override
  default F setInvalid(final boolean invalid) {
    get().setInvalid(invalid);

    return uncheckedThis();
  }

}
